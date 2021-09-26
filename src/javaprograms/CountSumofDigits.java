package javaprograms;

import java.util.Scanner;

public class CountSumofDigits {

	public static void main(String[] args)
	
	{	
		
	System.out.println("Enter the input number");
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	int sum = 0;
	while(num>0)
	{
		sum = sum+num%10;
		num = num/10;
	}
	System.out.println("Sum of the digits in a number: " +sum);
	}

}
