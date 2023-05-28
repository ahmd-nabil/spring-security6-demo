package nabil.springsecuritydemo.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Ahmed Nabil
 */
@WebMvcTest(HelloWorldController.class)
@AutoConfigureMockMvc(addFilters = false)   // to disable security for those tests
class HelloWorldControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    HelloWorldController helloWorldController;

    @BeforeEach
    void setUp() {

    }

    @Test
    void testHello() throws Exception {
        mockMvc.perform(get(HelloWorldController.BASE_URL + "/hi"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello world"));
    }

    @Test
    void testBye() throws Exception {
        mockMvc.perform(get(HelloWorldController.BASE_URL+"/bye"))
                .andExpect(status().isOk())
                .andExpect(content().string("Bye Bye"));
    }
}