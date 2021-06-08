package cpe.back.user;

import fr.cpe.Lib.auth.AuthRest;
import fr.cpe.Lib.auth.model.LoginDTO;
import fr.cpe.Lib.user.UserRest;
import fr.cpe.Lib.user.model.UserDTO;

public class UserServer implements UserRest {
    private UserService userService;
    private UserMapping userMapping;

    public UserServer(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO findUserById(long cookie) {
        return userMapping.toDTO(this.userService.getUser(cookie));
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
