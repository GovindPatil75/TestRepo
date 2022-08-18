package com.Practice;

public class DataTypes {
	
	    int z=50; // Instance Variables
	 
	 static int y=90; // static 
	
//	acessmodfier returntype methname(paramters) {
//		
//	}	
	public static void main(String[] args) {
		
		DataTypes ref=new DataTypes();
		System.out.println(ref.z); // 50	
		System.out.println(DataTypes.y); //90
		
		// local Variables 
		// Premitive Data Types --Size fixed
		int a=10;
		boolean b=true; // true false
		double d=1234.5;
		char c='A';
		
		int f; //  declartion 
		f=30; // initialization
		
		System.out.println(a); // 10
		System.out.println(b); // true
		System.out.println(d); // 1234.5
		System.out.println(c); //A
		
		// Non premitive --size not fixed
		
		String name="xyzpqr";
		System.out.println(name); // BugSpotter
		
	}
}
