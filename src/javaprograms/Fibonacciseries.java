package javaprograms;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) 
	{
		System.out.println("Enter the count");
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int n1=0,n2=1,sum,i;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			 sum=n1+n2;    
		  System.out.print(" "+sum);    
		  n1=n2;    
		  n2=sum;    
		 }    
	}

}
