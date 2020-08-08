package com.chapter10;

public  class HourlyEmployee extends Employee {
	
	private double hourlyWage;
	private double hoursWorked;

	public HourlyEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double hourlyWage, double hoursWorked) {
		super( firstName,  lastName,  socialSecurityNumber);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		
		this.hoursWorked = hoursWorked;
	}
	
	public double getEarnings() {
		double earnings=0;
		if (hoursWorked <= 40) {
			earnings = hoursWorked * hourlyWage;
		}else if(hoursWorked > 40){
			earnings = 40 * hourlyWage+(hoursWorked-40) *hourlyWage*1.5; 
		}
		return earnings;
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	

}
