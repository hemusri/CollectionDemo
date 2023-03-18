package programsNumbersPrint;

public class ReverseEachWordString {

	public static void main(String[] args)
	{

	/*	String str="Welcome to Java";     //orginal String
		String[] word=str.split(" ");     //Splitting string into word
		String reversestring="";
		
		for(String w:word)  //Welcome    to
		{
			String reveseword="";
			for (int i=w.length()-1;i>=0;i--)   //Welcome  reverce the    To 
			{
				reveseword=reveseword+w.charAt(i);		
			}
			reversestring =reversestring+reveseword+" ";    //emocleW ot
		}
		System.out.println(reversestring);*/
		
		
		//Approcah2
		String str1="Welcome To Java";
		
		String[] words=str1.split("\\s");
		String reverceword="";
		
		for(String w:words)      //Welcome
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();  //emocleW
			reverceword=reverceword+sb.toString()+" ";   ////emocleW
		}
		System.out.println(reverceword);
	}


}
