package dk.lyngby;

import dk.lyngby.model.*;

public class Main {
    public static void main(String[] args) {

        // Account 1
        Bank danskeBank = new Bank("Danske Bank");
        Customer steve = new Customer("Steve", "12345678");
        Account ay145 = new Account("AY-145", 1000);
        BaseAccount baseAccount = new BaseAccount(danskeBank, steve, ay145);

        // Account 2
        Bank nordea = new Bank("Nordea");
        Customer john = new Customer("John", "87654321");
        Account ay146 = new Account("AY-146", 1000);
        BaseAccount baseAccount2 = new BaseAccount(nordea, john, ay146);

        Transaction transaction = new Transaction(baseAccount, 500, baseAccount2);




    }
}