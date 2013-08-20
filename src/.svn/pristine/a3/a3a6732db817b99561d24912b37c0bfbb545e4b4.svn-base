package fachdomaene.book;

import java.util.ArrayList;
import java.util.List;

import fachdomaene.core.FachDomDate;
import fachdomaene.core.Rental;

public class Book {
  private static int id = 0;

  private String title;

  private FachDomDate releaseDate;

  private List<Rental> rentals;

  private Category category;

  // Constructor
  public Book(String title, String date, Category category) throws ArrayIndexOutOfBoundsException {
    super();
    this.title = title;
    this.releaseDate = new FachDomDate(date);
    this.category = category;
    this.rentals = new ArrayList<Rental>();
    id++;
  }

  // Methods
  public boolean isAvailable() throws NullPointerException {
    // if ( rentals != null)
    for (Rental rent: rentals) {
      if (rent.isActive()) {
        return false;
      }
    }
    return true;
  }

  public boolean clearRented() {
    for (Rental rent: rentals) {
      if (rent.isActive()) {
        rent.clearRented();
        return true;
      }
    }
    return false;
  }

  // Getter_Setter
  public void setRented(Rental rental) {
    if (rental == null) {
      System.out.println("NULL");
    }
    this.rentals.add(rental);
  }

  public Rental getRented() {
    for (Rental rent: rentals) {
      if (rent.isActive()) {
        return rent;
      }
    }
    return null;
  }

  public String getTitle() {
    return title;
  }

  public FachDomDate getReleaseDate() {
    return releaseDate;
  }

  public Category getCategory() {
    return category;
  }

  public static int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Book [title=" + title + ", releaseDate=" + releaseDate + ", category=" + category.getName() + "]";
  }
}
