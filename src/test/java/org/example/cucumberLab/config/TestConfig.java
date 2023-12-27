package org.example.cucumberLab.config;

import org.example.cucumberLab.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "org.example.cucumberLab")
public class TestConfig {

  @Bean
  public User user() {
    return User.builder()
        .name("Jack")
        .age(42)
        .build();
  }
}
