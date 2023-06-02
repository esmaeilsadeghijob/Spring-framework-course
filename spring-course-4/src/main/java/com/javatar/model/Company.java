package com.javatar.model;

import org.springframework.stereotype.Component;

@Component
public class Company {

    private Address address;

    public Company(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
