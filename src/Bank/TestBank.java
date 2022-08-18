package Bank;

public class TestBank {

	public static void main(String[] args) {

		SBI sbi=new SBI();
		sbi.HomeLoan();
		sbi.PersonalLoan();
		sbi.VehicleLoan();
		
		System.out.println("========");
		
		HDFC hdfc=new HDFC();
		hdfc.HomeLoan();
		hdfc.PersonalLoan();
		hdfc.VehicleLoan();
	}

}
