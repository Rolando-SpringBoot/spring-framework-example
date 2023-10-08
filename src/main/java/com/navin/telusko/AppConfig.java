package com.navin.telusko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
  @Bean -> We can create beans using @bean annotation
  @ComponentScan -> Allows you to use stereotype annotations
  to define beans
 */
@Configuration
@ComponentScan(basePackages = "com.navin.telusko")
public class AppConfig {
//  @Bean
//  public Samsung getPhone() {
//    return new Samsung();
//  }

//  @Bean
//  public MobileProcessor getProcessor() {
//    return new SnapDragon();
//  }

}
