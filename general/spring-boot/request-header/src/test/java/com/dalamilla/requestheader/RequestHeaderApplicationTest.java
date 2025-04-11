package com.dalamilla.requestheader;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class RequestHeaderApplicationTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void testRequestHeader() throws Exception {
    this.mockMvc.perform(get("/api/whoami")
      .header("accept-language", "en-US")
      .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64)")
      .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.ipaddress").value("127.0.0.1"))
        .andExpect(jsonPath("$.language").value("en-US"))
        .andExpect(jsonPath("$.software").value("Mozilla/5.0 (X11; Linux x86_64)"));

  }
}
