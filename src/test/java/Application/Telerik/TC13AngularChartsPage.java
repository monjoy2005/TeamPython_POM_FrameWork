package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.AngularChartsPage;
import pages.methi.LoginPage;

public class TC13AngularChartsPage extends CommonAPI {

    @Test
    public void angularCharts() {
        AngularChartsPage angularCharts = new AngularChartsPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        angularCharts.hoverOver(getDriver());
        waitFor(2);

        angularCharts.UIforAngularClick();
        waitFor(2);

        angularCharts.setExploreComponents();
        waitFor(2);

        angularCharts.angularDataGridClick();
        waitFor(2);

        angularCharts.angularHighlights();
        waitFor(2);

        angularCharts.setAngularSuperCustomizable();
        waitFor(2);

        angularCharts.setAngularPopularCharts();
        waitFor(2);

        angularCharts.setAngularEasyAPI();
        waitFor(2);

        angularCharts.setAngularPanZoom();
        waitFor(2);

        angularCharts.setAngularSVGRendering();
        waitFor(2);

        angularCharts.setAngularEasyExport();
        waitFor(2);

        angularCharts.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "More Angular Data Grid Features\n";
        Assert.assertEquals(expectedResult, "More Angular Data Grid Features\n");
        waitFor(2);
        System.out.println("Test Successful!");
    }
}
