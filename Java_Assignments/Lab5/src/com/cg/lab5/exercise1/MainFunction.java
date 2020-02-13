package com.cg.lab5.exercise1;

import java.util.Scanner;

public class MainFunction {

public static void main(String[] args) {
		
		
        Scanner sc=new Scanner(System.in);
		
		
		System.out.println("what do u want from these three:-  red,green,orange");
		
		String name;
		name=sc.nextLine();
		
		FlowControl obj=new FlowControl();
		obj.control(name);
		sc.close();
		
		
		

	}

}
