package com.cg.lab6.exercise5;

import java.util.Scanner;


public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



Scanner sc=new Scanner(System.in);
System.out.println("enter the number");

int a=sc.nextInt();
ModifyNumber obj=new ModifyNumber();
System.out.println(obj.modifyNumber(a));
	}

}
