package com.cg.lab3.exercise2;

import java.util.Scanner;

public class MainFunction {
	
	public static void main(String args[])
	{
		int size;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size");
		size=sc.nextInt();
		
		
		String a[]=new String[size];
		System.out.println("enter the array elements");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextLine();
		}
		
		UpperLower obj=new UpperLower();
		String b[]=obj.conversion(a);
		
	    for(int i=0;i<b.length;i++)
      	{
			System.out.println(b[i]);
		}
		
		
		sc.close();
		
		
	}
}

	