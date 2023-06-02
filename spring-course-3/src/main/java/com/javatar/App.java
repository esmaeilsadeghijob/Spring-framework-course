package com.javatar;

import com.javatar.config.Config;
import com.javatar.model.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Address adr1 = (Address) context.getBean("getAddress");
        Address adr1 = (Address) context.getBean("address");
        adr1.setNumber(1000);
        System.out.println(adr1.getNumber());

        Address adr2 = (Address) context.getBean("address");
        System.out.println(adr2.getNumber());


    }

}
