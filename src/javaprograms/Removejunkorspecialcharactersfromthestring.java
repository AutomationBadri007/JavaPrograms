package javaprograms;

import java.util.Scanner;

public class Removejunkorspecialcharactersfromthestring 

{

	public static void main(String[] args) 
	
	{
		System.out.println("Enter the input String");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		input = input.replaceAll("[^a-zA-Z0-9]", "");//using regular expression [^a-zA-Z0-9] , ^ means except all those remove all
		System.out.println("The output of the string without the special and junk characters are: " +input);
		

	}

}
