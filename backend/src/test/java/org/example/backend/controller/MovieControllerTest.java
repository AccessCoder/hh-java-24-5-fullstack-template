package org.example.backend.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class MovieControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    void getMovie() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/movie"))
                .andExpect(MockMvcResultMatchers.content().string("Hello World"));
    }
}