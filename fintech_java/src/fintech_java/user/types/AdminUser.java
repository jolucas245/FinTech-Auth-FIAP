package fintech_java.user.types;

import fintech_java.user.User;

public class AdminUser extends User{
	public AdminUser(String email, int password, String name, String telNumber, boolean isAdmin) {
		super(email, password, name, telNumber);
		this.setAdmin(isAdmin);
	}

	private boolean isAdmin;
	

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
