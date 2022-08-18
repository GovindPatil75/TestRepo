package Test_multipleInheritance;

public class child implements I1,I2{

	public static void main(String[] args) {
		child c=new child();
		c.m1();
		
	}

	@Override
	public void m1() {
        System.out.println("M1");		
	}

}
