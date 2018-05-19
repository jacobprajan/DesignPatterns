package com.dev;

//Represent a concrete product in a family "Amazon Web Services"

public class S3Storage implements Storage {

	public S3Storage(int capacityInMb) {
		System.out.println("Alocatted " + capacityInMb + " on S3 Storage");
	}
	
	@Override
	public String getId() {
		return "S31";
	}
	
	public String toString() {
		return "S3Storage";
	}

}
