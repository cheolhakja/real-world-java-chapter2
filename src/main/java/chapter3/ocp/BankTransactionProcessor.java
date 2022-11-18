package chapter3.ocp;

import java.util.ArrayList;
import java.util.List;

public class BankTransactionProcessor {

    public List<BankTransaction> findTransactionGreaterOrEqual(final int amount, final List<BankTransaction> list) {
        final List<BankTransaction> result = new ArrayList<>();
        for (BankTransaction bankTransaction : list) {
            if(bankTransaction.getAmount() >= amount) {
                result.add(bankTransaction);
            }
        }

        return result;
    }

    public List<BankTransaction> findTransactionBy(BankTransactionFilter bankTransactionFilter, final List<BankTransaction> list) {
        final List<BankTransaction> result = new ArrayList<>();
        for (BankTransaction bankTransaction : list) {
            if(bankTransactionFilter.test(bankTransaction)) {
                result.add(bankTransaction);
            }
        }

        return result;
    }
}
