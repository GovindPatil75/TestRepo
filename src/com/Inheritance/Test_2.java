package com.Inheritance;

// Hierachical Inheritance --> multiple child class inherit single parent class
public class Test_2 {

	public static void main(String[] args) {
		
		C_2 c1=new C_2();
		c1.m_a();
		c1.m_c();
		
		B_2 b1=new B_2();
		b1.m_a();
		b1.m_b();
		
	}

}

class A_2{
	
	public void m_a() {
		System.out.println("A_2");
	}
}

class B_2 extends A_2{
	public void m_b() {
		System.out.println("B_2");
	}
	
}
class C_2 extends A_2{
	
	public void m_c() {
		System.out.println("C_2");
	}
	
}







