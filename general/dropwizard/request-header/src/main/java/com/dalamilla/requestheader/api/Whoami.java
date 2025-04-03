package com.dalamilla.requestheader.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class for Jackson serialization.
 *
 * @author dalamilla
 * @version 0.1.0
 */
public class Whoami {
  private String ipAddress;
  private String language;
  private String software;

  public Whoami() {
  }

  /**
   * Class Constructor.
   *
   * @param ipAddress The request remote address.
   * @param language The request header "user-agent".
   * @param software The request header "accept-language".
   */
  public Whoami(String ipAddress, String language, String software) {
    this.ipAddress = ipAddress;
    this.language = language;
    this.software = software;
  }

  @JsonProperty("ipaddress")
  public String getIpAdress() {
    return ipAddress;
  }

  @JsonProperty
  public String getLanguage() {
    return language;
  }

  @JsonProperty
  public String getSoftware() {
    return software;
  }
}
