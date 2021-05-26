package com.sp.service;

import com.sp.dto.LoginDTO;
import com.sp.model.UserEntity;
import com.sp.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository repo;

    @Test
    public void shouldNotGetUser() {
        // GIVEN
        LoginDTO loginDTO = new LoginDTO();

        // WHEN
        assertThrows(RuntimeException.class, ()->{this.userService.login(loginDTO);}  );
    }

    @Test
    public void shouldGetUser() {
        UserEntity userEntity = new UserEntity(1, "name", "surname", "password", "token",  100);

        // GIVEN
        when(repo.findByPasswordAndSurname(anyString(), anyString())).thenReturn(Optional.of(userEntity));
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setUsername("username");
        loginDTO.setPassword("password");

        // WHEN
        UserEntity login = this.userService.login(loginDTO);

        // THEN
        assertThat(login.getName()).isEqualTo("name");
    }
}
