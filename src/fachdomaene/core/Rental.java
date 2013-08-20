package fachdomaene.core;

import fachdomaene.book.Book;
import fachdomaene.personal.Member;

public class Rental {
  private static long id = 0;

  private Member leaser;

  private Book book;

  private FachDomDate rentalDate;

  private int deadline = 28;

  private boolean active;

  // Constructor
  public Rental(Member leaser, Book book, int deadline) {
    super();
    this.leaser = leaser;
    this.book = book;
    this.rentalDate = new FachDomDate();
    this.deadline = deadline;
    this.active = true;
    id++;
  }

  public Rental(Member leaser, Book book) {
    super();
    this.leaser = leaser;
    this.book = book;
    this.rentalDate = new FachDomDate();
    this.active = true;
    id++;
  }

  // NUR ZUM TESTEN
  public Rental(Member leaser, Book book, String date) throws ArrayIndexOutOfBoundsException {
    super();
    this.leaser = leaser;
    this.book = book;
    this.rentalDate = new FachDomDate(date);
    this.active = true;
    id++;
  }

  // NUR ZUM TESTEN

  // Methods
  public void clearRented() {
    active = false;
  }

  public boolean isActive() {
    return active;
  }

  public boolean checkDeadline() {
    if (rentalDate.getDateDif(new FachDomDate()) > deadline && active == true) {
      return true;
    }
    return false;
  }

  public void extendDeadline(int newDeadline) {
    deadline = newDeadline;
  }

  // Getter_Setter
  public FachDomDate getRentalDate() {
    return rentalDate;
  }

  public int getDeadline() {
    return deadline;
  }

  public Member getLeaser() {
    return leaser;
  }

  public Book getBook() {
    return book;
  }

  public static long getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Rental [leaser=" + leaser.getName() + ", book=" + book.getTitle() + ", rentalDate=" + rentalDate + ", deadline=" + deadline
        + ", active=" + active + "]";
  }

}
