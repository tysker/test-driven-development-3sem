package dk.lyngby.model;

import lombok.Getter;
@Getter
public class Transaction {

    private final BaseAccount source;
    private final BaseAccount target;
    private final double amount;
    private final double transactionFee = 0.01;

    public Transaction(BaseAccount source, double amount, BaseAccount target) {
        this.source = source;
        this.target = target;
        this.amount = amount;
    }
}
