package pl.zajecia.jenkinspipelinemw;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class JenkinsPipelineMwApplicationTest {
    @Autowired
    private MockMvc mockMVC;

    @Test
    void shouldReturnDefaultMessage() throws Exception {
        this.mockMVC.perform(MockMvcRequestBuilders.get("/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Jenkins - MW"));
    }
}
