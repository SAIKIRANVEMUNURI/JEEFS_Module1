package com.cg.lab5.exercise6;
import java.util.*;
import java.util.Scanner;



public class MainFunction {
	public static void main(String[] args) {
	
	System.out.println("Enter the salary");
	Scanner sc = new Scanner(System.in);
	int salary=sc.nextInt();
	sc.close();
	SalaryException nn = new SalaryException();
	nn.validate(salary);
}

}
