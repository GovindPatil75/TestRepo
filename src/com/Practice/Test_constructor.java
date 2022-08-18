package com.Practice;

public class Test_constructor {
   
	// Instance variables --declare
	   String name; // Bug  Test1
	   int id;      // 1    2
	                                                               
	   public  Test_constructor(String name,int id) {
		   
		   System.out.println(this.name); // null
		   System.out.println(this.id); //0
		   this.name=name;
		   this.id=id;      
		   System.out.println(this.name); // Bug
		   System.out.println(this.id);  //1
	   }
	
	public static void main(String[] args) {
		
		Test_constructor t=new Test_constructor("Bug",1);
		
		Test_constructor t1=new Test_constructor("Test1",2);
		
		Test_constructor t2=new Test_constructor("Test3",3);

		
		System.out.println(t.name); //Bug
		System.out.println(t.id); // 1

		System.out.println(t1.name); // Test1
		System.out.println(t1.id);  // 2
		
	}

}
