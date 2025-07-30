package com.dalamilla.requestheader;

import static org.assertj.core.api.Assertions.assertThat;

import io.dropwizard.testing.ResourceHelpers;
import io.dropwizard.testing.junit5.DropwizardAppExtension;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DropwizardExtensionsSupport.class)
class RequestHeaderAcceptanceTest {

  private static DropwizardAppExtension<RequestHeaderConfiguration> EXT
      = new DropwizardAppExtension<>(
          RequestHeaderApplication.class,
          ResourceHelpers.resourceFilePath("yaml/config.yaml"));

  @Test
  void apiWhoamiGet() {
    Client client = EXT.client();

    Response response = client.target(
        String.format("http://localhost:%d/api/whoami", EXT.getLocalPort()))
        .request()
        .header("accept-language", "en-US")
        .get();

    assertThat(response.readEntity(String.class).contains("Apache httpClient"));
    assertThat(response.getStatus()).isEqualTo(200);
  }

  @Test
  void apiWhoamiBrowserGet() {
    Client client = EXT.client();

    Response response = client.target(
        String.format("http://localhost:%d/api/whoami", EXT.getLocalPort()))
        .request()
        .header("user-agent", "Mozilla/5.0 (X11; Linux x86_64)")
        .header("accept-language", "en-US")
        .get();

    assertThat(response.readEntity(String.class).contains("Mozilla"));
    assertThat(response.getStatus()).isEqualTo(200);
  }
}
