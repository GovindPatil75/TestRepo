package Bank;

public class SBI implements RBI {

	public static void main(String[] args) {

	}

	@Override
	public void HomeLoan() {
        System.out.println("Home loan sbi -5 %");		
	}

	@Override
	public void VehicleLoan() {
        System.out.println("vehicle loan sbi -5.5 %");		
		
	}

	@Override
	public void PersonalLoan() {
        System.out.println("Personal loan sbi -13 %");		
		
	}

}
