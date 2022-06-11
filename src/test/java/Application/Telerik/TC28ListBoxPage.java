package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.FilterPage;
import pages.methi.ListBoxPage;
import pages.methi.LoginPage;

public class TC28ListBoxPage extends CommonAPI {
    @Test
    public void listBox() {
        ListBoxPage listBox = new ListBoxPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        listBox.hoverOver(getDriver());
        waitFor(2);

        listBox.UIforAjaxClick();
        waitFor(2);

        listBox.listOfControlsClick();
        waitFor(2);

        listBox.controlsPresent();
        waitFor(2);

        listBox.dataManagementPresent();
        waitFor(2);

        listBox.listBoxClick();
        waitFor(2);

        listBox.listingItemsClick();
        waitFor(2);

        listBox.dataBindingClick();
        waitFor(2);

        listBox.checkBoxesClick();
        waitFor(2);

        listBox.dragDropClick();
        waitFor(2);

        listBox.templatesClick();
        waitFor(2);

        listBox.loadDemandClick();
        waitFor(2);

        listBox.clientAPIClick();
        waitFor(2);

        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/listbox.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
        System.out.println("Test Successful");
    }
}
