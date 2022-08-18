package Pack2;

import Pack1.Parent;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c1=new Child();
		System.out.println(c1.a); // public 
		System.out.println(c1.b); // protected
		//System.out.println(c1.c); // default
		//System.out.println(c1.d); // private

	}

}
