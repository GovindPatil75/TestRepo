package Pack2;

import Pack1.Parent;

public class Child2 {

	public static void main(String[] args) {
		Parent p=new Parent(); // pack1
		
		System.out.println(p.a); // public 
	//	System.out.println(p.b); // protected
	//	System.out.println(p.c); // deafult
	//	System.out.println(p.d); // private

	}

}
