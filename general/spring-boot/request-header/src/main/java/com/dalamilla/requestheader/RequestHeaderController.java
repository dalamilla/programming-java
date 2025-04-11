package com.dalamilla.requestheader;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class controller.
 *
 * @author dalamilla
 * @version 0.1.0
 */
@RestController
@RequestMapping("/api")
public class RequestHeaderController {

  /**
   * Get Method for RequestHeaderController.
   *
   * @param request The request information.
   * @return Whoami object.
   */
  @GetMapping("/whoami")
  public Whoami whoami(HttpServletRequest request) {
    String ip = request.getRemoteAddr();
    String language = request.getHeader("accept-language");
    String software = request.getHeader("user-agent");

    return new Whoami(ip, language, software);
  }
}
