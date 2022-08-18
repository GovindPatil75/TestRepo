package com.Practice;

public class Test_4 {
	
	public int m1() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		return a+b; //int
		
	}

	//public 
	
	public static void main(String[] args) {
		
		System.out.println(Parent.m2()); // data
		System.out.println(Parent.addition(10, 10)); // 20
		
		
		int add=Parent.addition(10, 20) ; // 30
		
		int a=add+8;
		System.out.println(a); // 38
		
		System.out.println(add);
		
		int sub=Parent.Substraction(30, 10); // 20
		System.out.println(sub);
		
//		Test_4 t=new Test_4(); // obj creation
//		System.out.println(t.m1()); //
//		
//		// for(initialization;condition;++/--){}
//		// break
//		for(int i=5;i>=0;i--) { // 4
//			
//			
//			if(i==4) { // 4==4
//				continue;
//			}
//			else if(i==3) {
//				break;
//			}
//			System.out.println(i); // 5 
//		}
//
//		//continue
//		for(int j=0;j<=5;j++) {
//			
//			if(j==3) {
//				continue;
//			}
//			System.out.println(j);
//		}
//		
//		
		
		
	}

}
