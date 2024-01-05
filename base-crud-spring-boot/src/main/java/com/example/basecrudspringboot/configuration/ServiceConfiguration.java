package com.example.basecrudspringboot.configuration;

import com.example.basecrudspringboot.repository.UserRepository;
import com.example.basecrudspringboot.service.UserService;
import com.example.basecrudspringboot.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class ServiceConfiguration {
  @Bean
  public UserService userService(UserRepository repository) {
    return new UserServiceImpl(repository);
  }
}
