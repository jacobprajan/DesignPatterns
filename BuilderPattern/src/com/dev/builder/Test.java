package com.dev.builder;

public class Test {

	
	public static void main(String[] args) {		
		
		Person person1 = Person.getPersonBuilder().setName("John").setAge("10").build();
	
		Person person2 = Person.getPersonBuilder().setName("Max").setAddress("Harrow").build();

		System.out.println(person1);
		
		System.out.println(person2);
		
	}
}
