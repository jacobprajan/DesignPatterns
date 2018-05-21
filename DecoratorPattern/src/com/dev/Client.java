package com.dev;

// Add commons-lang3-3.1.jar and commons-text-1.3.jar to classpath

public class Client {
	
	public static void main(String[] args) {
		
		Message m = new TextMessage("Hello <World>");		
		System.out.println(m.getContent());
		
		System.out.println("=================================");
		
		Message decorator = new HtmlEncodedMessage(m);		
		System.out.println(decorator.getContent());
		
		System.out.println("=================================");

		Message decorator2 = new Bse64EncodedMessage(m);		
		System.out.println(decorator2.getContent());
		
	}

}
