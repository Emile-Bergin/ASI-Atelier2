package fr.cpe.auth;

import fr.cpe.user.model.UserDTO;

public interface AuthRest {
    UserDTO getUser(long cookie);
}
