package cpe.back.user;

import fr.cpe.auth.AuthRest;
import fr.cpe.auth.model.LoginDTO;
import fr.cpe.user.UserRest;
import fr.cpe.user.model.UserDTO;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServer implements UserRest {
    private UserService userService;
    private UserMapping userMapping;

    public UserServer(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO findUserById(String token) {
        return userMapping.toDTO(this.userService.getUserByToken(token));
    }

    @Override
    public UserDTO saveUser(UserDTO user) {
        UserEntity result = this.userService.SaveUser(userMapping.toEntity(user));
        return userMapping.toDTO(result);
    }

    @Override
    public UserDTO login(LoginDTO loginDTO) {
        UserEntity result = this.userService.login(loginDTO);
        return userMapping.toDTO(result);
    }

    @Override
    public Boolean setWallet(Long userId, Integer amount) {
        return this.userService.setWallet(userId,amount);
    }
}
