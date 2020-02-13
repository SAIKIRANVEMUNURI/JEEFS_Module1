package com.cg.lab2.exercise1;

public abstract class WrittenItem extends Item {
	
	private String author;

	public WrittenItem(int identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber,title,numberOfCopies);
		
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
public void print()
{
	super.print();
	System.out.println("Author Name:"+author);

}
	
}
