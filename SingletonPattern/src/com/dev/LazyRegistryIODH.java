package com.dev;

// Singleton using lazy initialisation holder class
// This ensures that we have a lazy initialisation without worrying about synchronisation
// This is the best approach

public class LazyRegistryIODH {

	private LazyRegistryIODH() {
		System.out.println("In LazyRegistryIODH singleton");
	}
	
	private static class RegistryHolder {
		static LazyRegistryIODH INSTANCE = new LazyRegistryIODH();
	}
	
	public static LazyRegistryIODH getInstance() {
		return RegistryHolder.INSTANCE;
	}
	
}
