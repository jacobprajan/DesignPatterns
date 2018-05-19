package com.dev;

public class Client {

	public static void main(String[] args) {

		EagerRegistry instance1 = EagerRegistry.getInstance();

		EagerRegistry instance2 = EagerRegistry.getInstance();

		System.out.println(instance1 == instance2);
		
		System.out.println("=======================================");
		
		LazyRegistryWithDCL lz1 = LazyRegistryWithDCL.getInstance();
		
		LazyRegistryWithDCL lz2 = LazyRegistryWithDCL.getInstance();
		
		System.out.println(lz1 == lz2);
		
		System.out.println("=======================================");
		
		LazyRegistryIODH singleton;
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();
		singleton = LazyRegistryIODH.getInstance();

	}

}
