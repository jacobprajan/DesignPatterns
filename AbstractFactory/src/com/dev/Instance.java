package com.dev;

// Represents an abstract product

public interface Instance {

	enum Capacity {micro, small, large};
	
	public void start();
	
	public void attachStorage(Storage storage);
	
	public void stop();
	
}
