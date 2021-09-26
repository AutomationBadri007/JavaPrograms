package javaprograms;

import java.util.Scanner;

public class Palindrome {

	
	public static void Ispalindrome(int num)
	{
		int r;
		int t;
		int sum = 0;
		t=num;
		
		while(num>0)
		{
			r = num%10;
			sum = (sum * 10)+r;
			num = num/10;
			
		}
		
		if(t==sum)
		{
			System.out.println("The number is palindrome");
		}
		
		else
		{
			System.out.println("The number is not palindrome");
		}
		
	}
	
	public static void main(String[] args)
	
	{
		System.out.println("Enter the input number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Ispalindrome(num);
		

	}

}
