package programsNumbersPrint;

public class CheckArrayEquals {

	public static void main(String[] args)
	{

		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
	
		/*
		boolean status =Arrays.equals(a, b);
		
		if(status==true)
		{
			System.out.println("Array are Euqal :");
		}
		else
		{
			System.out.println("Array Are not Equal");
		}
		*/
		
		boolean status = true;
		
		if(a.length == b.length)
		{
			for(int i=0; i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
				status=false;
				}
			}
		}
		else
		{
			status=false;
		}
		if(status==true)
		{
			System.out.println("Array are equal");
		}
		else
		{
			System.out.println("Array are not equal");
		}
	}



}
