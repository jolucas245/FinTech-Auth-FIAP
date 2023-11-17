package fintech_java.finances.transaction.interfaces;
import java.time.LocalDate;

import fintech_java.finances.transaction.Transaction;

public interface Prejudice {
	void addPrejudice(Transaction transaction);
	void deletePrejudice(Transaction transaction);
	void editPrejudice(Transaction transaction, double newNumValue, LocalDate newDateTransaction);
}
