package com.chapter10;

public class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public double getEarnings() {
		return weeklySalary;
	}


	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

	
	
	
	
	

}
