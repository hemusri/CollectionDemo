package programsNumbersPrint;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {


	public static void main(String[] args) throws IOException
	{

		//Apporach1 : usingfileReader BufferReader
		/*FileReader fr = new FileReader("C:\\JavaPrograms\\Test.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();  */
		
		//Apporach2 : Using Scanner & file
		
		File file =new File("C:\\JavaPrograms\\Test.txt");
		
		Scanner sc = new Scanner(file);
		//loop statement
		
	/*	while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());   
		}     */
			
		//Apporach Delimiter
		 sc.useDelimiter("\\Z");
		 System.out.println(sc.next());
		
	}
}
