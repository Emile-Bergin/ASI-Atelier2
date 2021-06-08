package cpe.back.auth;

import fr.cpe.auth.model.LoginDTO;
import fr.cpe.user.UserRest;
import fr.cpe.user.model.UserDTO;

import java.util.Calendar;
import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import org.springframework.stereotype.Service;


@Service
public class AuthService {
    private final UserRest userClient;
    private String salt = "ornythorinque";
    private Algorithm algorithm = Algorithm.HMAC256(salt);

    public AuthService(UserRest userClient) {
        this.userClient = userClient;
    }

    public UserDTO signup(UserDTO user) {
        return userClient.saveUser(user);
    }

    public UserDTO login(LoginDTO loginDTO) {
        UserDTO user = userClient.login(loginDTO);
        user = setUserToken(user);
        return user;
    }

    private UserDTO setUserToken(UserDTO user) {
        String token = generateToken(user.getId(), user.getName(), user.getPassword());
        user.setToken(token);
        return this.userClient.saveUser(user);
    }

    private String generateToken(long id, String username, String password) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.DAY_OF_YEAR, 7);
            Date dateExpired = calendar.getTime();
            String token = JWT.create()
                .withIssuer("auth0")
                .withClaim("id", id)
                .withClaim("username", username)
                .withClaim("password", password)
                .withIssuedAt(new Date())
                .withExpiresAt(dateExpired)
                .sign(algorithm);

            return token;
        } catch (JWTCreationException exception){
            return null;
            //Invalid Signing configuration / Couldn't convert Claims.
        }
    }

    // private DecodedJWT decodeToken(String token) {
    //     try {
    //         JWTVerifier verifier = JWT.require(algorithm)
    //             .withIssuer("auth0")
    //             .build(); //Reusable verifier instance
    //         return verifier.verify(token);
    //     } catch (JWTVerificationException exception){
    //         //Invalid signature/claims
    //     }
    // }
}
