package com.pluralsight.conferencedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//tells springboot loader to run and configure the app as a springboot app
@SpringBootApplication
public class ConferenceDemoApplication {

  //main entry point to any application
  public static void main(String[] args) {
    SpringApplication.run(ConferenceDemoApplication.class, args);
  }

}
