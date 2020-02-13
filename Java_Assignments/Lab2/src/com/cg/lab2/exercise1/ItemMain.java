package com.cg.lab2.exercise1;
import java.util.Scanner;
public class ItemMain {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			int id,num;
			String name,author;
			
			System.out.println("Enter the Book ID:");
			id=sc.nextInt();
			
			
			System.out.println("Enter the Book Title:");
			name=sc.next();
			
			
			
			System.out.println("Enter number of Copies:");
			num=sc.nextInt();
			
			
			Book obj=new Book(id,name,num);
			
		    System.out.println("Enter the Author Name");
		    author=sc.next();
		    obj.setAuthor(author);
		    obj.print();
		    sc.close();	

		}

	}


