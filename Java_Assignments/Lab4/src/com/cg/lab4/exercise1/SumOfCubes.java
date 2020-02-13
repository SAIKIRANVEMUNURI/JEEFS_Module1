package com.cg.lab4.exercise1;

public class SumOfCubes {
	 public static int sumOfSeries(int n) 
	    { 
	        int sum = 0; 
	        for (int x=1; x<=n; x++) 
	            sum += x*x*x; 
	        return sum; 
	    } 

}
