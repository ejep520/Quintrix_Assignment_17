package com.quintrix.jepsen.erik.seventeenth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SeventeenthApplication {

  public static void main(String[] args) {
    SpringApplication.run(SeventeenthApplication.class, args);
  }
}
