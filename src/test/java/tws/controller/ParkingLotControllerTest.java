package tws.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ParkingLotControllerTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    public void should_return_create_when_add_parkinglot() throws Exception{
        mockMvc.perform(post("/parkinglots").
                contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .content("{\"parkingLotID\":2,\"capacity\":1,\"availablePositionCount\":1,\"parkingId\":1}"))
                .andDo(print())
                .andExpect(status().isCreated());
    }
    @Test
    public void should_return_isOK_and_content_when_get_parkinglot() throws Exception {
        mockMvc.perform(get("/parkinglots"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string("[]"));
    }

}
