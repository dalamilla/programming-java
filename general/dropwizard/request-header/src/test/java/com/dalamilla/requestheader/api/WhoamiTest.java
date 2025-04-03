package com.dalamilla.requestheader.api;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import static io.dropwizard.jackson.Jackson.newObjectMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class WhoamiTest {
  private static final ObjectMapper MAPPER = newObjectMapper();

  @Test
  void seralizesToJSON() throws Exception {
    final Whoami whoami = new Whoami("127.0.0.1", "en-US", "Mozilla/5.0 (X11; Linux x86_64)");

    final String expected = MAPPER.writeValueAsString(
        MAPPER.readValue(getClass().getResource("/fixtures/whoami.json"), JsonNode.class));

    assertThat(MAPPER.writeValueAsString(whoami)).isEqualTo(expected);
  }
}
