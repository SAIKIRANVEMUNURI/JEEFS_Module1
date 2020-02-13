package com.cg.lab5.exercise5;


public class AgeException {
	public void validate(int age)
	{
	try
	{
		if(age<15 )
				{
				throw new MyException("Age is Less than 15");
				}
		else
		{
			System.out.println("Age is:"+age);
		}
	}
	catch (MyException e)
	{
		System.out.println("Exception Occured!:"+e);
	}
	finally
	{
		
	}

}

}
