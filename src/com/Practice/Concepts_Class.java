package com.Practice;

public class Concepts_Class {

	// 1.Collection ---> variables and methods ,and its just template
	//2.We can declare static and non static memeber inside class
	//3.To access Static memeber ----> use ClassName.member
	//4.To access non static memeber ---> we have Object of Class ---> refrence 

	int a=10;   // non static 
	static int b=20; // static
	
	public static void main(String[] args) {
		
		Concepts_Class ref=new Concepts_Class(); // Object Creation
		System.out.println(ref.a);  // non static
		
		System.out.println(Concepts_Class.b); // static
		

	}

}
