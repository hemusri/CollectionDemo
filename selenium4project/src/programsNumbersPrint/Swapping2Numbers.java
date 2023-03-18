package programsNumbersPrint;

public class Swapping2Numbers {

	
	public static void main(String[] args)
	{

		int a=10,   b =20;
		
		System.out.println("Before swapping values are.. "+a+" "+b);
		
		//loigc1 third variable
		
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("After swapping values are.."+a+" "+b);
		
		//logic2 - use+ & - without thrid variable
		
//		a=a+b;      //10+20=30
//		b=a-b;      //30-20=10
//		a=a-b;      //30-10=20
//		
//		System.out.println("After swapping values are.."+a+" "+b);
		
		//logic3 use * and / without thried variable
		//here a&b values should not be zero
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("After swapping values are.."+a+" "+b);
		
		//logic4 - bitwise XOR(^)
		
		a=a^b;   //10^20=30;
		b=a^b;   //30^20=10
		a=a^b;   //30^10=20
		System.out.println("After swapping values are.."+a+" "+b);
		
		
		//logic5 - single statement
		
		/*b=a+b-(a=b);
		System.out.println("After swapping values are.."+a+" "+b);*/
		
	}

}
