package com.navin.telusko;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

  public static void main(String... args) {
    /*
      BeanFactory or ApplicationContext
      Actually, It's better to use ApplicationContext in bigger applications, since
      It has more functionalities to use. Apart from this, Application Context is a
      superinterface of BeanFactory

      To instance an BeanFactory or ApplicationContext you can use the following:
      - ClassPathXmlApplicationContext: use a file configuration called spring.xml
        to declare beans
      - AnnotationConfigApplicationContext: use a class with @Configuration annotation
     */

//    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//    Vehicle vehicle = (Vehicle) context.getBean("car");
//    vehicle.drive();

//    Tire tire = (Tire) context.getBean("tire");
//    System.out.println(tire);

    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    Samsung s7 = context.getBean(Samsung.class);
    s7.config();

  }
}
