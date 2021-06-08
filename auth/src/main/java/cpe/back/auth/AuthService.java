package cpe.back.auth;

import fr.cpe.auth.model.LoginDTO;
import fr.cpe.user.UserRest;
import fr.cpe.user.model.UserDTO;
import org.springframework.stereotype.Service;


@Service
public class AuthService {
    private final UserRest userClient;

    public AuthService(UserRest userClient) {
        this.userClient = userClient;
    }

    public UserDTO signup(UserDTO user) {
        return userClient.saveUser(user);
    }

    public UserDTO login(LoginDTO loginDTO) {
        return userClient.login(loginDTO);
    }
}
