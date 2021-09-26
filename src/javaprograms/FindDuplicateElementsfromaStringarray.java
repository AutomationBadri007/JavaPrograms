package javaprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateElementsfromaStringarray 
{

	public static void main(String[] args)
	
	{
		Scanner sc1=new Scanner(System.in);
        System.out.println("enter the length of String array");
        int n=sc1.nextInt();
        String[] larray=new String[n];

        for(int i=0;i<n;i++){
            System.out.println("enter the "+(i+1)+" String :");
            larray[i]=sc1.next();
        }
   
       // System.out.println("Strings Entered by user:");

       /* for(String s:larray){
            System.out.println(s);
		*/
		
		
		for(int i=0;i<larray.length;i++)
		{
			for(int j=i+1;j<larray.length;j++)
			{
				
				if(larray[i].equals(larray[j]))
				{
					System.out.println("The duplicate element is: " +larray[i]);
				}
			}
			
		}

		System.out.println("******************************************************");
	
		// using hashset : Java collection : it stores unique values
		//Set is the interface, HashSet is the class : 0(n) - - good solution
		
		Set<String> store = new HashSet<String>();
	
		for(String name : larray)
		{
			if(store.add(name)==false)
			{
				System.out.println("The duplicate elements are: " +name);
			}
			
		}
	
		System.out.println("******************************************************");
		
		
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		for(String name: larray)
		{
			Integer count = storeMap.get(name);
			
			if(count==null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}
		}
		
		Set<Entry<String,Integer>> entryset = storeMap.entrySet();
		for(Entry<String,Integer> entry :entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate Element is:" +entry.getKey());
			}
		}
		
	}
	
}
