package com.Practice;

public class Methods_Concepts {

	
	// methods
	
	public void m1() {  // non static 
		System.out.println("I am m1");
	}
	
	public static void m2() { // static
		System.out.println("I am m2");
	}
	
	public int Add(int a,String b) { 
		
		return a ;
		
	}
	
	public int Sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int getdiv(int a,int b) {
		return a/b;
	}
	
	public String getname() {
		String name="BugSpotter";
		return name;
	}
	
	public static void main(String[] args) {
	
		
		Methods_Concepts c=new Methods_Concepts();
		System.out.println(c.Add(30, "I am getting value of A"));
		
		c.m1();
		Methods_Concepts.m2();
		
		//System.out.println(c.Add(10, 20));
		System.out.println(c.Sub(20, 10));
		System.out.println(c.mul(10, 20));
		System.out.println(c.getname());

	}

}
