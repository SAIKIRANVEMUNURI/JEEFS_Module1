package com.cg.lab3.exercise4;

import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args)
	{
		char a[]= new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		sc.close();
		CharCount cc=new CharCount();
		cc.countChar(a);
	}

}
