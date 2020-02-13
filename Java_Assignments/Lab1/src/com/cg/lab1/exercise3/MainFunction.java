package com.cg.lab1.exercise3;

import java.util.Scanner;

public class MainFunction {
	
	public static void main(String[] args) {
		IncreaseNumber obj = new IncreaseNumber();
    	int l;
    	System.out.println("Enter");	
    	Scanner sc=new Scanner(System.in);
    	l=sc.nextInt();
    	System.out.println(obj.check(l));
    	sc.close();
      }

}
