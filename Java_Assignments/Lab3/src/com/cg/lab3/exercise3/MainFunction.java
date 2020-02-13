package com.cg.lab3.exercise3;

import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args)
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		ReverseArray rv =new ReverseArray();
		int b[]=rv.getReverseSort(a);
		for(int i:b)
		{
			System.out.println(i);
		}
		sc.close();
	}

}
