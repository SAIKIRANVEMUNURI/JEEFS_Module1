package com.cg.lab5.exercise5;

import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args) {
	
	System.out.println("Enter the age");
	Scanner sc = new Scanner(System.in);
	int age=sc.nextInt();
	sc.close();
	AgeException nn = new AgeException();
	nn.validate(age);
}

}
