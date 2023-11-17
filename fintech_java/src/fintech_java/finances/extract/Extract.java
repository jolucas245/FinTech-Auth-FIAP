package fintech_java.finances.extract;
import java.util.ArrayList;
import java.util.List;

import fintech_java.finances.transaction.Transaction;

public class Extract {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
    	System.out.println("----- Transação adicionada -----");
        transactions.add(transaction);
    }

    public void getExtract() {
        for (Transaction transaction : transactions) {
            System.out.println("Valor: " + transaction.getNumValue() + ", Data: " + transaction.getDateTransaction());
        }
    }
}

