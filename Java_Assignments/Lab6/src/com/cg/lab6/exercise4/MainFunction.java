package com.cg.lab6.exercise4;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		System.out.println("Enter String:");
		Scanner sc =new Scanner(System.in);

	s=sc.nextLine();

ReplaceConsonants obj=new ReplaceConsonants();
System.out.println(obj.replace(s));

	}

}
