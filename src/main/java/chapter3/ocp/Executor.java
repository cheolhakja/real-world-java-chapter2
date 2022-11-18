package chapter3.ocp;

import java.util.Arrays;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        BankTransactionProcessor bankTransactionProcessor = new BankTransactionProcessor();
        List<BankTransaction> bankTransactionList = Arrays.asList(new BankTransaction(100000), new BankTransaction(1000), new BankTransaction(100));

        List<BankTransaction> transactionList = bankTransactionProcessor.findTransactionBy(new BankTransactionFilter() {
            @Override
            public boolean test(BankTransaction bankTransaction) {
                if(bankTransaction.getAmount() >= 10000) {
                    return true;
                }

                return false;
            }
        }, bankTransactionList);


        List<BankTransaction> transactionList2 = bankTransactionProcessor.findTransactionBy(
                bankTransaction -> {
                    if(bankTransaction.getAmount() >= 10000) {
                        return true;
                    }

                    return false;
                }, bankTransactionList);

        for (BankTransaction bankTransaction : transactionList2) {
            System.out.println("bankTransaction.toString() = " + bankTransaction.toString());
        }
    }
}
