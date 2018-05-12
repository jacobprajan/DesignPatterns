package com.dev;

public class Client {

	// Use factory method pattern when you want to delegate object instantiation
	// to subclasses
	
	public static void main(String[] args) {
		
		printMessage(new JSONMessageCreator());
		
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator messageCreator) {
		
		Message msg = messageCreator.getMessage();
		System.out.println(msg);
	}
	
}
