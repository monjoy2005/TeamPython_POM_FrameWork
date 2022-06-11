package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.KendoUIJQueryPage;
import pages.methi.KendoUIPage;
import pages.methi.LoginPage;

public class TC07KendoUIJQuery extends CommonAPI {

    @Test
    public void kendoUIJQuery(){
        KendoUIJQueryPage kendoUIJQuery = new KendoUIJQueryPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        kendoUIJQuery.hoverOver2(getDriver());
        waitFor(2);

        kendoUIJQuery.kendoUiJQueryClick();
        waitFor(2);

        kendoUIJQuery.setOverviewModernJQuery();
        waitFor(2);

        kendoUIJQuery.setDemoModernJQuery();
        waitFor(2);

        kendoUIJQuery.setBenefitsModernJQuery();
        waitFor(2);

        kendoUIJQuery.setComponentsModernJQuery();
        waitFor(2);

        String expectedResult = "Explore All jQuery Components";
        Assert.assertEquals(expectedResult, "Explore All jQuery Components");
        waitFor(1);
        System.out.println("Test Successful");
    }
}
