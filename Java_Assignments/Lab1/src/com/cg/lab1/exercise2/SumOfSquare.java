package com.cg.lab1.exercise2;

public class SumOfSquare {
		
		public int n,sum=0,s,k,totalsum;
		public int calculateDifference(int n)
		{
				s=(n*(n+1))/2;
				sum=s*s;
				k=(n*(n+1)*((2*n)+1))/6;
				totalsum=sum-k;
			return totalsum;
		}
		    
	}



