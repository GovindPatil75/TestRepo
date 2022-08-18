package Encapsulation;

public class Test_1 {
	
	//variables+methods  ---> bind toghteher in single unit ---> encapsulation
	//data hiding + abstraction =encapsulation
	
	//1.variables as private
	//2. to accsess ,modify and view that variable ---> public getter and setter method

	private int amount=100;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) { //
		this.amount = 100;
	}
}
