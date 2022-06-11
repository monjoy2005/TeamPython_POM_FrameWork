package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.DataPagerPage;
import pages.methi.LoginPage;

public class TC25DataPagerPage extends CommonAPI {

    @Test
    public void dataPager(){
        DataPagerPage dataPager = new DataPagerPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        dataPager.hoverOver(getDriver());
        waitFor(2);

        dataPager.UIforAjaxClick();
        waitFor(2);

        dataPager.listOfControlsClick();
        waitFor(2);

        dataPager.controlsPresent();
        waitFor(2);

        dataPager.dataManagementPresent();
        waitFor(2);

        dataPager.dataPagerClick();
        waitFor(2);

        dataPager.utilizeControlsClick();
        waitFor(2);

        dataPager.integrationsWithASPControlsClick();
        waitFor(2);

        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/datapager.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
        System.out.println("Test Successful");

    }

}
