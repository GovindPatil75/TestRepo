package com.Abstractions;

public class Child extends Test_abstract {

	public static void main(String[] args) {

		Test_abstract t=new Child(); //
		t.m1();
		t.m2();
		
		Child c=new Child();
		c.m1();
		c.m2();
	}

	@Override
	public void m2() {
		System.out.println("I am from child class");
		
	}

	

}
