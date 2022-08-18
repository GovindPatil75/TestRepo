package com.Abstractions;

public class Test_interface implements I1 {

	public static void main(String[] args) {
		
		//I1 i=new I1();
		Test_interface t=new Test_interface();
		t.m1();
		t.m2();
		t.m3();
		t.login();
		
		I1 i=new Test_interface();
		i.m1();
		i.m2();
		i.m3();
		
	}

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
		System.out.println("m2");
	}

	@Override
	public void m3() {
		System.out.println("m3");
	}
	
	public void login() {
		System.out.println("login");
	}

}
