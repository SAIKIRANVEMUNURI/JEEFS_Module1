package com.cg.lab1.exercise2;

import java.util.Scanner;

public class MainFunction {
	
	public static void main(String[] args) {
		SumOfSquare obj = new SumOfSquare();
    	int l;
    	System.out.println("Enter the Number:");	
    	Scanner sc=new Scanner(System.in);
    	l=sc.nextInt();
    	System.out.println(obj.calculateDifference(l));
    	sc.close();
      }

}
