package javaprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	
	{
		//Reverse a string
		//diff b/w string and string buffer
		//do we have reverse method in string - No because string is immutable
		
		System.out.println("Enter the input String");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();// say suppose input is "Selenium"
		/*
		 * String rev = ""; // a blank variable to store the reverse string
		 * 
		 * //using for loop for(int i=input.length()-1;i>=0;i--) { rev = rev +
		 * input.charAt(i); // why rev + input.charAt(i) means initially the value of
		 * rev is empty so it will be m and then // it will be mu and then it will be
		 * mui and then it will be muin and so on till muineles }
		 * 
		 * System.out.println("The output of the reversed string is:" +rev);
		 */
		//using String Buffer
		
		StringBuffer sf = new StringBuffer(input);
		System.out.println("The output of the string is:" +sf.reverse());
		

	}

}
