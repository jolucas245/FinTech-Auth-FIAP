package fintech_java.finances.transaction.interfaces;
import java.time.LocalDate;

import fintech_java.finances.transaction.Transaction;

public interface Profit {
	void addProfit(Transaction transaction);
    void deleteProfit(Transaction transaction);
    void editProfit(Transaction transaction, double newNumValue, LocalDate newDateTransaction);
}
