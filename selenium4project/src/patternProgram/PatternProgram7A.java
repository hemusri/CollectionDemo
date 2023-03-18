package patternProgram;

public class PatternProgram7A {

	public static void main(String[] args)
	{

		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=(i*2); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
