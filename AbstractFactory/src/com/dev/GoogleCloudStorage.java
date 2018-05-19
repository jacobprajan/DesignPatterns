package com.dev;

//Represent a concrete product in a family "Google Cloud Platform"

public class GoogleCloudStorage implements Storage {

	public GoogleCloudStorage(int capacityInMb) {
		System.out.println("Alocatted " + capacityInMb + " on Google Cloud Storage");
	}
	
	@Override
	public String getId() {
		return "gcs1";
	}
	
	public String toString() {
		return "GoogleCloudStorage";
	}

}
