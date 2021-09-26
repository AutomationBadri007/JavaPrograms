package javaprograms;

import java.util.Scanner;

public class Findthelargestofthreenumbers {

	public static void main(String[] args) 
	
	{	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = in.nextInt();
		System.out.println("Enter the Second number");
		int b = in.nextInt();
		System.out.println("Enter the Third number");
		int c = in.nextInt();
		//Approach 1  - Logic
		if(a>b && a>c)
		{
			System.out.println(a + " is the largest");
		}
		else if(b>a && b>c)
		{
			System.out.println(a + " is the largest");
		}
		else
		{
			System.out.println(c + " is the largest");
		}

	}

}
