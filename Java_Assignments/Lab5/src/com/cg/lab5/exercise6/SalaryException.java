package com.cg.lab5.exercise6;

import com.cg.eis.exception.*;

public class SalaryException {
	
	public void validate(int salary)
	{
	try
	{
		if(salary<3000 )
				{
				throw new EmployeeException("Salary is Less than 3000");
				}
		else
		{
			System.out.println("Salary is:"+salary);
		}
	}
	catch (EmployeeException e)
	{
		System.out.println("Exception Occured!:"+e);
	}
	finally
	{
		
	}

}
}
