package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.ClientDataSourcePage;
import pages.methi.LoginPage;

public class TC24ClientDataSourcePage extends CommonAPI {

    @Test
    public void clientDataSource(){
        ClientDataSourcePage clientDataSource = new ClientDataSourcePage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        clientDataSource.hoverOver(getDriver());
        waitFor(2);

        clientDataSource.UIforAjaxClick();
        waitFor(2);

        clientDataSource.listOfControlsClick();
        waitFor(2);

        clientDataSource.controlsPresent();
        waitFor(2);

        clientDataSource.dataManagementPresent();
        waitFor(2);

        clientDataSource.clientDataSourceClick();
        waitFor(2);

        clientDataSource.clientAPI_EventsClick();
        waitFor(2);

        clientDataSource.clientIntegrationsClick();
        waitFor(2);

        clientDataSource.clientCRUD_OperationsClick();
        waitFor(2);

        clientDataSource.clientDataPopulationClick();
        waitFor(2);

        clientDataSource.clientWebServicesClick();
        waitFor(2);

        clientDataSource.clientDataOperationsClick();
        waitFor(2);

        String expectedResult = "https://www.telerik.com/products/aspnet-ajax/client-data-source.aspx";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(1);
        System.out.println("Test Successful");

    }
}
