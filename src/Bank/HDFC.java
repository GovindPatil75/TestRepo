package Bank;

public class HDFC implements RBI{

	@Override
	public void HomeLoan() {
          System.out.println("Home Loan HDFC -6 %");		
	}

	@Override
	public void VehicleLoan() {
		System.out.println("Vehicle Loan HDFC -4 %");		
		
	}

	@Override
	public void PersonalLoan() {
		System.out.println("Personal Loan HDFC -11 %");		
		
	}

}
