package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ComparetwoArrays {

	public static void main(String[] args) 
	
	{
		//Take input from the user
        Scanner sc=new Scanner(System.in);
        
           //Declare size of an array
        int n1; 
        System.out.println("Enter the size of the array: ");
        n1=sc.nextInt();    //Intialize the array size
        int array1[]=new int[n1];   //Declare an array
        System.out.println("Enter the array1 elements: ");
        for(int i=0;i<n1;i++)
        {
            array1[i]=sc.nextInt();    //Initialize the array elements
        }
        
        int n2;   //Declare size of an array
        n2=sc.nextInt();    //Intialize the array size
        int array2[]=new int[n2]; 
        System.out.println("Enter the array2 elements: ");
        for(int i=0;i<n2;i++)
        {
            array2[i]=sc.nextInt();    //Initialize the array elements
        }
       
		if (Arrays.equals(array1, array2))
		{  
			System.out.println("Arrays are equal."); 
		}
			else  {
			System.out.println("Arrays are not equal.");   
			}   
			

	}

}
