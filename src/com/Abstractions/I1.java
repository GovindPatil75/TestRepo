package com.Abstractions;

public interface I1 {
	
	// abstract methods
	
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	
	
	//1.8 jdk ---default ,static  --concerte methods -->
	
	public default void m4() {
		System.out.println("default --");
	}
	//1.9 ---> private 

}
