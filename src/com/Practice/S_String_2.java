package com.Practice;

public class S_String_2 {

	public static void main(String[] args) {
		
		String s1=new String("BugSpotter"); // 2   s1---> BugSpotter         s3,s4--->BugSpotter
		String s2=new String("BugSpotter"); //     s2---->BugSpotter         

		String s3="BugSpotter";  //
        String s4="BugSpotter";
        String s5="Data";
        
        System.out.println(s1.equals(s5));

		System.out.println(s1==s2); //false
		
		// ==  refrence comparision -----> both refrence point same object ko
		
		System.out.println(s1.equals(s2)); // .equals() -->  content comparision
		
		System.out.println(s1.equals(s3)); // 
		System.out.println(s2.equals(s4)); // 
		
		System.out.println(s3==s4); // true
	}

}
