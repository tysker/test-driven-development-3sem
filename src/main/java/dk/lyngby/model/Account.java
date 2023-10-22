package dk.lyngby.model;

import lombok.Getter;

@Getter
public class Account {

    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


}
