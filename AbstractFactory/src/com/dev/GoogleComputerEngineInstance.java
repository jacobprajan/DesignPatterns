package com.dev;

// Represent a concrete product in a family "Google Cloud Platform"

public class GoogleComputerEngineInstance implements Instance {

	public GoogleComputerEngineInstance(Capacity capacity) {
		System.out.println("GoogleComputerEngineInstance created");
	}
	
	@Override
	public void start() {
		System.out.println("GoogleComputerEngineInstance started");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage + " to GoogleComputerEngineInstance");
	}

	@Override
	public void stop() {
		System.out.println("GoogleComputerEngineInstance stopped");
	}
	
	public String toString() {
		return "GoogleComputerEngineInstance";
	}

}
