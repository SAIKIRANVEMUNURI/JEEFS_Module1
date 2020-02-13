package com.cg.lab10.exercise1;

interface Lamda {

	double power(int x,int y);
                }

public class LamdaXpowerY
			{
	
		public static void main(String[] args) 
				{
			Lamda obj=(x,y)->
			{
				return Math.pow(x,y);
			};
			System.out.println(obj.power(2, 3));
		
		

	}
	}

