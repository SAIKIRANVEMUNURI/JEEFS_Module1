package com.cg.lab10.exercise2;

interface StringLamda 
{

	String space(String name);
}

public class SpaceBetweenCharacter 
		{
			public static void main(String args[])
		
			{
				StringLamda obj = (name)->
				{
				char [] array = new char[name.length()];
				for(int i=0;i<name.length();i++)
				{
					array[i] = name.charAt(i);
				}
				char arr[]=new char[array.length*2];
				 for(int i=0;i<arr.length;i++)
					 arr[i]=' ';
				 int index=0;
				 for(int i=0;i<arr.length;i=i+2)
					 arr[i]=array[index++];
				 String result=new String(arr); 
				return result;
				};
				System.out.println(obj.space("CG"));
			}
		}
