package com.cg.lab1.exercise3;

public class IncreaseNumber {
	int num;
	boolean flag = true;
	public boolean check (int num)
	{
		 int lastdigit=num%10;
		 num=num/10;
		 
		 while(num>0)
		 {
			 if(lastdigit<=num%10)
			 {
				 flag=false;
				 break;
			 }
			 lastdigit=num%10;
			 num=num/10;
		 }
		 	return flag;
	}

}
