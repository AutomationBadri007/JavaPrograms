package javaprograms;

import java.util.Random;

public class GenerateRandomNumbersandStrings {

	public static void main(String[] args) 
	
	{
		//Approach1 - - Random
  			Random rand = new Random();
			int rand_int = rand.nextInt(1000);
			System.out.println(rand_int);
			
			double rand_db1 = rand.nextDouble();
			System.out.println(rand_db1);

		//Approach 2 - Math
			
			System.out.println(Math.random());
			

	}

}
