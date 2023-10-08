package com.navin.telusko;

import org.springframework.stereotype.Component;

@Component
public class Tire {
  private String brand;

  public Tire() {
    System.out.println("tire -> empty constructor");
  }

  public Tire(String brand) {
    System.out.println("tire -> parameterized constructor");
    this.brand = brand;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    System.out.println("tire -> set method brand");
    this.brand = brand;
  }

  @Override
  public String toString() {
    return "Tire{" +
        "brand='" + brand + '\'' +
        '}';
  }
}
