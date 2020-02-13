package com.cg.lab7.exercise6;

import java.util.HashMap;

import java.util.*;
public class MainFunction {
	
	
		
		public static void main(String args[])
		{
		
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		
		
		map.put(1,25);
		map.put(2,18);
		map.put(8,10);
		map.put(5,50);
		
		
		
		VoteValidate obj=new VoteValidate();
		List<Integer>list=obj.check(map);
		System.out.println("eligible ids are"+list);
			
		}
	}



