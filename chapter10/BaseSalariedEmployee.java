package com.chapter10;

public class BaseSalariedEmployee extends Employee{
	
	
	private double baseSalary;
	private double commissionRate;
	private double grossSales;
	
	public BaseSalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
			 double baseSalary, double commissionRate, double grossSales) {
		super(firstName, lastName, socialSecurityNumber);
		this.baseSalary = baseSalary;
		this.commissionRate = commissionRate;
		this.grossSales = grossSales;
	}
		
	
	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public double getEarnings() {
		return (commissionRate * grossSales) + baseSalary;
	}


	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	


}
