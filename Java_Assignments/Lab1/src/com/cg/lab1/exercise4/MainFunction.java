package com.cg.lab1.exercise4;

import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args) {
		PowerOfTwo obj = new PowerOfTwo();
    	int l;
    	System.out.println("Enter");	
    	Scanner sc=new Scanner(System.in);
    	l=sc.nextInt();
    	System.out.println(obj.checkPower(l));
    	sc.close();
      }

}
