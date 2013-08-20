package fachdomaene.service;

import java.util.List;

import fachdomaene.book.Book;
import fachdomaene.book.Category;
import fachdomaene.core.Rental;
import fachdomaene.personal.Member;

public interface FachDomaeneService {

  public Category newCategory(String name);

  public void newCategories(String input);
  
  public Book newBook(String name, String date, String catname);

  public void newBooks(String input);

  public Member newMember(String name, String mail);
  
  public void newMember(String input);

  public boolean newRent(int leaser, int book);

  public boolean newRent(int leaser, int book, int deadline);

  public void returnRent(int book);

  public void checkDeadline();

  public void reclaimBook(int book);

  public void extendDeadline(int book);

  public List<Member> getMember();

  public void setMember(List<Member> member);

  public List<Category> getCategories();

  public void setCategories(List<Category> categories);

  public List<Book> getBooks();

  public void setBooks(List<Book> books);

  public List<Rental> getRentals();

  public void setRentals(List<Rental> rentals);

}