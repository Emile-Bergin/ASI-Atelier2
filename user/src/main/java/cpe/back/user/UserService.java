package cpe.back.user;

import fr.cpe.Lib.auth.model.LoginDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

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

    public UserEntity getUser(long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User inexistant"));
    }

}
