package MethodOverriding;

public class Test {
	
	public Test() {
		System.out.println("No argument");
	}
	public Test(int b) {
		System.out.println("No argument");
	}
	
	public static void main(String[] args) {

		Test t=new Test();
		t.main();
		t.main(10);
	}

	public static void main() { // 0
		
		System.out.println("Main 1");
	}
  public static void main(int a) { // 1
		
		System.out.println("Main 2");
	}
}
