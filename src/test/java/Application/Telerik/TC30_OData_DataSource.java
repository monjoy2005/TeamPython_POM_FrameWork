package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.ListViewPage;
import pages.methi.LoginPage;
import pages.methi.OData_DataSourcePage;

public class TC30_OData_DataSource extends CommonAPI {

    @Test
    public void OdataSource() {
        OData_DataSourcePage OdataSource = new OData_DataSourcePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        OdataSource.hoverOver(getDriver());
        waitFor(2);

        OdataSource.UIforAjaxClick();
        waitFor(2);

        OdataSource.listOfControlsClick();
        waitFor(2);

        OdataSource.controlsPresent();
        waitFor(2);

        OdataSource.dataManagementPresent();
        waitFor(2);

        OdataSource.OdataClick();
        waitFor(2);

        OdataSource.OdataBindingClick();
        waitFor(2);

        OdataSource.schemaGenerationClick();
        waitFor(2);

        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/odatadatasource.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
        System.out.println("Test Successful");
    }
}
