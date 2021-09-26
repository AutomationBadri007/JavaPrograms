package javaprograms;

import java.util.Scanner;

public class Findthenumberofwordsinastring {

	public static void main(String[] args) 
	{
		System.out.println("Enter the input string to find out how many words in a string are available");
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		System.out.println(wordcount(str1)  + " Words");

	}

	
	public static int wordcount(String str)
	{
		int count = 0;
		
		char ch[] = new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			ch[i] = str.charAt(i);
			
			if((i>0)&& (ch[i]!=' ') && (ch[i-1]==' ') || (ch[0]!=' ') &&(i==0))
			 
				count++;
		}
		
		return count;
		
	}
}
