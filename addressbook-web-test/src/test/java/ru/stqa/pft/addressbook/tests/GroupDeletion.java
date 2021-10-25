package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletion extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    
    app.getNavigationHelper().goToGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().deleteSelectedGroups("delete");
    app.getNavigationHelper().goToGroupPage();
  }

}
