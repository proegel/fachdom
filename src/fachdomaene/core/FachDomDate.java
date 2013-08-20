package fachdomaene.core;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

public class FachDomDate {
  private final String DATE_FORMAT = "dd.MM.yyyy";

  private final SimpleDateFormat DATE = new SimpleDateFormat(DATE_FORMAT);

  private Calendar date;

  // Konstruktoren
  public FachDomDate(int date, int month, int year) {
    this.date = Calendar.getInstance();
    this.date.clear();
    this.date.set(year, month, date);
  }

  public FachDomDate(String date) throws ArrayIndexOutOfBoundsException {
    this.date = Calendar.getInstance();
    String[] tmp = date.split(Pattern.quote("/"), 3);
    this.date.clear();
    this.date.set(Integer.parseInt(tmp[2]), Integer.parseInt(tmp[1]) - 1, Integer.parseInt(tmp[0]));
  }

  public FachDomDate() {
    this.date = Calendar.getInstance();
  }

  // Methoden
  public void setDate(int day, int month, int year) {
    date.clear();
    date.set(year, month, day);
  }

  public int getDateDif(FachDomDate then) {
    long time = then.date.getTime().getTime() - date.getTime().getTime();
    int days = (int)Math.round((double)time / (24. * 60. * 60. * 1000.));
    return days;
  }

  @Override
  public String toString() {
    return DATE.format(date.getTime());
  }

}
