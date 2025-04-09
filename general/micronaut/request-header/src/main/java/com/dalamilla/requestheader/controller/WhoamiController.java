package com.dalamilla.requestheader.controller;

import com.dalamilla.requestheader.model.Whoami;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.server.util.HttpClientAddressResolver;

/**
 * Class controller.
 *
 * @author dalamilla
 * @version 0.1.0
 */
@Controller("/api")
public class WhoamiController {
  private final HttpClientAddressResolver httpClientAddressResolver;

  public WhoamiController(HttpClientAddressResolver httpClientAddressResolver) {
    this.httpClientAddressResolver = httpClientAddressResolver;
  }

  /**
   * Get Method for WhoamiController.
   *
   * @param headers The http header information.
   * @param request The request information.
   * @return Whoami object.
   */
  @Get("whoami")
  public Whoami apiWhoami(HttpHeaders headers, HttpRequest<?> request) {
    String software = headers.get("user-agent");
    String language = headers.get("accept-language");
    String ip = httpClientAddressResolver.resolve(request);

    return new Whoami(ip, language, software);
  }
}
