package com.sp.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sp.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    static {
        System.setProperty("spring.config.location", "classpath:application.properties");
    }

    @Test
    void tryToGetUserTest() throws Exception {
        mockMvc.perform(
                get("/api/user/TEST")
        ).andExpect(status().is4xxClientError());
    }

    @Test
    void getUserTest() throws Exception {
        mockMvc.perform(
                get("/api/user/3")
        ).andExpect(status().isOk());
    }
}
