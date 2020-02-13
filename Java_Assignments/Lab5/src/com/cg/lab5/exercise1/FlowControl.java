package com.cg.lab5.exercise1;

public class FlowControl {
	public void control(String name)
	{
		
		switch(name)
		{
		
		case "red":System.out.println("Stop");
		            break;
		case "orange":System.out.println("ready");
		            break;
		case "green":System.out.println("go");
		            break;
		default:System.out.println("wrong choice");
		
				
		}
		
	}
}
