package org.hexagonal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.hexagonal.openapi.model.PersonResponse;
import org.hexagonal.person.controller.PersonController;
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
class PersonControllerTest {

    @InjectMocks
    private PersonController underTest;

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
                .perform(MockMvcRequestBuilders.get("/multimodule-hexagonal/person"));

        final PersonResponse result = objectMapper.readValue(
                mvcResult.andReturn().getResponse().getContentAsString(), PersonResponse.class);

        assertThat(result.getId()).isEqualTo(1);
        assertThat(result.getName()).hasToString("Luis");

    }
}