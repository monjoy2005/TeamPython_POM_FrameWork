package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.VueChartsPage;

public class TC21VueChartsPage extends CommonAPI {

    @Test
    public void vueCharts(){
        VueChartsPage vueCharts = new VueChartsPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        vueCharts.hoverOver(getDriver());
        waitFor(2);

        vueCharts.UIforVueClick();
        waitFor(2);

        vueCharts.componentsVueClick();
        waitFor(2);

        vueCharts.vueChartsClick();
        waitFor(2);

        vueCharts.setVueTable();
        waitFor(2);

        vueCharts.vueOverviewClick();
        waitFor(2);

        vueCharts.vueDataBondingClick();
        waitFor(2);

        vueCharts.vueChartTypeClick();
        waitFor(2);

        vueCharts.vueChartElementsClick();
        waitFor(2);

        vueCharts.vueChartSeriesClick();
        waitFor(2);

        vueCharts.vueChartPanningClick();
        waitFor(2);

        vueCharts.vueChartAnimationsClick();
        waitFor(2);

        vueCharts.vueChartRenderingClick();
        waitFor(2);

        vueCharts.vueChartDesignClick();
        waitFor(2);

        vueCharts.vueChartGlobalizationClick();
        waitFor(2);

        vueCharts.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "Native Vue Components";
        Assert.assertEquals(expectedResult, "Native Vue Components");
        waitFor(2);
        System.out.println("Test Successful!");
    }

}
