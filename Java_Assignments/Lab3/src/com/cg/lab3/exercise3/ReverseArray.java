package com.cg.lab3.exercise3;

public class ReverseArray {
	public int[] getReverseSort(int a[])
	{
	
		int i=0;
		int j=a.length;
		int temp;
		while(i<j)
		{
			temp=a[j-1];
			a[j-1]=a[i];
			a[i]=temp;
			i++;
			j--;
		}
		System.out.println("after reverse");
		for(int m:a)
		{
			System.out.println(m);
		}
		System.out.println("after sort");
		for(i=0;i<a.length;i++) 
		{
			for(j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		} return a;
		
	}

}
