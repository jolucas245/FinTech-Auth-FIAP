package fintech_java.finances.goal;
import java.time.LocalDate;

import fintech_java.finances.balance.TotalBalance;
import fintech_java.user.User;

public class Goal {
	private String name;
    private String description;
    private double finalValue;
    private LocalDate endDate;
    private String status;
    private TotalBalance totalBalance;

    public Goal(String name, String description, double finalValue, LocalDate endDate, String status, TotalBalance totalBalance) {
        this.setName(name);
        this.setDescription(description);
        this.setFinalValue(finalValue);
        this.setEndDate(endDate);
        this.setStatus(status);
        this.totalBalance = totalBalance;
    }

    // Getters e Setters

    public void addGoal(User user) {
        user.addGoal(this);
    }

    public void deleteGoal(User user) {
        user.deleteGoal(this);
    }

    public void editGoal(User user, String newName, String newDescription, double newFinalValue, LocalDate newEndDate, String newStatus) {
        user.editGoal(this, newName, newDescription, newFinalValue, newEndDate, newStatus);
    }

    public static void getAllGoals(User user) {
        user.getAllGoals();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getFinalValue() {
		return finalValue;
	}

	public void setFinalValue(double finalValue) {
		this.finalValue = finalValue;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public boolean checkIfGoalAchieved() {
        return totalBalance.getBalance() >= finalValue;
    }

}
