package com.cg.lab7.exercise7;

import java.util.*;
class ReverseAndSort {
	


	
  public List<Integer> reverse(int a[])
  {
	  
	 String string= Arrays.toString(a);
	 StringBuffer sb=new StringBuffer(string);
	 sb.reverse();
	 
	 
	 
	 System.out.println("After Reversing"+sb);
	 
	 
	 ArrayList<Integer> listt=new ArrayList<Integer>();
	 Integer[] boxedArray = new Integer[a.length];

		for (int i = 0; i < boxedArray.length; i++) {
			boxedArray[i] = a[i];
		}

	 
	 
	    Collections.addAll(listt,boxedArray);
	    
	    Collections.sort(listt);
	    return listt;
	 
	   
	  
	  
  }


}
