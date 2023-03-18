package programsNumbersPrint;

public class EvenOddfromArray {

	
	public static void main(String[] args) 
	{

		int a[]= {1,2,4,6,7,8,5,3};
		
		//Extracting even numbers.....
	
		
/*		System.out.println("Even number is array........");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		System.out.println("Odd number is array........");
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==1)
				System.out.println(a[i]);
		}
		*/
		
		//Enhanced for loop
		
		System.out.println("Even Number is Print......");
		for(int value:a)
		{
			if(value%2==0)   
			{
				System.out.println(value);
			}
		}
		
		System.out.println("Odd Number is print");
		for(int value:a)
		{
			if(value%2==1)
			{
				System.out.println(value);
			}
		}
	}
}
