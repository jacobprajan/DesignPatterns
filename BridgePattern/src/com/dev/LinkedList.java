package com.dev;

// This is the implementor
// Note that this is also an interface
// As implementor is defining its own hierarchy which not related at all
// to the abstraction hierarchy


public interface LinkedList<T> {

	public void addFirst(T element);

	public T removeFirst();

	public void addLast(T element);

	public T removeLast();

	public int getSize();

}
