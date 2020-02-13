package com.cg.lab2.exercise1;

public abstract class MediaItem extends Item {
	
	private int runTime;
	public MediaItem(int identificationNumber, int numberOfCopies, String title,int runTime) {
		super(identificationNumber,title,numberOfCopies);
		this.runTime=runTime;
	}


}
