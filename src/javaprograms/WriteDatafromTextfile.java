package javaprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatafromTextfile {

	public static void main(String[] args) throws IOException 
	
	{
		 
	            FileWriter writer = new FileWriter("C:\\Users\\S Venkat Badrinath\\Desktop\\Selenium java preparation\\Text.txt");
	            BufferedWriter bw = new BufferedWriter(writer);
	            
	            bw.write("Hello World");
	            bw.write("\r\n");   // write new line
	            bw.write("Good Bye!");
	            System.out.println("Finished");
	            bw.close();
	        
	 
	}

}
