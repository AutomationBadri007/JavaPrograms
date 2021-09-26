package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordsinastring {

	public static void main(String[] args)
	{
		System.out.println("Enter the input string");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		findDuplicateWords(input);
		

	}
	
	
	public static void findDuplicateWords(String input)
	{
		//split
	String  words [] =	input.split(" ");
		
	//create one hashmap
	
	Map<String,Integer> wordcount = new HashMap<String,Integer>();
	
	//to check each word in given array

	for(String word: words)
	{
		if(wordcount.containsKey(word))
		{
			wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
		}
		else
		{
			wordcount.put(word, 1);
		}
	}
		
	//extracting all the keys of map - word count
	Set<String> WordsinString = wordcount.keySet();
	for(String word : WordsinString)
	{
		if(wordcount.get(word)>1)
		{
			System.out.println(word + " :" + wordcount.get(word));
		}
		
		
	}
	
	
	
	}

}
