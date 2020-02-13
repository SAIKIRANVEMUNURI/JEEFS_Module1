package com.cg.lab6.exercise3;

public class MirrorImage {
	public StringBuffer getImage(StringBuffer k)
	{
		String temp=k.toString();
		StringBuffer rev;
		StringBuffer add = new StringBuffer();
		rev=k.reverse();
		add.append(temp + " | "+ rev);
		return add;
		}

}
