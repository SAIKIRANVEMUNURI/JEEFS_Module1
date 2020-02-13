package com.cg.lab7.exercise6;

import java.util.Map;
import java.util.*;

public class VoteValidate {
	
	
		
		public List<Integer> check(HashMap<Integer,Integer> map)
		{
			
		 List<Integer> list=new ArrayList<Integer>();	
		 for(Map.Entry<Integer, Integer> obj:map.entrySet())
		 {
			 
			 
			 if(obj.getValue()>18)
			 {
				 
			  list.add(obj.getKey());
				 
				 
			 }
			 
			 
			 
		 }
		return list;
					
			
		}
		
		
}
