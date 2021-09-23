package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletion extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().deleteSelectedGroups("delete");
    app.getNavigationHelper().goToGroupPage();
  }

}
