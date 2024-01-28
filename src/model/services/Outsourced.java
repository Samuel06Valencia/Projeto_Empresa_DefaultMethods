package model.services;

public class Outsourced implements ServiceGroup {
	//Classe Tercerizado
	private String name;
	private int workedMonths;
	private Double salary;
	private Double tax;
	
	public Outsourced(String name, int workedMonths, Double salary, Double tax) {
		this.name = name;
		this.workedMonths = workedMonths;
		this.salary = salary;
		this.tax = tax;
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
	
	
	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public double getTotalSalary() {
		return getSalary();
	}
	
	
}
