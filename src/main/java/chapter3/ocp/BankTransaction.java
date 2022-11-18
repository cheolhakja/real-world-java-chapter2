package chapter3.ocp;

public class BankTransaction {

    private int amount;
    private String month;

    public int getAmount() {
        return amount;
    }

    public String getMonth() {
        return month;
    }

    public BankTransaction(int amount, String month) {
        this.amount = amount;
        this.month = month;
    }

    public BankTransaction() {
    }

    public BankTransaction(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "amount=" + amount +
                ", month='" + month + '\'' +
                '}';
    }
}
