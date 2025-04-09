package com.dalamilla.requestheader.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import io.micronaut.serde.annotation.Serdeable;

/**
 * Class for Micronaut serialization.
 *
 * @author dalamilla
 * @version 0.1.0
 */
@Serdeable
public class Whoami {
  private final String ipaddress;
  private final String language;
  private final String software;

  /**
   * Class Constructor.
   *
   * @param ipaddress The request remote address.
   * @param language The request header "user-agent".
   * @param software The request header "accept-language".
   */
  @JsonCreator
  public Whoami(String ipaddress, String language, String software) {
    this.ipaddress = ipaddress;
    this.language = language;
    this.software = software;
  }

  public String getIpaddress() {
    return ipaddress;
  }

  public String getLanguage() {
    return language;
  }

  public String getSoftware() {
    return software;
  }
}
