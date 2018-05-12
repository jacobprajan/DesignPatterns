package com.dev.builder;

public class Person {
	
	private String name;
	private String age;
	private String address;
	
	private Person() {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	private void setAge(String age) {
		this.age = age;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public static PersonBuilder getPersonBuilder() {
		return new PersonBuilder();
	}

	public static class PersonBuilder {
		
		private String name;
		private String age;
		private String address;
		
		private Person person;
		
		public PersonBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public PersonBuilder setAge(String age) {
			this.age = age;
			return this;
		}
		
		public PersonBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Person build() {
			this.person = new Person();
			person.setName(name);
			person.setAge(age);
			person.setAddress(address);
			return this.person;
		}
		
	}
	

}
