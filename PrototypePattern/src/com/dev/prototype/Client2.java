package com.dev.prototype;

import java.util.List;

public class Client2 {


	public static void main(String[] args) throws CloneNotSupportedException {
		Employees2 emps = new Employees2();
		emps.loadData();

		// Use the clone method to get the Employee object
		Employees2 empsNew = (Employees2) emps.clone();
		Employees2 empsNew1 = (Employees2) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("John");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Pankaj");

		System.out.println("emps List: " + emps.getEmpList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}

}
