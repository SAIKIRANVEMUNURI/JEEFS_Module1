package com.cg.lab2.exercise1;

public abstract class Item {
	private int identificationNumber;
	private String title;
	private int numberOfCopies;
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int identificationNumber, String title, int numberOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}
	
	public String toString()
	{
		return String.format("ID:"+identificationNumber+"\n"+"Title:"+title+"\n"+"NumberOfCopies:"+numberOfCopies+"\n");
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (identificationNumber != other.identificationNumber)
			return false;
		if (numberOfCopies != other.numberOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
		
	public void print()
	{	
		System.out.println("DETAILS OF THE BOOK");
		System.out.println("ID:"+identificationNumber+"\n"+"Title:"+title+"\n"+"NumberOfCopies:"+numberOfCopies);
	}
	abstract public void checkIn();
	abstract public void checkOut();
	
	}
	

