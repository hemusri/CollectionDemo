package programsNumbersPrint;

public class CountEvenAndOddDigits {


	public static void main(String[] args)
	{

		int num=12345;
		
		int evennum=0;
		int oddnum=0;
		
		while(num>0)      //1234   123   12   1
		{
			int rem=num%10;     //4   3   2   1
			
			if(rem/2==0)
			{
				evennum++;      //1 2
			}
			else
			{
				oddnum++;     // 1  2
			}
			num=num/10;     //123  12  1  0
		}
		System.out.println("EvenCount :"+evennum);
		System.out.println("oddnum :"+oddnum);
	}

}
