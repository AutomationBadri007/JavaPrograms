package javaprograms;

import java.util.Scanner;

public class ReverseanInteger {

	public static void main(String[] args)
	
	{
		System.out.println("Enter the input integer");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int rev = 0;
		
		while(input!=0)
		{
			rev = rev * 10 + input % 10;
			input = input/10;
			
		}
		
		System.out.println("Reverse num is: " +rev);
		
		
		

	}

}
