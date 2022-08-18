package com.Practice;

public class S_StringMethod {

	public static void main(String[] args) {
		
		String s="BugSpotter";
		// length()
		System.out.println(s.length()); // int 10
		
		// charAt(index) --> char
		System.out.println(s.charAt(1)); //u
		
		for(int i=0;i<s.length();i++) {
			
			System.out.println(s.charAt(i)); // B  u
			
		}
		// toUppercase() --->String
		System.out.println(s.toUpperCase()) ; // BUGSPOTTER
		
		// toLowerCase  ----> String
		System.out.println(s.toLowerCase()); //bugspotter
		
		String s1="  Test  ";
		System.out.println(s1);
		//trim() --->String
		System.out.println(s1.trim()); // remove spaces start and end
		
		
		String file="file.pdf";
		
		//endsWith() ---> boolean
		if(file.endsWith(".pdf")) {
			System.out.println("send the file");
		}else {
			System.out.println("file format is wrong");
		}
		
	}
}
