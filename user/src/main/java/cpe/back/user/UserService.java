package cpe.back.user;

import fr.cpe.auth.model.LoginDTO;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private String salt = "ornythorinque";
    private Algorithm algorithm = Algorithm.HMAC256(salt);

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity SaveUser(UserEntity u) {
        return userRepository.saveAndFlush(u);

    }

    public UserEntity login(LoginDTO loginDTO) {
        return userRepository.findByPasswordAndSurname(loginDTO.getPassword(), loginDTO.getUsername())
                .orElseThrow(() -> new RuntimeException("Pas de user"));
    }

    public UserEntity getUserByToken(String token) {
        DecodedJWT jwt = decodeToken(token);
        long id = jwt.getClaim("id").asLong();
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User inexistant"));
    }

    public boolean setWallet(Long userId, Integer amount) {
        UserEntity user = userRepository.getById(userId);
        userRepository.setWallet(user.getId(), user.getWallet()+amount);
        return true;
    }

    private DecodedJWT decodeToken(String token) {
        try {
            JWTVerifier verifier = JWT.require(algorithm)
                .withIssuer("auth0")
                .build(); //Reusable verifier instance
            return verifier.verify(token);
        } catch (JWTVerificationException exception){
            //Invalid signature/claims
            return null;
        }
    }
}
