package com.cg.lab3.exercise2;


public class UpperLower {
	
	    String temp;
        public String [] conversion(String a[])
        {
        	
        	for(int i=0;i<a.length;i++)
        	{
        		
        		for(int j=i+1;j<a.length;j++)
        		{
        		   			
        			if(a[i].compareTo(a[j])>0)
        			{
        				temp=a[j];
        				a[j]=a[i];
        				a[i]=temp;				
        				
        			}
        			
           		}
        		
        	}
        	
        			System.out.println("after sorting");
        				for(int i=0;i<a.length;i++)
    		{
        					System.out.println(a[i]);
    		}     	
        	
        					if((a.length)%2==0)
     	    {
     	
        						for(int k=0;k<=((a.length)/2);k++)
     		{
     			
        							a[k]=a[k].toUpperCase();
     			
     		}
     	    }
        					else
     	    {
        						for(int k=0;k<((a.length/2)+1);k++)
         		{
         			
        							a[k]=a[k].toUpperCase();
         			
         		}
     	    	
     	    	
     	    	
     	    }    		
        	 		System.out.println("After conversion");     	
        	 		return a;     	
        }
   	}


