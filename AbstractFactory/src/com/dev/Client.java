package com.dev;

import com.dev.Instance.Capacity;

public class Client {

	private ResourceFactory factory;
	
	public Client(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity capacity, int storageMb) {
		Instance instance = factory.createInstance(capacity);
		Storage storage = factory.createStorage(storageMb);
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String[] args) {
		Client aws = new Client(new AwsResourceFactory());
		Instance in1 = aws.createServer(Capacity.micro, 20480);
		in1.start();
		in1.stop();
		
		System.out.println("===================================");
		
		Client google = new Client(new GoogleResourceFactory());
		Instance in2 = google.createServer(Capacity.large, 40960);
		in2.start();
		in2.stop();
		
	}
}
