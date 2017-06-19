package org.tool;

import org.model.Author;

public class Book {

	
	public String bookName;
	
	public String ISBN;
	
	public Author author;
	
	public void printAuthorAndBook()
	{
		System.out.println("Book Name :"+this.bookName+" Author :"
	+this.author.name +" Author City :"+this.author.adress[0].city);
		
		System.out.println("Ýkinci Adresi :");
		
		System.out.println(this.author.adress[1].city);
	}
	
	
}
