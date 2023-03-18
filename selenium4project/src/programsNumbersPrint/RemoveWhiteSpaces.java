package programsNumbersPrint;

public class RemoveWhiteSpaces {

	public static void main(String[] args) 
	{

		String str="Java Progaram  selenium automation";
		str=str.replaceAll("\\s","");
		System.out.println(str);
	}


}
