package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.KendoUIVuePage;
import pages.methi.LoginPage;

public class TC19KendoUIVuePage extends CommonAPI {

    @Test
    public void kendoUIVuePage(){
        KendoUIVuePage kendoUIVuePage = new KendoUIVuePage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        kendoUIVuePage.hoverOver(getDriver());
        waitFor(2);

        kendoUIVuePage.kendoUIVueClick();
        waitFor(2);

        kendoUIVuePage.setOverviewModernVue();
        waitFor(2);

        kendoUIVuePage.setDemoModernVue();
        waitFor(2);

        kendoUIVuePage.setBenefitsModernVue();
        waitFor(2);

        kendoUIVuePage.setComponentsModernVue();
        waitFor(2);

        String expectedResult = "Explore All Vue Components";
        Assert.assertEquals(expectedResult, "Explore All Vue Components");
        waitFor(2);
        System.out.println("Test Successful");
    }

}
