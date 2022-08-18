package Pack1;

public class SlectionStatments {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		
		System.out.println("BugSpotter");
		// if statments
		if(a<b) {
			System.out.println("a is greater than b");
		}
		
		System.out.println("Testing");
		
		// if ---else 
		
		if(a<b) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		// if ----elseif
		
		if(a>b) {
			System.out.println("case 1");
		}
		else if(a!=b) {
			System.out.println("case 2");
		}
		else if(a!=b) {
			System.out.println("case 3");
		}
		
		
		// nested if
		
		if(a>b) {
			System.out.println("i am in first case");
			
			if(a==b) {
				System.out.println("enter second case");
			}else {
				System.out.println("default inside");
			}
			
		}else {
			System.out.println("in else case");
		}
		
	}
}
