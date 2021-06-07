package fr.cpe.Lib.auth;

import fr.cpe.Lib.user.model.UserDTO;

public interface AuthRest {
    UserDTO getUser(long cookie);
}
