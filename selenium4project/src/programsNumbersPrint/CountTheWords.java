package programsNumbersPrint;

public class CountTheWords {

	
	public static void main(String[] args)
	{
//
//		System.out.println("Enter the String");
//		Scanner sc = new Scanner(System.in);
//
//		String s=sc.nextLine();  //welcome to java
		
		String s="Welcome to the java";

		int count=1;

		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)==' ' )&& (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words a string :"+count);
	}

}
