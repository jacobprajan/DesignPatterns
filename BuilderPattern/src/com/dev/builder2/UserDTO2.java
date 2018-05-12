package com.dev.builder2;

import java.time.LocalDate;
import java.time.Period;

// Product class

public class UserDTO2 {

	private String name;
	private String address;
	private String age;
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDTO2 [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	//Get Builder Instance
	public static UserDTOBuilder2 getUserDTOBuilder2() {
		return new UserDTOBuilder2();
	}
	
	
	// Builder
	public static class UserDTOBuilder2 {
		
		private String firstName;
		private String lastName;
		private String age;
		private String address;
		
		private UserDTO2 userDTO2;
		
		public UserDTOBuilder2 withFirstName(String fname) {
			firstName = fname;
			return this;
		}
		
		public UserDTOBuilder2 withLastName(String lname) {
			lastName = lname;
			return this;
		}
		
		public UserDTOBuilder2 withBirthday(LocalDate date) {
			Period ageInYears = Period.between(date, LocalDate.now());
			age = Integer.toString(ageInYears.getYears());
			return this;
		}
		
		public UserDTOBuilder2 withAddress2(Address2 address2) {
			this.address = address2.getHouseNumber() + ", " + address2.getStreet() + "\n" + address2.getCity() + "\n"
					+ address2.getState() + " " + address2.getZipCode();
			return this;
		}
		
		public UserDTO2 build() {
			this.userDTO2 = new UserDTO2();
			userDTO2.setName(firstName + " " + lastName);
			userDTO2.setAddress(address);
			userDTO2.setAge(age);
			
			return this.userDTO2;
		}
		
		public UserDTO2 getUserDTO2() {
			return this.userDTO2;
		}

	}

}
