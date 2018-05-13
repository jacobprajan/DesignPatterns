package com.dev.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees2 implements Cloneable {

	private List<String> empList;

	public Employees2() {
		empList = new ArrayList<String>();
	}

	public void loadData() {
		// read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}

	public List<String> getEmpList() {
		return empList;
	}

	// Notice that the clone method is overridden to provide a shallow copy of the
	// employees list.
	
	// Although a new Employees2 object will be created during shallow copy, both of
	// the objects will be pointing to same list collection.
	// So change in object list affects the other

	@Override
	public Object clone() throws CloneNotSupportedException {
		return (Employees2) super.clone();		
	}

}
