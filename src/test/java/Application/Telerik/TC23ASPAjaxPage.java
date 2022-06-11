package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.ASPAjaxPage;
import pages.methi.LoginPage;

public class TC23ASPAjaxPage extends CommonAPI {

    @Test
    public void asp_Ajax(){
        ASPAjaxPage aspAjax = new ASPAjaxPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        aspAjax.hoverOver(getDriver());
        waitFor(2);

        aspAjax.UIforAjaxClick();
        waitFor(2);

        aspAjax.scrollToViewDemo(getDriver());
        waitFor(2);

        aspAjax.editorPresent();
        waitFor(2);

        aspAjax.gridClick();
        waitFor(2);

        aspAjax.ganttChartClick();
        waitFor(2);

        aspAjax.timeLineClick();
        waitFor(2);

        aspAjax.listOfControlsClick();
        waitFor(2);

        aspAjax.controlsPresent();
        waitFor(2);

        String expectedResult = "Explore our 120+ ASP.NET AJAX UI Components";
        Assert.assertEquals(expectedResult, "Explore our 120+ ASP.NET AJAX UI Components");
        waitFor(2);
        System.out.println("Test Successful!");
    }
}
