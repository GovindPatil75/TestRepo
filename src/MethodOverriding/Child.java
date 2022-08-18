package MethodOverriding;

public class Child extends Parent{
	
	public void m1() {
		
		super.m1(); // provide parent class method Implemetion
		System.out.println("from Child");
	}

	public static void main(String[] args) {

		Child c=new Child();
		c.m1(); //
		
	}

}
