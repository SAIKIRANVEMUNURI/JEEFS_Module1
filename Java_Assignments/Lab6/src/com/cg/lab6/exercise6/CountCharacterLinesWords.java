package com.cg.lab6.exercise6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class CountCharacterLinesWords {
	
	
		public static void main(String[] args) {
	
	      display("C:\\Users\\Hp\\Documents\\workspace-sts-3.9.2.RELEASE\\sample.txt");
	      
		}

		public static void display(String input)
		{
			File f=new File(input);
	      try(Scanner scan=new Scanner(f))
	      {
	    	  
	    	  ArrayList<String>lines=new ArrayList<>();
	    	  while(scan.hasNext())
	    	  {
	    	   lines.add(scan.nextLine());
	          }
	    	 int noOfLines=lines.size();
	    	 int noOfCharacters=0,noOfWords=0;
	    	 for(int i=0;i<lines.size();i++)
	    	 {
	    		String s1[]=lines.get(i).split(" ");
	    		noOfWords+=s1.length;
	    		  for(int j=0;j<s1.length;j++)
	    		  {
	    			 char arr[]=s1[j].toCharArray();
	    			 noOfCharacters+=arr.length;
	    		  }
	    	 }
	    	System.out.println("No of Characters:->"+noOfCharacters+"\nNo Of Words:->"+noOfWords+"\nNo of Lines:->"+noOfLines);  
	      }
	      catch(FileNotFoundException e)
	      {
	    	 System.out.println("File name does not exist!!"); 
	      }	
		}
	}


