package com.cg.lab7.exercise8;

import java.util.Scanner;

public class MainFunction {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Elements:");
		Integer a[]=new Integer[7];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{	
			a[i]=sc.nextInt();
				
		}
		sc.close();
		
		
		RemoveDuplicates obj=new RemoveDuplicates();
		Integer b[]=obj.removeDuplicates(a);
		for(Integer i:b)
		{
			
			
			System.out.println(i);
			
			
		}

	}

}
