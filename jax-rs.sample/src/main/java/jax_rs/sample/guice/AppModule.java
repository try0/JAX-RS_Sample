package jax_rs.sample.guice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import jax_rs.sample.HelloService;
import jax_rs.sample.HelloServiceImpl;
import jax_rs.sample.ThrowableMapper;
import jax_rs.sample.HelloResource;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(HelloResource.class);

    bind(ThrowableMapper.class);
  }

  @Provides
  @Singleton
  public HelloService helloService() {
    return new HelloServiceImpl();
  }

}
