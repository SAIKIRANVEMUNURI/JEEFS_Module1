package com.cg.lab1.exercise1;

public class SumOfNumber {
	
		public int number,sum=0;
			
		public int calculateSum(int number)
			
		    { 
				for (int index=0;index<=number;index++)
				{
					if(index%3==0 || index%5==0)
					{
						sum =sum+index;
					}
				 } 
				return sum;
			}
	}



