package programsNumbersPrint;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");	
		int num = sc.nextInt();   //1234
		
		//1.using algorithm
		
//		int rev=0;
//		
//		while(num!=0)
//		{
//			rev=rev*10+num%10;    //0+1234%10=4     40+3=43          430+2=432   4320+1=4321
//			num=num/10;           //1234/10=123     123/10=12         12/10=1     1/10=0
//		}
//		System.out.println("reverse Number is :"+rev);
		
		
		//Using String Buffer class RevenceMethod is there
		
		//StringBuffer rev;
/*		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev = sb.reverse();
		System.out.println("ReverceNumber :"+rev);  */	
		
		//using String BuilderMethod class
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev =sb1.reverse();
		System.out.println("StringBuilder Using :"+rev);	
		
     }

}
