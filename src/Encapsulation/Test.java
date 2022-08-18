package Encapsulation;

public class Test {

	public static void main(String[] args) {

		Test_1 t=new Test_1();
		t.setAmount(100);
		
		int data=t.getAmount();
		
		System.out.println(data);
		
		Test_1_GP t1=new Test_1_GP();
		t1.setAmount(100);
		System.out.println(t1.getAmount()); //100
		
		t1.setAmount(200);
		System.out.println(t1.getAmount()); //300
		
		
	}

}
