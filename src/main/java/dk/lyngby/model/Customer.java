package dk.lyngby.model;

import lombok.Getter;

@Getter
public class Customer {

    private final String name;
    private final String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
