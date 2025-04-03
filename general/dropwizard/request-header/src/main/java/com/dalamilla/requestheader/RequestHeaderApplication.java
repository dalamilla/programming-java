package com.dalamilla.requestheader;

import com.dalamilla.requestheader.resources.WhoamiResource;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

/**
 * Class for extension of Dropwizard application.
 *
 * @author dalamilla
 * @version 0.1.0
 */
public class RequestHeaderApplication extends Application<RequestHeaderConfiguration> {

  public static void main(final String[] args) throws Exception {
    new RequestHeaderApplication().run(args);
  }

  @Override
  public String getName() {
    return "request-header";
  }

  @Override
  public void initialize(final Bootstrap<RequestHeaderConfiguration> bootstrap) {
  }

  @Override
  public void run(final RequestHeaderConfiguration configuration,
      final Environment environment) {
    WhoamiResource whoamiResource = new WhoamiResource();
    environment.jersey().register(whoamiResource);
  }
}
