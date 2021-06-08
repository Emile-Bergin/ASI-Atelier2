package cpe.back.user;

import fr.cpe.Lib.user.model.UserDTO;

public class UserMapping {

    public UserDTO toDTO(UserEntity user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setSurname(user.getSurname());
        userDTO.setPassword(user.getPassword());
        userDTO.setToken(user.getToken());
        userDTO.setWallet(user.getWallet());
        return userDTO;
    }

    public UserEntity toEntity(UserDTO user){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setName(user.getName());
        userEntity.setSurname(user.getSurname());
        userEntity.setPassword(user.getPassword());
        userEntity.setToken(user.getToken());
        userEntity.setWallet(user.getWallet());
        return userEntity;
    }
}
