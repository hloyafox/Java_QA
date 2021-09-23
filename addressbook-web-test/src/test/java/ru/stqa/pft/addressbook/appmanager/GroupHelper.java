package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper {

  private WebDriver driver;

  public GroupHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void submitGroupCreation(String submit) {
    driver.findElement(By.name(submit)).click();
  }

  public void fillGroupForm(GroupData groupData) {
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).clear();
    driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).clear();
    driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    driver.findElement(By.name("group_footer")).clear();
    driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation(String s) {
    driver.findElement(By.name(s)).click();
  }

  public void deleteSelectedGroups(String delete) {
    driver.findElement(By.name(delete)).click();
  }

  public void selectGroup(String name) {
    driver.findElement(By.name(name)).click();
  }
}
