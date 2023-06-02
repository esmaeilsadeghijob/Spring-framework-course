package com.javatar;

import com.javatar.config.Config;
import com.javatar.model.Address;
import com.javatar.model.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

//        ------------------------ in java ------------------------      //

//        Address address = new Address("Azadi Street", 500);
//        Company company = new Company(address);

//        ---------------------------------------------------------      //

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        Address adr1 = (Address) context.getBean("getAddress");
        Company company = context.getBean("company", Company.class);
        System.out.println("Valiasr Street".equals(company.getAddress().getStreet()));


    }

}
