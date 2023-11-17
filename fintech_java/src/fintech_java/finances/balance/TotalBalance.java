package fintech_java.finances.balance;

public class TotalBalance {
    private String id_balance;
    private String id_usuario;
    
    private double numBalance;
	
	public TotalBalance(String id_balance, String id_usuario, double numBalance) {
        super();
        this.id_balance = id_balance;
        this.id_usuario = id_usuario;
        this.numBalance = numBalance;
    }

    public TotalBalance(){
        super();
    }
    
    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    public double getBalance() {
        return numBalance;
    }
    
    public void setBalance(double numBalance) {
        this.numBalance = numBalance;
    }

    public String getId_balance() {
        return id_balance;
    }
    
    public void setId_balance(String id_balance) {
        this.id_balance = id_balance;
    }
}
