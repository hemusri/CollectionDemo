package programsNumbersPrint;

public class CountCharacterOccurance {

	public static void main(String[] args)
	{

		String s="Java Program java oops";
		int totalcount=s.length();    //total length
		
		int totalcountafterremove=s.replace("a", "").length();   //total len after removing as
		
		int count = totalcount-totalcountafterremove;
		System.out.println(count);
		
	}

}
