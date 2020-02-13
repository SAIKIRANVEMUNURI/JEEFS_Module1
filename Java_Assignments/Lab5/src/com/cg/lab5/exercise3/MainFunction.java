package com.cg.lab5.exercise3;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
	
		
			PrimeNumber nm =new PrimeNumber();
	   nm.printPrime(l);
	}

}
