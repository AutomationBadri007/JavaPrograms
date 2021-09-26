package javaprograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Allrepeatedcharactersinastring {

	public static void main(String[] args)
	
	{
		System.out.println("Enter the input string");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		char ch = Allrepeatedcharacters(input);

	}

	public static Character Allrepeatedcharacters(String str)
	{
		HashMap<Character,Integer> characterhashtable = new HashMap<Character,Integer>();
		int length;
		length = str.length();
		Character ch;
		
		for(int i=0;i<length;i++)
		{	
			ch = str.charAt(i);
			if(characterhashtable.containsKey(ch))
				characterhashtable.put(ch, characterhashtable.get(ch)+1);
			else
				characterhashtable.put(ch, 1);
			
		}
		
		for(Entry<Character, Integer> entry : characterhashtable.entrySet())
		{
			String str1 = "  ";
			
			if(entry.getValue()>1)
				
				System.out.println(entry.getKey() + str1 + entry.getValue());
		}
		
		return 'h';
		
		
	}

	
}
