package com.cg.lab6.exercise1;
import java.util.StringTokenizer;


public class StrTokenizer {
	public void display(String s)
	{
		
	
	int sum=0;
	StringTokenizer st =new StringTokenizer(s," ");
	int a[]=new int[s.length()];
	int i=0,count=0;
	while(st.hasMoreTokens())
	{
		a[i]=Integer.parseInt(st.nextToken());
		i++;
		count=i;
		}
	for(i=0;i<count;i++)
	{
		System.out.println(a[i]);
		sum=sum+a[i];
	}
	
	System.out.println("Sum is:"+sum);
	
	}
	}
