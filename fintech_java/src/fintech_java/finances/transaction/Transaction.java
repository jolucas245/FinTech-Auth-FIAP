package fintech_java.finances.transaction;
import java.time.LocalDate;

import fintech_java.finances.transaction.interfaces.Prejudice;
import fintech_java.finances.transaction.interfaces.Profit;

public class Transaction implements Profit, Prejudice{
	private double numValue;
    private LocalDate dateTransaction;

    public Transaction(double numValue, LocalDate dateTransaction) {
        this.setNumValue(numValue);
        this.setDateTransaction(dateTransaction);
    }

	public LocalDate getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(LocalDate dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public double getNumValue() {
		return numValue;
	}

	public void setNumValue(double numValue) {
		this.numValue = numValue;
	}

	@Override
	public void addProfit(Transaction transaction) {
		System.out.println("Adicionando lucro");		
	}

	@Override
	public void deleteProfit(Transaction transaction) {
		System.out.println("Deletando lucro");
	}

	@Override
	public void editProfit(Transaction transaction, double newNumValue, LocalDate newDateTransaction) {
		System.out.println("Editando lucro");
		
	}

	@Override
	public void addPrejudice(Transaction transaction) {
		System.out.println("Adicionando gasto");
		
	}

	@Override
	public void deletePrejudice(Transaction transaction) {
		System.out.println("Deletando gasto");
		
	}

	@Override
	public void editPrejudice(Transaction transaction, double newNumValue, LocalDate newDateTransaction) {
		System.out.println("Editando gasto");
	}
}
