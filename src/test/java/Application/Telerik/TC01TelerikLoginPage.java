package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;

public class TC01TelerikLoginPage extends CommonAPI {

    @Test
    public void telerikLogin(){
        LoginPage loginPage = new LoginPage(getDriver());

        loginPage.clickYourAccount();
        waitFor(2);

        loginPage.typeEmail();
        waitFor(2);

        loginPage.typePassword();
        waitFor(2);

        loginPage.clickLoginBtn();
        waitFor(2);

        loginPage.clickWithActionsCookies(getDriver());
        waitFor(2);

        loginPage.mainAccountName();
        waitFor(2);

        String expectedResult = "https://www.telerik.com/account/";
        Assert.assertEquals(expectedResult, getPageUrl());
        waitFor(2);
        System.out.println("Test Successful");


    }

}
