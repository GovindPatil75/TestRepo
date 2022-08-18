package com.Inheritance;

// single level Inheritance :
public class Test {

	public static void main(String[] args) {
		
		B b=new B();
		b.m1();
		b.m2();

	}

}

class A {
	
	public void m1() {
		System.out.println("class A");
	}
}

class B extends A{
	
	public void m2() {
		System.out.println("Class B");
	}
}







