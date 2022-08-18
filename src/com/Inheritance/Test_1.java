package com.Inheritance;

//Multilevel Inheritance 
public class Test_1 {

	public static void main(String[] args) {
		C_1 c=new C_1();
		c.m_1();
		c.m_2();
		c.m_3();
		
		B_1 b=new B_1();
		b.m_1();
        b.m_2();
       
	}
}

class A_1 {
	
	public void m_1() {
		System.out.println("A_1");
	}
}

class B_1 extends A_1{
	
	// m_2 ,m_1
	public void m_2() {
		System.out.println("B_1");
	}
}
class C_1 extends B_1{
	
	// m_3,m_2 ,m_1
	public void m_3() {
		System.out.println("C_1");
	}
}






