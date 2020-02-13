package com.cg.lab7.exercise5;

import java.util.Scanner;

public class MainFunction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		int a[]=new int[5];
		System.out.println("enter the array elemets");
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
			
			
			
		}
		
		SecondSmallest obj=new SecondSmallest();
		System.out.println("second smallest is   "+obj.getSecondSmallest(a));
		
		
		
		
		sc.close();


	}


}
