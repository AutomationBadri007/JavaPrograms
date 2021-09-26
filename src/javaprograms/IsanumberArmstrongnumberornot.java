package javaprograms;

public class IsanumberArmstrongnumberornot 

{
	
	public static void IsArmstrongnumber(int num)
	{
		int r;
		int cube =0;
		int t;
		t=num;
		while(num>0)
		{
			r=num%10;
			num = num/10;
			cube = cube+(r*r*r);
		}
		
		if(t==cube)
		{
			System.out.println("The number is Armstrong number");
		}
		else 
		{
			System.out.println("The number is not Armstrong");
		}
		
		
	}

	public static void main(String[] args) 
	
	{
		
		IsArmstrongnumber(153);
	}

}
