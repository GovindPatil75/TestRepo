package Pack1;

public class Operators_concepts {

	public static void main(String[] args) {
		// Arithmatic Operators --- +,-,*,/,%
		int a=20;
		int b=10;
		
		System.out.println(a+b); // 30
		System.out.println(a-b); //10
        System.out.println(a*b); // 200
        System.out.println(a/b); // 2
        System.out.println(a%b); // 0
        
        // Relational Operators -- >,<,>=,<=,==,!=
        System.out.println(a>b); // true
        System.out.println(a<b); // false
        System.out.println(a>=b); // true
        System.out.println(a<=b); //false
        System.out.println(a==b); //false
        System.out.println(a!=b); // true
        
        // Logical Operators -- && ,|| ,!(logical Not)
        
        System.out.println(a>b && b>a); // T && F ---> false
        System.out.println(a>b || b>a); // T || F ----> true
        System.out.println(!(a>b)); // false
        
        // a=20 ,b=10
        //4.Increment/decrement Operators :
        System.out.println(a++); // 20 (a=21)
        System.out.println(a--); //21 (a=20)
        System.out.println(++a); //21
        System.out.println(--a); //20
           
	}
}
