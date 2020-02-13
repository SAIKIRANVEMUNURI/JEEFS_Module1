package com.cg.lab10.exercise3;

interface CheckUser
{
	boolean validate(String username,String password);

}
public class AuthenticateUserNamePassword {
	
	public static void main(String args[]) {
		CheckUser obj =(username,password)->
		{
			if(password.length()>8)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		System.out.println(obj.validate("saikiranreddy", "9490434642S@"));
	}

}

	

