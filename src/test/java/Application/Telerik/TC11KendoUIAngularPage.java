package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.KendoUIAngularPage;
import pages.methi.LoginPage;

public class TC11KendoUIAngularPage extends CommonAPI {

    @Test
    public void kendoAngularPage(){
        KendoUIAngularPage kendoAngularPage = new KendoUIAngularPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        kendoAngularPage.hoverOver(getDriver());
        waitFor(2);

        kendoAngularPage.kendoUIAngularClick();
        waitFor(2);

        kendoAngularPage.setOverviewModernAngular();
        waitFor(2);

        kendoAngularPage.setDemoModernAngular();
        waitFor(2);

        kendoAngularPage.setBenefitsModernAngular();
        waitFor(2);

        kendoAngularPage.setComponentsModernAngular();
        waitFor(2);

        String expectedResult = "Explore All Angular Components";
        Assert.assertEquals(expectedResult, "Explore All Angular Components");
        waitFor(1);
        System.out.println("Test Successful");
    }


}
