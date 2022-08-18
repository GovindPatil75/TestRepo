package com.Practice;

public class Session_String_3 {

	public static void main(String[] args) {
		
		String s1="Test";
		String s2="test";
		
		System.out.println(s1.equals(s2)); // 
		
		//equalsIgnoreCase()---> content comparision ---> ignore the case 
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		//concat()----> append the strings --> String
		System.out.println(s1.concat(s2)); //

		//contains() ---> boolean 
		System.out.println(s1.contains("T")); // true
		
		//startsWith()---> boolean --->
		System.out.println(s1.startsWith("Te")) ;
		
		//
		
		String s="Test@gmail.com#12345678#abc#123";
		
		String [] a=s.split("#");
		
		
		System.out.println(a[0]); //Test@gmail.com
		System.out.println(a[1]); // 12345678
		
		System.out.println(a[2]); //abc
		System.out.println(a[3]); // 123
		
		//valueOf() ---> String 
		double d=123.4;
		
		String data=String.valueOf(d);
		System.out.println(data); // 123.4
		
	}
}
