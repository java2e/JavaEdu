package org.model;

public class Author {
	
	public String name;
	
	public int birthYear;

	public Adress [] adress;
	
	public Author(String name,int birthYear,Adress [] adress) {

		this.name=name;
		this.birthYear=birthYear;
		this.adress=adress;
		
	}
	
	public Author() {

		System.out.println("create author object");
	}
	
	public String getAuthorName()
	{
		return this.name;
	}

}
