package javaprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDatafromTextFile {

	public static void main(String[] args) throws IOException 
	
	{
		//using filereader buffered reader
		FileReader fr = new FileReader("C:\\Users\\S Venkat Badrinath\\Desktop\\Selenium java preparation\\Text.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while((str=br.readLine())!= null)
		{
			System.out.println(str);
		}
		br.close();
		
		// pass the path to the file as a parameter using scanner class
	    File file =
	      new File("C:\\\\Users\\\\S Venkat Badrinath\\\\Desktop\\\\Selenium java preparation\\\\Text.txt");
	    Scanner sc = new Scanner(file);
	  
	    while (sc.hasNextLine())
	      System.out.println(sc.nextLine());
		
	}

}
