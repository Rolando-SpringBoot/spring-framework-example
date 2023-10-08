package com.navin.telusko;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

  public void drive() {
    System.out.println("driving bike");
  }

}
