package com.cg.lab6.exercise5;
import java.lang.Math;

public class ModifyNumber {

	public StringBuffer modifyNumber(int a)
	{
		
	
		String b=String.valueOf(a);
		
	    char c[]=b.toCharArray();
	    int d[]=new int[c.length];
	    
	    for(int i=0;i<c.length;i++)
	    {
	    	
	    	
	    	
	    	d[i]=Character.getNumericValue(c[i]);
	    	
	    	
	    	
	    }
	    
	    
	    StringBuffer sb=new StringBuffer(String.valueOf(d[(c.length)-1]));
	    
	 
	    
	    for(int j=(c.length-1);j>0;j--)
	    {
	    	
	    	
	    	int temp=0;
	    	temp=d[j]-d[j-1];
	    	
	    	sb.append(Math.abs(temp));
	    	   	
	    	
	    }
	    
	    sb.reverse();
	    return sb;
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
	}
	
	
	
}

