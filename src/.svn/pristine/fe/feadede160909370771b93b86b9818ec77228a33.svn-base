package fachdomaene.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import fachdomaene.book.Book;
import fachdomaene.book.Category;
import fachdomaene.core.Rental;
import fachdomaene.personal.Member;

public class FachDomaeneImpl implements FachDomaeneDebug, FachDomaeneService {
  private List<Member> member = new ArrayList<Member>();

  private List<Category> categories = new ArrayList<Category>();

  private List<Book> books = new ArrayList<Book>();

  private List<Rental> rentals = new ArrayList<Rental>();

  // Kategorie anlegen
  @Override
  public Category newCategory(String name) {
    Category tmp;
    for (Category category: categories) {
      if (category.getName().equals(name)) {
        return category;
      }
    }
    tmp = new Category(name);
    categories.add(tmp);
    return tmp;
  }
  
  public void newCategories(String input) {
    for (String tmp : input.split(Pattern.quote(","))) {
      newCategory(tmp);
    }
  }

  // Buch anlegen
  @Override
  public Book newBook(String name, String date, String catname) {
    Book tmp = new Book(name, date, newCategory(catname));
    books.add(tmp);
    return tmp;
  }

  @Override
  public void newBooks(String input) {
    for (String tmp: input.split(Pattern.quote(","))) {
      String[] book = tmp.split(Pattern.quote(":"));
      try {
        newBook(book[0], book[1], book[2]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Fehler beim anlegen des Buches '" + input + "'. Falsches Format!"
            + "Richtiges Format: 'Titel:Erscheinungsjahr(tt/mm/yyyy):Kategorie'");
      }

    }
  }

  // Member anlegen
  @Override
  public Member newMember(String name, String mail) {
    Member tmp = new Member(name, mail);
    member.add(tmp);
    return tmp;
  }
  
  public void newMember(String input) {
    for (String tmp: input.split(Pattern.quote(","))) {
      String[] member = tmp.split(Pattern.quote(":"));
      try {
        newMember(member[0],member[1]);
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Fehler beim anlegen des Members '" + input + "'. Falsches Format!"
            + "Richtiges Format: 'Titel Name Nachname:Email'");
      }
    }
  }

  // Neuen Verleihvorgang anlegen
  @Override
  public boolean newRent(int leaser, int book) {
    Rental tmp = member.get(leaser).rentBook(books.get(book));
    if (tmp != null) {
      return rentals.add(tmp);
    }
    return false;
  }

  @Override
  public boolean newRent(int leaser, int book, int deadline) {
    Rental tmp = member.get(leaser).rentBook(books.get(book), deadline);
    if (tmp != null) {
      return rentals.add(tmp);
    }
    return false;
  }

  // NUR ZUM TESTEN
  public boolean newRent(int leaser, int book, String date) {
    Rental tmp = member.get(leaser).rentBook(books.get(book), date);
    if (tmp != null) {
      return rentals.add(tmp);
    }
    return false;
  }

  // NUR ZUM TESTEN

  // Verleihvorgang beenden
  @Override
  public void returnRent(int book) {
    books.get(book).clearRented();
  }

  // check Deadline
  @Override
  public void checkDeadline() {
    for (Rental rent: rentals) {
      if (rent.checkDeadline()) {
        System.out.println("Die Deadline vom Buch '" + rent.getBook().getTitle() + "' [ID:" + rentals.indexOf(rent) + "] ist erreicht!");
      }
    }
  }

  @Override
  public void reclaimBook(int book) {
    rentals.get(book).clearRented();
  }

  @Override
  public void extendDeadline(int book) {
    rentals.get(book).extendDeadline(book);

  }

  @Override
  public List<Member> getMember() {
    return member;
  }

  @Override
  public void setMember(List<Member> member) {
    this.member = member;
  }

  @Override
  public List<Category> getCategories() {
    return categories;
  }

  @Override
  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }

  @Override
  public List<Book> getBooks() {
    return books;
  }

  @Override
  public void setBooks(List<Book> books) {
    this.books = books;
  }

  @Override
  public List<Rental> getRentals() {
    return rentals;
  }

  @Override
  public void setRentals(List<Rental> rentals) {
    this.rentals = rentals;
  }

  // Ausgaben
  public void printBookTitles() {
    StringBuilder output = new StringBuilder();
    for (Book book: books) {
      output.append(book.getTitle()).append(", ");
    }
    System.out.println(output.toString().trim());
  }

  public void printMember() {
    System.out.println("----------printMember()----------");
    for (Member user: member) {
      System.out.println("ID:" + member.indexOf(user) + ", " + user.toString());
    }
    System.out.println("---------------------------------");
  }

  public void printCategories() {
    System.out.println("--------printCategories()--------");
    for (Category category: categories) {
      System.out.println("ID:" + categories.indexOf(category) + ", " + category.toString());
    }
    System.out.println("---------------------------------");
  }

  public void printBooks() {
    System.out.println("----------printBooks()-----------");
    for (Book book: books) {
      System.out.println("ID:" + books.indexOf(book) + ", " + book.toString());
    }
    System.out.println("---------------------------------");
  }

  public void printRents() {
    System.out.println("----------printRents()-----------");
    for (Rental rental: rentals) {
      System.out.println("ID:" + rentals.indexOf(rental) + ", " + rental.toString());
    }
    System.out.println("---------------------------------");
  }

  public void printIds() {
    System.out.println("-----------printIds()------------");
    System.out.println("Member:" + Member.getId() + ", Kategorien:" + Category.getId() + ", Buecher:" + Book.getId()
        + ", Verleihvorgaenge:" + Rental.getId());
    System.out.println("---------------------------------");
  }

}
