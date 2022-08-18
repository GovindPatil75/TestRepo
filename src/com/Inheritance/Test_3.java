package com.Inheritance;

// Multiple Inheritance ---> mutiple parent inherit ---> single child class
//Interface ---> 
public class Test_3 {

	public static void main(String[] args) {
		
		C_3 c=new C_3();
		c.m_a_3();

	}

}

class A_3{
	
	public void m_a_3() {
		System.out.println("Test");
	}
}

class B_3{
	public void m_a_3() {
		System.out.println("Test");
	}
}

class C_3 extends A_3,B_3{
	
}