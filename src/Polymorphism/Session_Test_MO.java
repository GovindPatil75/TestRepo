package Polymorphism;

public class Session_Test_MO {
	
	// diffrent argument --> no of arguments diffrnet /Type/Sequence of arguments
	public void m1() {  // 0
		System.out.println("m1_1");
	}

	public void m1(int a) {  // 1
		System.out.println("M1_2");
	}
	
	public void m1(String b) {
		System.out.println("M1_3");
	}
	
	public void m1(int a,String b) {
		System.out.println("a,b");
	}
	
	public void m1(String a,int a1) {
		System.out.println("b,a");
	}
	
	public static void main(String[] args) {

		Session_Test_MO s=new Session_Test_MO();
		s.m1(); //
		s.m1(10); //
		s.m1("abc");
		s.m1(10, "abc");
		s.m1("abc", 10);
		
		
	}

}
