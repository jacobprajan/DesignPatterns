package com.dev;

// Abstract Factory with methods defined for each object type

public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);
	
	Storage createStorage(int capMb);
	
}
