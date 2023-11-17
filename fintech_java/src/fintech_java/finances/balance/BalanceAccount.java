package fintech_java.finances.balance;

public class BalanceAccount {
	private String name;
    private double value;
    
    public BalanceAccount(String name, double value) {
        this.setName(name);
        this.setValue(value);
    }

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
