package com.Practice;

public class Test_1 {

	// 1.name of constructor same as name of Class
	//2.there no return type --not even void --->
	//3 .3.access modifier --> public ,protected,default,private
	String name; //
	
	public Test_1() {
		System.out.println("User define-no arguments");
	}
	
	public Test_1(String name) {
		
		this.name=name;
		System.out.println("Parametrized constructor");
	}
	
	public static void main(String[] args) {
		
		Test_1 t=new Test_1(); //
		Test_1 t1=new Test_1("Bug");//
		
		System.out.println(t1.name); //
		
		

	}

}
