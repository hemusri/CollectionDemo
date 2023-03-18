package programsNumbersPrint;

import java.util.Scanner;

public class PallindromeString {


	public static void main(String[] args)
	{

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String :");
		
		String str =sc.next();
		String org_Str = str;
		
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev=sb.reverse();
		
		if(org_Str.equals(rev))
		{
			System.out.println(org_Str+ "Pallindrome Number");
		}
		else
		{
			System.out.println(org_Str+ "Not Pallindrome Number");
		}
		
		
	}

}
