package programsNumbersPrint;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException
	{

		FileWriter fw = new FileWriter("C:\\JavaPrograms\\Test123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium with java");
		bw.write("Selenium with pythone");
		bw.write("selenium");
		
		System.out.println("Finished!!!!");
		
		bw.close();
		
	}

}
