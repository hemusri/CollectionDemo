package programsNumbersPrint;

public class RemoveJunkAndSpical {

	public static void main(String[] args)
	{

		String s1="$%^&%&*8 lath string";
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}


}
