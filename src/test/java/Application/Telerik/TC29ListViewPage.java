package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.ListViewPage;
import pages.methi.LoginPage;

public class TC29ListViewPage extends CommonAPI {

    @Test
    public void listView() {
        ListViewPage listView = new ListViewPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        listView.hoverOver(getDriver());
        waitFor(2);

        listView.UIforAjaxClick();
        waitFor(2);

        listView.listOfControlsClick();
        waitFor(2);

        listView.controlsPresent();
        waitFor(2);

        listView.dataManagementPresent();
        waitFor(2);

        listView.listViewClick();
        waitFor(2);

        listView.insertUpdateDeleteClick();
        waitFor(2);

        listView.sortingPagingGroupingSelectionClick();
        waitFor(2);

        listView.filteringClick();
        waitFor(2);

        listView.dragDropClick();
        waitFor(2);

        listView.clientSideTemplatesClick();
        waitFor(2);

        listView.serverSideDataBindingClick();
        waitFor(2);

        listView.templatesClick();
        waitFor(2);

        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/listview.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
        System.out.println("Test Successful");
    }
}
