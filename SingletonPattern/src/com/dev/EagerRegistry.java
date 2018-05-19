package com.dev;

// This class uses eager initialisation of singleton instance

public class EagerRegistry {

	private EagerRegistry() {
		
	}
	
	private static final EagerRegistry INSTANCE = new EagerRegistry();
	
	public static EagerRegistry getInstance() {
		return INSTANCE;
	}
	
}
