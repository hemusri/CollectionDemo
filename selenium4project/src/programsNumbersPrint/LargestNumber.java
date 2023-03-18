package programsNumbersPrint;

import java.util.Scanner;

public class LargestNumber {

	
	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A value of :");
		int a=sc.nextInt();

		System.out.println("Enter B value of :");
		int b=sc.nextInt();

		System.out.println("Enter C value of :");
		int c=sc.nextInt();

		/*if(a>b && a>c)
		{
			System.out.println(a+" a is the largest number");
		}
		else if(b>a && b>c).
		{
			System.out.println(b+ " b is the largest number");
		}
		else
		{
			System.out.println(c+" c is the largest number");
		}*/
		
		
		//ternary Operator
		
		int largest1=a>b?a:b;    //largest of a& b
		int largest2=c>largest1?c:largest1;    //largest of largest1 & c
		
		
		int largest =c>(a>b?a:b) ?c:(a>b?a:b);   
		System.out.println(largest2+ "is the largest2 number");
		
		System.out.println(largest+" is the largest number ");
	}


}
