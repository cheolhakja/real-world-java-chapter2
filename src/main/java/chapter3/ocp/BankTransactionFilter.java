package chapter3.ocp;

@FunctionalInterface
public interface BankTransactionFilter {

    boolean test(BankTransaction bankTransaction);
    //함수를 파라미터로 넘길 수 있다. 일급함수.
}
