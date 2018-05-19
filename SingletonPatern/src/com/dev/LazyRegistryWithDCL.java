package com.dev;

// This class demonstrates singleton using Double Checked Locking or "classic" singleton
// This is lazy initialisation

public class LazyRegistryWithDCL {

	private LazyRegistryWithDCL() {
		
	}
	
	// Volatile tells thread not to use cached values of this variable
	
	private static volatile LazyRegistryWithDCL INSTANCE;
	
	public static LazyRegistryWithDCL getInstance() {
		
		if(INSTANCE == null) {
			synchronized (LazyRegistryWithDCL.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistryWithDCL();
				}
			}
		}
		return INSTANCE;
	}
	
}
