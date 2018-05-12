package com.dev.builder2;

import java.time.LocalDate;

import com.dev.builder2.UserDTO2.UserDTOBuilder2;

//This is our client which also works as "director"
public class Client2 {

	public static void main(String[] args) {
		User2 user = createUser();
		//Client has to provide director with concrete builder
		UserDTO2 dto = directBuild(UserDTO2.getUserDTOBuilder2(), user);
		System.out.println(dto);
	}
	
	/**
	 * This method serves the role of director in builder pattern. 
	 */
	private static UserDTO2 directBuild(UserDTOBuilder2 builder, User2 user2) {
		return builder.withFirstName(user2.getFirstName()).withLastName(user2.getLastName())
			   .withAddress2(user2.getAddress2())
			   .withBirthday(user2.getBirthDay())
			   .build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User2 createUser() {
		User2 user = new User2();
		user.setBirthDay(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address2 address = new Address2();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipCode("47998");
		user.setAddress2(address);
		return user;
	}
}
