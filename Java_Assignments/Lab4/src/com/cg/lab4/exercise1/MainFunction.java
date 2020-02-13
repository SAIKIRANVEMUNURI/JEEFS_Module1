package com.cg.lab4.exercise1;

import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args) 
	{ 
	    int n;
	    System.out.println("Enter The Digit");
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    SumOfCubes sm = new SumOfCubes();
	    int l= sm.sumOfSeries(n);
	    System.out.println(l); 

	} 


}
