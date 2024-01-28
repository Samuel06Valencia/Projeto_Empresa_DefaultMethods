package model.services;

public interface ServiceGroup {
	
	double getTotalSalary();
	
	default Double salaryCalc(Double amount, int months, Double tax) {
		if(tax == null) {
			return amount * months;
		}
		else {
			return amount * months + (amount * tax);
		}
	}
	
}
