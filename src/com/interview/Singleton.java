package com.interview;

public class Singleton {
	private static Singleton instance = null;

	private Singleton() {
		this.m2();

	}

	public static final Singleton getInstance() {
		instance = new Singleton();
		System.out.println("Singleton.getInstance()");
		return instance;

	}

	void m2() {
		System.out.println("m2 method is called");
	}

}
