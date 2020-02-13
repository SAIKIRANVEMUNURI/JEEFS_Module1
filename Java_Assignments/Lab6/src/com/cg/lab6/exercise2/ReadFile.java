package com.cg.lab6.exercise2;
import java.io.*;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("C:\\Users\\Hp\\Documents\\workspace-sts-3.9.2.RELEASE\\sample.txt");
		try(Scanner sc=new Scanner(f)) 
		{
			int i=1;
			while(sc.hasNext())
			{
				System.out.println(i++ +":"+ sc.nextLine());
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Does not Exists!");
		}

	}

}
