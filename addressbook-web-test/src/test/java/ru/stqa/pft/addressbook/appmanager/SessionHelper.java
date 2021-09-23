package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper {
  private WebDriver driver;
  private GroupHelper groupHelper;

  public SessionHelper(WebDriver driver) {

    this.driver = driver;
  }

  public void login(String username, String password) {
    groupHelper = new GroupHelper(driver);
    driver.get("http://localhost:8080/addressbook/");
    groupHelper.initGroupCreation("user");
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }
}
