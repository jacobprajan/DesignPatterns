package com.dev;

import com.dev.Instance.Capacity;

//Factory implementation for Google Cloud Platform

public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputerEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMb) {
		return new GoogleCloudStorage(capMb);
	}

}
