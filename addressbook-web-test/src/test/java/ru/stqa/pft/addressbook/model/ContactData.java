package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String home;
  private final String address;


  public ContactData(String firstname, String lastname, String home, String address) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.home = home;
    this.address = address;
  }

  public String getFname() {
    return firstname;
  }

  public String getLname() {
    return lastname;
  }
  public String getHome() {
    return home;
  }

  public String getAddress() {
    return address;
  }
}
