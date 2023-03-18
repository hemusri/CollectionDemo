package programsNumbersPrint;

public class Demo1 {

	public static void main(String[] args) {

		int num=123456;
		int sumcount=0;
		
		while(num>0)
		{
			sumcount=sumcount+num%10;
			num=num/10;
		}
		System.out.println(sumcount);
	
	}

}
