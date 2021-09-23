package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {

  private GroupHelper groupHelper;

  public SessionHelper(WebDriver driver) {

    super(driver);
  }

  public void login(String username, String password) {
    driver.get("http://localhost:8080/addressbook/");
    type(By.name("user"), username);
    type(By.name("pass"), password);
    click(By.xpath("//input[@value='Login']"));
  }
}
