package fintech_java.user.types.interfaces;

import fintech_java.user.types.AdminUser;

public interface Admin{
	void listUsers();
	void addUser(AdminUser admin);
	void deleteUser(String user);
}
