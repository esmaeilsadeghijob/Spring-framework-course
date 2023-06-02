package com.javatar.config;

import com.javatar.model.Address;
import com.javatar.model.Company;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(name = "address")
    public Address getAddress(){
        return new Address("Valiasr Street", 500);
    }
}
