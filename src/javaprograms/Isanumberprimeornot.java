package javaprograms;

public class Isanumberprimeornot 

{
	public static boolean Isprimenumber(int num)
	
	
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
				
			}
			
		}
		
		return true;
		
		
	}

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		System.out.println("Is 25 is a prime number:" +Isprimenumber(25));

	}

}
