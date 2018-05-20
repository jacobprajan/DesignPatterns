package com.dev;

public class Main {

	public static void main(String[] args) {
		
		// Using class adapter
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesinger designer = new BusinessCardDesinger();
		String card = designer.designCard(adapter);
		
		System.out.println(card);
		
		System.out.println("===========================================");
		
		// Using object adapter (more preferred)
		
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objAdapter = new EmployeeObjectAdapter(employee);
		String cardNew = designer.designCard(adapter);
		
		System.out.println(cardNew);
		
	}
	
	// We can pass adapter here as well instead of Employee
	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Max Clark");
		employee.setJobTitle("Scientist");
		employee.setOfficeLocation("Oxford circus, London");
	}
	
}
