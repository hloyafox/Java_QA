package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  public void submitGroupCreation(String submit) {
    click(By.name(submit));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation(String s) {
    click(By.name(s));
  }

  public void deleteSelectedGroups(String delete) {
    click(By.name(delete));
  }

  public void selectGroup(String name) {
    click(By.name(name));
  }

  public void initGroupModification() {
    click(By.name("edit"));
  }

  public void submitGroupModification() {
    click(By.name("update"));
  }

  public void returnToGroupPage()  {
      if (isElementPresent(By.tagName("h1"))
              && driver.findElement(By.tagName("h1")).getText().equals("Groups")
              && isElementPresent(By.name("new"))) {
        return;
      }
      click(By.linkText("groups"));
    }


  public void createGroup(GroupData group) {

    initGroupCreation("new");
    fillGroupForm(group);
    submitGroupCreation("submit");
    returnToGroupPage();
  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }
}
