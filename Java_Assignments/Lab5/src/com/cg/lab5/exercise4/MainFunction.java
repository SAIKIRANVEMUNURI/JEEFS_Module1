package com.cg.lab5.exercise4;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname,lname;
		System.out.println("Enter the fname");
		Scanner sc = new Scanner(System.in);
		fname=sc.nextLine();
		System.out.println("Enter the lname");
		Scanner ss = new Scanner(System.in);
		lname=ss.nextLine();
		sc.close();
		ss.close();
		
		NameException nn = new NameException();
		nn.validate(fname, lname);
		
	}

	}


