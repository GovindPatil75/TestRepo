package com.Practice;

public class Account {

	public void viewBalance() {
		
		System.out.println("Balance viewed");
	}
	public void AddAmount() {
		System.out.println("Balance Added");
	}
	
	public static void main(String[] args) {
		
		Account a=new Account(); 
		a.viewBalance();
		a.AddAmount();

	}

}
