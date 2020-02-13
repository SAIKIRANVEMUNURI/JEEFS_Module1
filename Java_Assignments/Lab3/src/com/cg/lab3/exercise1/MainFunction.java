package com.cg.lab3.exercise1;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter Array Size");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		SecondSmallest ss = new SecondSmallest();
		int u=ss.getSecondsmall(a);
		System.out.println(u);
		sc.close();
		

	}
}
