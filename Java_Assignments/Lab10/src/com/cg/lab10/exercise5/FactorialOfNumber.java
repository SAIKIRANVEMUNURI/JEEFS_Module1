package com.cg.lab10.exercise5;

interface A
{
	public void say(int b);
}

public class  FactorialOfNumber {
	
public void  fact(int n)
		{
    		long fact = 1;
    		for (int i = 2; i <= n; i++)
    		{
    			fact = fact * i;
    		}
    		System.out.println(fact);
}
	
	public static void main(String[] args)
	{
		
		FactorialOfNumber obj=new FactorialOfNumber();
		A obj1 = obj::fact;
		obj1.say(4);

	}

}

