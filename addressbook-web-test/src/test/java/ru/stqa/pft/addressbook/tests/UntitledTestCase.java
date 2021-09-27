package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;


public class UntitledTestCase extends TestBase {

  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(new GroupData("testgroup1", null, null));
    app.getGroupHelper().submitGroupCreation("submit");
    app.getNavigationHelper().goToGroupPage();
  }

}
