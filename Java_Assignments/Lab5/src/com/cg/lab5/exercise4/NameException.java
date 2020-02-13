package com.cg.lab5.exercise4;


public class NameException {

	public void validate(String fname,String lname)
	{
	try
	{
		if( fname.equals("") && lname.equals(""))
				{
				throw new MyException("Invalid fname and lname");
				}
		else
		{
			System.out.println("Name:"+fname+" "+lname);
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
