package com.cg.lab6.exercise10;

public class ValidateUsername {

	 public boolean isValid(String input)
	   {
		   boolean isValid=true;
		   if(!input.contains("_job"))
			   return false;
		   String tokens[]=input.split("_job");
		   if(tokens[0].length()<8)
			 isValid=false;  
		   return isValid;
	   }
}


