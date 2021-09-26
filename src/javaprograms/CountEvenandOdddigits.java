package javaprograms;

import java.util.Scanner;

public class CountEvenandOdddigits {

	public static void main(String[] args)
	
	{
		System.out.println("Enter the input number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int even_count =0;
		int odd_count =0;
		while(num>0) 
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
		num=num/10;
		}
		System.out.println("Number of even numbers "+ even_count);
		System.out.println("Number of even numbers "+ odd_count);
		
	}

}
