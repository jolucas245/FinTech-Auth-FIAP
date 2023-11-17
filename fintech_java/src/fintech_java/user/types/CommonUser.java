package fintech_java.user.types;
import java.util.ArrayList;
import java.util.List;

import fintech_java.finances.balance.BalanceAccount;
import fintech_java.finances.balance.TotalBalance;
import fintech_java.user.User;
import fintech_java.user.invite.Invite; 

public class CommonUser extends User {
	
	private boolean is_invited;
	private int n_invite = 1;
	private Invite invite;
	private TotalBalance totalBalance;
	private List<BalanceAccount> balanceAccounts = new ArrayList<>();

	
	public CommonUser(String email, int password, String name, String telNumber, boolean isInvited, TotalBalance totalBalance) {
		super(email, password, name, telNumber);
		this.setIs_invited(isInvited);
	}


	public boolean isIs_invited() {
		return is_invited;
	}


	public void setIs_invited(boolean is_invited) {
		this.is_invited = is_invited;
	}


	public int getN_invite() {
		return n_invite;
	}


	public void setN_invite(int n_invite) {
		this.n_invite = n_invite;
	}


	public Invite getInvite() {
		return invite;
	}


	public void setInvite(Invite invite) {
		this.invite = invite;
	}


	public TotalBalance getTotalBalance() {
		return totalBalance;
	}


	public void setTotalBalance(TotalBalance totalBalance) {
		this.totalBalance = totalBalance;
	}
	
	public void addAccount(BalanceAccount account) {
        balanceAccounts.add(account);
    }

    public void editAccount(BalanceAccount account, String newName, double newValue) {
        account.setName(newName);
        account.setValue(newValue);
    }

    public void deleteAccount(BalanceAccount account) {
        balanceAccounts.remove(account);
    }

    public double calculateTotalBalance() {
        double total = 0.0;
        for (BalanceAccount account : balanceAccounts) {
            total += account.getValue();
        }
        return total;
    }
}
