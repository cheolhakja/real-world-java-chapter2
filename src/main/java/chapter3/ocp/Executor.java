package chapter3.ocp;

import java.util.Arrays;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        BankTransactionProcessor bankTransactionProcessor = new BankTransactionProcessor();

        List<BankTransaction> transactionList = bankTransactionProcessor.findTransactionBy(new BankTransactionFilter() {
            @Override
            public boolean test(BankTransaction bankTransaction) {
                if(bankTransaction.getAmount() >= 10000) {
                    return true;
                }

                return false;
            }
        }, Arrays.asList());


    }
}
