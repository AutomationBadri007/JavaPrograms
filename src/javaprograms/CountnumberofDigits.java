package javaprograms;

import java.util.Scanner;

public class CountnumberofDigits {

	public static void main(String[] args) 
	
	{
		System.out.println("Enter the input number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("Number of Digits:" +count);
	}

}
