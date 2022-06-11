package Application.Telerik;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.KendoUIPage;
import pages.methi.LoginPage;

public class TC06KendoUIPage extends CommonAPI {

    @Test
    public void kendoUIPage(){
        KendoUIPage kendoUIPage = new KendoUIPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        kendoUIPage.hoverOver(getDriver());
        waitFor(2);

        kendoUIPage.kendoUiClick();
        waitFor(2);

        kendoUIPage.overviewKendoClick();
        waitFor(2);

        kendoUIPage.featuresKendoClick();
        waitFor(2);

        kendoUIPage.componentsKendoClick();
        waitFor(2);

        kendoUIPage.jqueryKendoUIClick();
        waitFor(1);

        kendoUIPage.angularKendoUIClick();
        waitFor(1);

        kendoUIPage.reactKendoUIClick();
        waitFor(1);

        kendoUIPage.vueKendoUIClick();
        waitFor(1);

        String expectedResult = "All Kendo UI JavaScript Component Libraries";
        Assert.assertEquals(expectedResult, "All Kendo UI JavaScript Component Libraries");
        waitFor(1);
        System.out.println("Test Successful!");


    }

}
