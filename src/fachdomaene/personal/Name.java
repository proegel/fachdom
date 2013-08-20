package fachdomaene.personal;

import java.util.regex.Pattern;

public class Name {
  private String title;

  private String name;

  private String surname;

  public Name(String title, String name, String surname) {
    this.title = title;
    this.name = name;
    this.surname = surname;
  }

  public Name(String name, String surname) {
    this.title = "";
    this.name = name;
    this.surname = surname;
  }

  public Name(String name) {
    name = name.trim();
    this.title = extractTitle(name);
    name = name.replace(extractTitle(name), "").trim();
    this.name = extractName(name).trim();
    this.surname = extractSurName(name).trim();
  }

  // Methods
  private String extractTitle(String input) {
    for (String tmp: input.split(Pattern.quote(" "))) {
      if (tmp.equals("Dr.") || tmp.equals("Prof.") || tmp.equals("Frau.") || tmp.equals("Herr.")) {
        return tmp;
      }
    }
    return "";
  }

  private String extractSurName(String input) {
    return input.substring(input.lastIndexOf(' '), input.length()).replace(",", "");
  }

  private String extractName(String input) {
    return input.substring(0, input.indexOf(' '));
  }

  public void returnNamewoTitle() {
    System.out.println(name + " " + surname);
  }

  public void returnNamewTitle() {
    System.out.println(title + " " + name + " " + surname);
  }

  // Getter_Setter
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Override
  public String toString() {
    return "Name [title=" + title + ", name=" + name + ", surname=" + surname + "]";
  }

}
