package com.cg.lab5.exercise2;

public class Fibonacci {
	int z;
	public int getFibo(int num)
	{
	/*
		int x=1;
		int y=1;
		
		for(int i=0;i<num;i++)
		{
			z=x+y;
			x=y;
			y=z;
		}
		return z;
	}
	*/
		
		//recursion fibo
		
		if(num==1 || num==2)
		{
			return 1;
		}
		else
		{
			return getFibo(num-1)+getFibo(num-2);
		}
		

}
	
}


