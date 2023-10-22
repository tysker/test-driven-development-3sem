package dk.lyngby.model;

import lombok.Getter;

import java.util.LinkedHashSet;

@Getter
public class BaseAccount {
    private final Bank bank;
    private final Customer customer;
    private final String accountNumber;
    private final Account account;
    private final LinkedHashSet<Transaction> transactions = new LinkedHashSet<>();

    public BaseAccount(Bank bank, Customer customer, Account account) {
        this.bank = bank;
        this.customer = customer;
        this.accountNumber = account.getAccountNumber();
        this.account = account;
    }
}
