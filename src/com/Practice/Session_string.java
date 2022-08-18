package com.Practice;

public class Session_string {

	public static void main(String[] args) {
		
		String s=new String("Bug"); // 2 object [Heap memory --SCP]
		String s1="Test";  // 1 Object --SCP

		// String Object is Immutable--unchanable/unmodified
		   System.out.println(s1); //s1--->Test
		
		   s1=s1.concat("Class"); // S1--->TestClass
		   
		   System.out.println(s1);
	}

}
