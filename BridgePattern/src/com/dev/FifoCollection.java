package com.dev;

// This is the abstraction
// It represents a first in first out collection

public interface FifoCollection<T> {

	// Adds element to collection
	public void offer(T element);
	
	// Removes and returns first element from collection
	public T poll();
	
}
