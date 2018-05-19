package com.dev;

import com.dev.Instance.Capacity;

// Factory implementation for Amazon Web Service 

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMb) {
		return new S3Storage(capMb);
	}
}
