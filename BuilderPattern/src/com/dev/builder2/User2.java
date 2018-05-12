package com.dev.builder2;

import java.time.LocalDate;

// Entity class used to construct DTO
public class User2 {
	
	private String firstName;
	private String lastName;
	private LocalDate birthDay;
	private Address2 address2;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public Address2 getAddress2() {
		return address2;
	}
	public void setAddress2(Address2 address2) {
		this.address2 = address2;
	}
	
}
