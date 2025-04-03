package com.dalamilla.requestheader.resources;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.dropwizard.testing.junit5.ResourceExtension;

import static org.assertj.core.api.Assertions.assertThat;

import org.glassfish.jersey.test.grizzly.GrizzlyWebTestContainerFactory;

@ExtendWith(DropwizardExtensionsSupport.class)
class WhoamiResourceTest {
  private static final ResourceExtension EXT = ResourceExtension.builder()
      .setTestContainerFactory(new GrizzlyWebTestContainerFactory())
      .addResource(new WhoamiResource())
      .build();

  @Test
  void testApiWhoami() {
    assertThat(EXT.target("/api/whoami")
        .request()
        .header("accept-language", "en-US")
        .get(String.class))
        .contains("Jersey");
  }
}
