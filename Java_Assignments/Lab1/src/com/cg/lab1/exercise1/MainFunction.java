package com.cg.lab1.exercise1;
import java.util.Scanner;

public class MainFunction {
	
		public static void main(String[] args) {
			SumOfNumber object = new SumOfNumber();
	    	int s;
	    	System.out.println("Enter the Number:");	
	    	Scanner sc=new Scanner(System.in);
	    	s=sc.nextInt();
	    	System.out.println(object.calculateSum(s));
	    	sc.close();
	      }

		}


