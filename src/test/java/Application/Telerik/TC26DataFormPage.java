package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.DataFormPage;
import pages.methi.LoginPage;

public class TC26DataFormPage extends CommonAPI {

    @Test
    public void dataForm(){
        DataFormPage dataForm = new DataFormPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        dataForm.hoverOver(getDriver());
        waitFor(2);

        dataForm.UIforAjaxClick();
        waitFor(2);

        dataForm.listOfControlsClick();
        waitFor(2);

        dataForm.controlsPresent();
        waitFor(2);

        dataForm.dataManagementPresent();
        waitFor(2);

        dataForm.dataFormClick();
        waitFor(2);

        dataForm.presentDataClick();
        waitFor(2);

        dataForm.insert_Update_DeleteOperationsClick();
        waitFor(2);

        dataForm.serverSideDataBindingClick();
        waitFor(2);

        dataForm.builtInValidationClick();
        waitFor(2);

        dataForm.scalableAndFluidBehaviorClick();
        waitFor(2);

        dataForm.lightweightRenderingClick();
        waitFor(2);

        dataForm.studioIntegrationDesignSupportClick();
        waitFor(2);

        dataForm.builtInSkinsClick();
        waitFor(2);

        dataForm.crossBrowserSupportClick();
        waitFor(2);

        String expectedURL = "https://www.telerik.com/products/aspnet-ajax/dataform.aspx";
        Assert.assertEquals(expectedURL, getPageUrl());
        waitFor(2);
        System.out.println("Test Successful");
    }
}
