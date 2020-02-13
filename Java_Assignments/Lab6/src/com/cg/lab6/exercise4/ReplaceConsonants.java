package com.cg.lab6.exercise4;

public class ReplaceConsonants {
	
 public String replace(String s)
 {
	 char a[]=s.toCharArray();
	 
	 
	 for(int i=0;i<s.length();i++)

	 {
		 
		 if(a[i]!='A' && a[i]!='E' && a[i]!='I' && a[i]!='O' && a[i]!='U'&& a[i] !='a'&& a[i]!='e' && a[i]!='i' && a[i]!='o' && a[i]!='u')
			{
				
				
				int cha=a[i];
				cha=cha+1;
				
			    a[i]=(char)cha;
				
		
			 
			 }

    }
	 
	 
	
	 String b=new String(a);
	 return b;

}
}


