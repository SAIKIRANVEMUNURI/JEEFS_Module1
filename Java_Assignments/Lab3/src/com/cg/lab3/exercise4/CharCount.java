package com.cg.lab3.exercise4;

public class CharCount {
	public void countChar(char a[])
	{
		int freq[]=new int[10];
		int visited=-1;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited)
			{
				freq[i]=count;
			}
		}
		for(int k=0;k<a.length;k++)
		{
			if(freq[k]!=visited)
			{
				System.out.println("Frequency of"+a[k]+ "is" + freq[k]);
			}
		}
	}

}
