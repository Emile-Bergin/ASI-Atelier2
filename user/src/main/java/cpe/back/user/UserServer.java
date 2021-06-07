package cpe.back.user;

import fr.cpe.Lib.auth.model.LoginDTO;
import fr.cpe.Lib.user.UserRest;
import fr.cpe.Lib.user.model.UserDTO;

public class UserServer implements UserRest {

    @Override
    public UserDTO findUserById(long cookie) {
        return null;
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
