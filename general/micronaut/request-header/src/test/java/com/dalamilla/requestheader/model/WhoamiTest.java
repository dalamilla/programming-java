package com.dalamilla.requestheader.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.micronaut.serde.ObjectMapper;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import java.io.IOException;
import org.junit.jupiter.api.Test;

/**
 * Tests for Whoami.
 */
@MicronautTest
public class WhoamiTest {
  @Test
  void testWhoami(ObjectMapper objectMapper) throws IOException {
    String result = objectMapper
        .writeValueAsString(new Whoami("127.0.0.1", "en-US", "Mozilla/5.0 (X11; Linux x86_64)"));

    Whoami whoami = objectMapper.readValue(result, Whoami.class);

    assertNotNull(whoami);
    assertEquals("127.0.0.1", whoami.getIpaddress());
    assertEquals("en-US", whoami.getLanguage());
    assertEquals("Mozilla/5.0 (X11; Linux x86_64)", whoami.getSoftware());
  }
}
