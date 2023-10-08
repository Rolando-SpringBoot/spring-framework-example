package com.navin.telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
  We use Primary to indicate that MobileProcessor
  will prefer to get an instance of SnapDragon unless
  you use @qualifier annotation.
 */

@Component
@Primary
public class SnapDragon implements MobileProcessor {
  @Override
  public void process() {
    System.out.println("world best CPU");
  }

}
