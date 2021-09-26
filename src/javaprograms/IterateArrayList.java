package javaprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args)
	
	{
		ArrayList<String> tvseries = new ArrayList<String>();
		tvseries.add("Game of Thrones");
		tvseries.add("SpiderMan");
		tvseries.add("BatMan");
		tvseries.add("GentleMan");
		
		System.out.println("***************using java 8 and for each lambda function**********");
		//using java 8 and for each lambda function
		tvseries.forEach(shows->
	{
		System.out.println(shows);
		
	});

		System.out.println("*******using Iterator method**************************");
		
		//using Iterator method
		
		
		  Iterator <String> it = tvseries.iterator();
		  while(it.hasNext()) 
		  { String shows = it.next(); 
		  System.out.println(shows); 
		  }
		 
	
	System.out.println("************using java 8 lambda and iterator*********************");
		
		//using java 8 lambda and iterator
	
	Iterator<String> it1 = tvseries.iterator();
	it1.forEachRemaining(show->
	{
		System.out.println(show);
	});
	
	System.out.println("**********using for  loop***********************");
	
	//using for each loop
	
	for(String shows : tvseries)
	{
		System.out.println(shows);
	}
	
	System.out.println("***************Using for loop order/index");
	for(int i=0;i<tvseries.size();i++)
	{
		System.out.println(tvseries.get(i));
	}
	
	
	}
	
	
}
