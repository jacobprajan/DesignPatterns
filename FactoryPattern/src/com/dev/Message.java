package com.dev;

public abstract class Message {

	public abstract String addMessage();
	
	public void addDefaultHeaders() {
		// Adds some default headers
	}
	
	public void encrypt() {
		// some code to encrypt content
	}
	
}
