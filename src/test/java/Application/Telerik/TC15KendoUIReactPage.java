package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.KendoUIReactPage;
import pages.methi.LoginPage;

public class TC15KendoUIReactPage extends CommonAPI {

    @Test
    public void kendoReactPage(){
        KendoUIReactPage kendoReactPage = new KendoUIReactPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        kendoReactPage.hoverOver(getDriver());
        waitFor(2);

        kendoReactPage.kendoUIReactClick();
        waitFor(2);

        kendoReactPage.setOverviewModernReact();
        waitFor(2);

        kendoReactPage.setDemoModernReact();
        waitFor(2);

        kendoReactPage.setBenefitsModernReact();
        waitFor(2);

        kendoReactPage.setDesignToolsReact();
        waitFor(2);

        kendoReactPage.setComponentsModernReact();
        waitFor(2);

        String expectedResult = "Explore All 100+ React UI Components\n";
        Assert.assertEquals(expectedResult, "Explore All 100+ React UI Components\n");
        waitFor(2);
        System.out.println("Test Successful");
    }


}
