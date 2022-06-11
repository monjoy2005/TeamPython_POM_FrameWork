package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.FilterPage;
import pages.methi.LoginPage;

public class TC27FilterPage extends CommonAPI {

    @Test
    public void filterPage(){
        FilterPage filterPage = new FilterPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        filterPage.hoverOver(getDriver());
        waitFor(2);

        filterPage.UIforAjaxClick();
        waitFor(2);

        filterPage.listOfControlsClick();
        waitFor(2);

        filterPage.controlsPresent();
        waitFor(2);

        filterPage.dataManagementPresent();
        waitFor(2);

        filterPage.filterClick();
        waitFor(2);

        filterPage.filteringAbilites();
        waitFor(2);

        filterPage.customFieldsClick();
        waitFor(2);

        filterPage.filterIntegrationClick();
        waitFor(2);

        filterPage.saveAndLoadFiltersClick();
        waitFor(2);

        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/filter.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
        System.out.println("Test Successful");
    }
}
