package com.dev;

// An object adapter. Using composition to translate interface
// Object Adapter is preferred way 

public class EmployeeObjectAdapter implements Customer {

	private Employee employee;
	
	public EmployeeObjectAdapter(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public String getName() {
		return employee.getFullName();
	}

	@Override
	public String getDesignation() {
		return employee.getJobTitle();
	}

	@Override
	public String getAddress() {
		return employee.getOfficeLocation();
	}
	
}
