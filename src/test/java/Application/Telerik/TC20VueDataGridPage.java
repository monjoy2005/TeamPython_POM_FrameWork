package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.VueDataGridPage;

public class TC20VueDataGridPage extends CommonAPI {

    @Test
    public void vueDataGrid(){
        VueDataGridPage vueDataGridPage = new VueDataGridPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        vueDataGridPage.hoverOver(getDriver());
        waitFor(2);

        vueDataGridPage.UIforVueClick();
        waitFor(2);

        vueDataGridPage.componentsVueClick();
        waitFor(2);

        vueDataGridPage.vueDataGridClick();
        waitFor(2);

        vueDataGridPage.setVueTable();
        waitFor(2);

        vueDataGridPage.reactOverviewClick();
        waitFor(2);

        vueDataGridPage.vueIntegrationsClick();
        waitFor(2);

        vueDataGridPage.vueOperationsClick();
        waitFor(2);

        vueDataGridPage.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "Native Vue Components";
        Assert.assertEquals(expectedResult, "Native Vue Components");
        waitFor(2);
        System.out.println("Test Successful!");
    }


}
