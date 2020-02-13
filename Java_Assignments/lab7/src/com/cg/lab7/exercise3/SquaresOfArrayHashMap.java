package com.cg.lab7.exercise3;
import java.util.*;

public class SquaresOfArrayHashMap {
	

	public HashMap<Integer,Integer> squaresHashmap(int a[])
	{
	 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
	  for(int i=0;i<a.length;i++)
	  {
		  
		  
	     map.put(a[i],a[i]*a[i]);
		  
		  
		  
	  }
	  
	  
	  return map;
			
		
		
	}
	
	
	
	

}
