package com.dalamilla.requestheader.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.dalamilla.requestheader.model.Whoami;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;


/**
 * Tests for WhoamiController.
 */
@MicronautTest
public class WhoamiControllerTest {

  @Inject
  @Client("/")
  HttpClient client;

  @Test
  public void testapiWhoami() {
    HttpRequest<?> request = HttpRequest.GET("/api/whoami")
        .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64)")
        .header("accept-language", "en-US")
        .accept(MediaType.APPLICATION_JSON);

    HttpResponse<Whoami> response = client.toBlocking().exchange(request, Whoami.class);

    assertEquals(200, response.code());
    assertNotNull(response.body());
    assertEquals(
        "127.0.0.1",
        response.body().getIpaddress());
    assertEquals(
        "Mozilla/5.0 (X11; Linux x86_64)",
        response.body().getSoftware());
    assertEquals(
        "en-US",
        response.body().getLanguage());
  }
}
