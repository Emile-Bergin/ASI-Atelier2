package fr.cpe.user;

import fr.cpe.auth.model.LoginDTO;
import fr.cpe.user.model.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "microservice-user", url = "http://user:8085/")
public interface UserRest {

    @GetMapping("/api/user")
    UserDTO findUserById(@CookieValue("token") String token);

    @PostMapping("/api/user")
    UserDTO saveUser(UserDTO user);

    @PostMapping("/api/user/login")
    UserDTO login(LoginDTO loginDTO);

    @PostMapping("/api/users/{userId}/wallets")
    Boolean setWallet(@PathVariable("userId") Long userId, @RequestBody Integer amount);
}
