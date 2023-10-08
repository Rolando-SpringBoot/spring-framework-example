package com.navin.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
@Qualifier -> allows you to select what subclass you would prefer
to get as instance.
 */
@Component
public class Samsung {

  @Qualifier("mediaTek")
  @Autowired
  MobileProcessor cpu;

  public MobileProcessor getCpu() {
    return cpu;
  }

  public void setCpu(MobileProcessor cpu) {
    this.cpu = cpu;
  }

  public void config() {
    System.out.println("Octa Core, 4 gb Ram, 12Mp camera");
    cpu.process();
  }

}
