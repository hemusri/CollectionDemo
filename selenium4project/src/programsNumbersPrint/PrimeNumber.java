package programsNumbersPrint;

public class PrimeNumber {

	public static void main(String[] args)
	{

		//Natural numbers are prime numbers
		//which has only 2 factors 1 and itself
		
		//19 => 1 and 19 => prime Number
		//28 ==> 1,2,4,7,14,28  =>Not a prime Number
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number");
//		int num=sc.nextInt();
		int num=9;
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("Not a Prime Number");
			}
		}
		else
		{
			System.out.println("not a prime number");
		}
		
	}


}
