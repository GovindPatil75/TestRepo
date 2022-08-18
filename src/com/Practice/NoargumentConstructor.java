package com.Practice;

public class NoargumentConstructor {
	
	
	String name;
	int id;
	
	// No argument constructor
	public NoargumentConstructor() {
		
		System.out.println("No argument Constructor");
	}
   
	// parametrized constructor
	public NoargumentConstructor(String name,int id) {
		
		this.name=name;
		this.id=id;
		System.out.println("parametrized constructor");
	}
	
	public static void main(String[] args) {

		NoargumentConstructor n=new NoargumentConstructor(); //
		NoargumentConstructor n1=new NoargumentConstructor("Test",10); //
		
		
		
		

	}

}
