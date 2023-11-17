package fintech_java.user;
import java.util.ArrayList;
import java.util.List;

import fintech_java.finances.goal.Goal;
import fintech_java.user.invite.Invite;
import fintech_java.user.types.AdminUser;
import fintech_java.user.types.CommonUser;
import fintech_java.user.types.interfaces.Admin;
import fintech_java.user.types.interfaces.Common;

import java.time.LocalDate;

public class User implements Common, Admin{
	// Declaranção das variávels
	private String email;
	private int password;
	private String name;
	private String telNumber;

	
	// Instância da lista de usuários, simulando um banco de dados
	private static List<User> userList = new ArrayList<User>();
	
	// Construtor do User
	public User(String email, int password, String name, String telNumber) {
		this.setEmail(email);
		this.setPassword(password);
		this.setName(name);
		this.setTelNumber(telNumber);
		userList.add(this);
	}
	
	// Getters e Setters
	public void login() {
		System.out.println("Usuário " + getName() + " logado!");
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTelNumber() {
		return telNumber;
	}


	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	// Sobrescrita de métodos
	@Override
	public void deleteUser(String email) {
		if(getEmail().equals(email)) {
			System.out.println("Usuário " + getName() + " deletado.");
	    } else {
	        System.out.println("Usuário não encontrado com o email fornecido.");
	    }
	}

	@Override
	public void listUsers() {
		System.out.println("---- Listando os usuários ----");
		for(User user : userList) {
			System.out.println(user.getEmail());
		}
	}

	@Override
	public void addUser(AdminUser admin) {
		System.out.println("Admin criado");
	}

	@Override
	public void signUp(CommonUser commonUser, Invite invite) {
		if (commonUser.isIs_invited()) {
            commonUser.setInvite(invite);
            System.out.println("Usuário " + getEmail() + " adicionado. Convite #" + invite.getNumInvite() + " associado.");
        } else {
            System.out.println("Usuário " + getEmail() + " adicionado.");
        };
	}
	
	// Instância de uma lista de Metas
	private List<Goal> goals = new ArrayList<>();

	// criação dos métodos das metas
    public void addGoal(Goal goal) {
        goals.add(goal);
        System.out.println("Meta \"" + goal.getName() + "\" adicionada para o usuário " + getName());
    }

    public void deleteGoal(Goal goal) {
        goals.remove(goal);
        System.out.println("Meta \"" + goal.getName() + "\" removida para o usuário " + getName());
    }

    public void editGoal(Goal goal, String newName, String newDescription, double newFinalValue, LocalDate newEndDate, String newStatus) {
        goal.setName(newName);
        goal.setDescription(newDescription);
        goal.setFinalValue(newFinalValue);
        goal.setEndDate(newEndDate);
        goal.setStatus(newStatus);
        System.out.println("Meta \"" + goal.getName() + "\" editada para o usuário " + getName());
    }

    public void getAllGoals() {
        System.out.println("Metas para o usuário " + getName() + ":");
        for (Goal goal : goals) {
            System.out.println(goal.getName() + " - " + goal.getStatus());
        }
    }

}
