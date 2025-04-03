package com.dalamilla.requestheader.resources;

import com.codahale.metrics.annotation.Timed;
import com.dalamilla.requestheader.api.Whoami;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;

/**
 * Class for Jersey resources.
 *
 * @author dalamilla
 * @version 0.1.0
 */
@Path("/api/whoami")
@Produces(MediaType.APPLICATION_JSON)
public class WhoamiResource {

  /**
   * Get Method for WhoamiResource.
   *
   * @param headers The http header information.
   * @param req     The request information.
   * @return Whoami object.
   */
  @GET
  @Timed
  public Whoami apiWhoami(@Context HttpHeaders headers, @Context HttpServletRequest req) {

    String agent = headers.getRequestHeader("user-agent").get(0);
    String language = headers.getRequestHeader("accept-language").get(0);
    String ip = req.getRemoteAddr();

    return new Whoami(ip, language, agent);
  }
}
