package fachdomaene.personal;

import java.util.ArrayList;
import java.util.List;

import fachdomaene.book.Book;
import fachdomaene.core.Rental;
import fachdomaene.service.*;

public class Member implements FachDomaeneDebug {
  private static long id = 0;

  private Name name;

  private String mail;

  private List<Rental> rentals;

  // Constructor
  public Member(String name, String mail) {
    super();
    this.name = new Name(name);
    this.mail = mail;
    this.rentals = new ArrayList<Rental>();
    id++;
  }

  // Methods
  @SuppressWarnings("finally")
  public Rental rentBook(Book book) {
    Rental tmp = null;
    try {
      if (book.isAvailable()) {
        tmp = new Rental(this, book);
        rentals.add(tmp);
        book.setRented(tmp);
      }
    } catch (NullPointerException e) {
      tmp = new Rental(this, book);
      rentals.add(tmp);
      book.setRented(tmp);
    } finally {
      return tmp;
    }
  }

  @SuppressWarnings("finally")
  public Rental rentBook(Book book, int deadline) {
    Rental tmp = null;
    try {
      if (book.isAvailable()) {
        tmp = new Rental(this, book, deadline);
        rentals.add(tmp);
        book.setRented(tmp);
      }
    } catch (NullPointerException e) {
      tmp = new Rental(this, book, deadline);
      rentals.add(tmp);
      book.setRented(tmp);
    } finally {
      return tmp;
    }
  }

  // NUR ZUM TESTEN
  @SuppressWarnings("finally")
  public Rental rentBook(Book book, String date) {
    Rental tmp = null;
    try {
      if (book.isAvailable()) {
        tmp = new Rental(this, book, date);
        rentals.add(tmp);
        book.setRented(tmp);
      }
    } catch (NullPointerException e) {
      tmp = new Rental(this, book, date);
      rentals.add(tmp);
      book.setRented(tmp);
    } finally {
      return tmp;
    }
  }

  // NUR ZUM TESTEN

  public void checkDeadline() {
    for (Rental rent: rentals) {
      rent.checkDeadline();
    }
  }

  public void clearRented(Book book) {
    for (Rental rent: rentals) {
      if (rent.getBook().equals(book)) {
        rent.clearRented();
      }
    }
  }

  // Getter_Setter
  public String getSurname() {
    return name.getSurname();
  }

  public void setSurname(String surname) {
    name.setSurname(surname);
  }

  public static long getId() {
    return id;
  }

  public String getName() {
    return name.getName();
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String newMail) {
    mail = newMail;
  }

  public List<Rental> getRentals() {
    return rentals;
  }

  @Override
  public String toString() {
    return "Member [name=" + name + ", mail=" + mail + ", rentals=" + rentals + "]";
  }

}
