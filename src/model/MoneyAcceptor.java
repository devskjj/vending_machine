package model;

public class MoneyAcceptor extends PaymentMethod {
    private int amount;

    public MoneyAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
