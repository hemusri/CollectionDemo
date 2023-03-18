package programsNumbersPrint;

public class MissingNumberinArray {

	
	public static void main(String[] args)
	{

		//Array should not have duplicate
		//Array no need to be sorted order
		//values should be in range
		
		int a[]= {1,2,4,5};
		
		//1+2+4+5=12  sum1
		//1+2+3+4+5+15 sum2
		//sum2-sum1 = 15-12=3Missing
		
		int sum1=0;
		
		for(int i=0; i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of Element in array :"+sum1);
		
		int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of rang of Element in Array :"+sum2);
		
		System.out.println("Missing number of element in Array :"+(sum2-sum1));
	}


}
