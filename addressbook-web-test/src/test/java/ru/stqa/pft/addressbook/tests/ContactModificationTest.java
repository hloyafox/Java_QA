package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("change1", "change2", "change3", "change4", null), false);
    app.getContactHelper().submitContactModification("//div[@id='content']/form/input[22]");
    app.getNavigationHelper().returnToHomePage();

  }

}
