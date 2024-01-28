package model.services;

public class Employee implements ServiceGroup {
	//Classe Funcionário
	private String name;
	private int workedMonths;
	private Double salary;
	
	public Employee(String name, int workedMonths, Double salary) {
		this.name = name;
		this.workedMonths = workedMonths;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkedMonths() {
		return workedMonths;
	}

	public void setWorkedMonths(int workedMonths) {
		this.workedMonths = workedMonths;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public double getTotalSalary() {
		return getSalary();
	}
	
	
}
