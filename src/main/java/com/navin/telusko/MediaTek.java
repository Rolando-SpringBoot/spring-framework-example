package com.navin.telusko;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {
  @Override
  public void process() {
    System.out.println("second Best CPU");
  }

}
