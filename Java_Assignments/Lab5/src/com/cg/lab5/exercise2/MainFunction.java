package com.cg.lab5.exercise2;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
			Fibonacci fb=new Fibonacci();
		System.out.println(fb.getFibo(l));
	}


	}


