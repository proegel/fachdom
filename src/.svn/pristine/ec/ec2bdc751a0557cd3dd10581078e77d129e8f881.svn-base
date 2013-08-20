package fachdomaene.book;

import java.util.List;
import java.util.ArrayList;

public class Category {
	private static int id = 0;
	private List<Book> books;
	private String name;
	
	// Constructor
	public Category(String name, List<Book> books) {
		super();
		this.books = books;
		this.name = name;
		id++;
	}
	
	public Category(String name, Book book) {
		super();
		this.books = new ArrayList<Book>();
		this.books.add(book);
		this.name = name;
		id++;
	}
	
	public Category(String name) {
		super();
		this.books = new ArrayList<Book>();
		this.name = name;
		id++;
	}
	
	
	// Methods
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public String getName() {
		return name;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	public boolean equals( Category that ) { 
		return name.equals(that.getName()); 
	}
	
	public static int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Category [books=" + books + ", name=" + name + "]";
	}

}
