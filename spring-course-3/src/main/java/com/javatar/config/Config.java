package com.javatar.config;

import com.javatar.model.Address;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(name = "address")
    public Address getAddress(){
        return new Address("Valiasr Street", 500);
    }
}
