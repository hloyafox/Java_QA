package ru.stqa.pft.addressbook.appmanager;

import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }
  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void fillContactForm (ContactData contactData)  {
    type(By.name("firstname"), contactData.getFname());
    type(By.name("lastname"), contactData.getLname());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getHome());
  }
  public void submitContactCreation(String submit) {
    click(By.name(submit));
  }


}
