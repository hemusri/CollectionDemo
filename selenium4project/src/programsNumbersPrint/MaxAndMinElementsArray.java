package programsNumbersPrint;

public class MaxAndMinElementsArray {

	public static void main(String[] args) 
	{

	/*	int a[]= {50,30,40,20,60};
		
		int max=a[0];    //50
		
		for(int i=1; i<a.length;i++)   //50   40   20  60
		{
			if(a[i]>max)    //30>50    40>50    20>50  60>50
			{
				max=a[i];     //50   60
			}
		}
		System.out.println("Maximum Element is Array is:"+max);  */
		
		
		int a[] = {50,100,40,20,60};
		
		int min=a[0];   //50  40
		
		for(int i=1; i<a.length; i++)   //2   3  4  5
		{
			if(a[i]<min)   //100<50    40<50    20<40  20<60
			{
				min=a[i];    //50   40   20 
			}
		}
		System.out.println("minium Element is Array is "+min);
	}

}
