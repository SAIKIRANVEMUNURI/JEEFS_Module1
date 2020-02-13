package com.cg.lab7.exercise3;

import java.util.*;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			
			
		  a[i]=sc.nextInt();	
			
			
			
			
		}
		
		SquaresOfArrayHashMap obj=new SquaresOfArrayHashMap();
		HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
		map=obj.squaresHashmap(a);
		
		System.out.println(map);
		 /* for(Map.Entry<Integer, Integer> obj1:map.entrySet())
		     {
		    	 
		      System.out.println(obj1.getKey()+"  "+obj1.getValue());
		    	 
		    	 
		     }	*/	
		
		sc.close();

	}

}
