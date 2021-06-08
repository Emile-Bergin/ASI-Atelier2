package fr.cpe.Lib.user;

import fr.cpe.Lib.auth.model.LoginDTO;
import fr.cpe.Lib.user.model.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "microservice-user", url = "http://user:8080/")
public interface UserRest {

    @GetMapping("/api/user")
    UserDTO findUserById(@CookieValue("session") long cookie);

    @PostMapping("/api/user")
    UserDTO saveUser(UserDTO user);

    @PostMapping("/api/user/login")
    UserDTO login(LoginDTO loginDTO);

    @PostMapping("/api/user/wallet")
    Boolean setWallet(Long userId, Integer amount);
}
