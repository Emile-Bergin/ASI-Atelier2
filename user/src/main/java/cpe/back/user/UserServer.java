package cpe.back.user;

import fr.cpe.Lib.auth.AuthRest;
import fr.cpe.Lib.auth.model.LoginDTO;
import fr.cpe.Lib.user.UserRest;
import fr.cpe.Lib.user.model.UserDTO;

public class UserServer implements UserRest {
    private UserService userService;

    public UserServer(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO findUserById(long cookie) {
        return this.userService.getUser(cookie).toDTO();
    }

    @Override
    public UserDTO saveUser(UserDTO user) {
        return null;
    }

    @Override
    public UserDTO login(LoginDTO loginDTO) {
        return null;
    }
}
