package com.cg.lab6.exercise1;

import java.util.Scanner;

public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Integers:");
		Scanner sc =new Scanner(System.in);
		String s;
		s=sc.nextLine();
		StrTokenizer tt = new StrTokenizer();
		tt.display(s);

	}

}
