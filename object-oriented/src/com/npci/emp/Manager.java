package com.npci.emp;

public class Manager extends Employee {
	private double commission;

	public Manager() {
		super();	// Calling default constructor of super class - its optional
	}

	public Manager(String empName, double salary, double commission) {
		// Calling constructor of super class
		super(empName, salary);
		this.commission = commission;
	}

	@Override
	public void payslip() {
		super.payslip();
		System.out.println("Commission: " + commission);
	}

	@Override
	public double getSalary() {
		return super.getSalary() + commission;
	}
}
