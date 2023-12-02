package org.hexagonal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.hexagonal.openapi.model.PlayerResponse;
import org.hexagonal.player.controller.PlayerController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class PlayerControllerTest {

    @InjectMocks
    private PlayerController underTest;

    private final ObjectMapper objectMapper = new ObjectMapper();

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        objectMapper.registerModule(new JavaTimeModule());
        mockMvc = MockMvcBuilders.standaloneSetup(underTest).build();
    }

    @Test
    @Disabled
    void personTest() throws Exception {

        final ResultActions mvcResult = mockMvc
                .perform(MockMvcRequestBuilders.get("/multimodule-hexagonal/player"));

        final PlayerResponse result = objectMapper.readValue(
                mvcResult.andReturn().getResponse().getContentAsString(), PlayerResponse.class);

        //assertThat(result.getId()).isEqualTo(1);
        assertThat(result.getName()).hasToString("Luis");

    }
}