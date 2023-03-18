package programsNumbersPrint;

public class SumOfArray {


	public static void main(String[] args) 
	{

		int a[]= {5,6,8,9,10};  //n-5   n-1=4
		
		int sum=0;
		
		/*for(int i=0; i<=a.length-1; i++)    //0 1 2 3 4 //a.length-1=4;
		{
			sum=sum+a[i];    //5+6+8+9+10
		}
		System.out.println("Sum of the Elemnets :"+sum);*/
		
		//Enhanced for loop  use Any intialtion condtion
		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of the Elements :"+sum);
	}


}
