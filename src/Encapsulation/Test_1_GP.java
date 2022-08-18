package Encapsulation;

public class Test_1_GP {

	private int amount; // 300 --- data hiding --- data security
	
	private int balance;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = this.amount + amount;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
