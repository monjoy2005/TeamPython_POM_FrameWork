package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.JQueryChartsPage;
import pages.methi.LoginPage;

public class TC09JQueryCharts extends CommonAPI {

    @Test
    public void jqueryCharts(){
        JQueryChartsPage jQueryCharts = new JQueryChartsPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        jQueryCharts.hoverOver4(getDriver());
        waitFor(2);

        jQueryCharts.kendoUiJQueryClick3();
        waitFor(2);

        jQueryCharts.setExploreComponents2();
        waitFor(2);

        jQueryCharts.chartsClick();
        waitFor(2);

        jQueryCharts.hoverChartsTable(getDriver());
        waitFor(2);

        jQueryCharts.chartsOverviewClick();
        waitFor(2);

        jQueryCharts.chartsTypeClick();
        waitFor(2);

        jQueryCharts.chartsAxesClick();
        waitFor(2);

        jQueryCharts.multipleChartsAxesClick();
        waitFor(2);

        jQueryCharts.errorBarsClick();
        waitFor(2);

        jQueryCharts.panningZoomingClick();
        waitFor(2);

        jQueryCharts.chartsDataBindingClick();
        waitFor(2);

        jQueryCharts.chartsRenderingClick();
        waitFor(2);

        jQueryCharts.chartsNotesClick();
        waitFor(2);

        jQueryCharts.chartsPanesClick();
        waitFor(2);

        jQueryCharts.chartsToolTipsClick();
        waitFor(2);

        jQueryCharts.chartsExportClick();
        waitFor(2);

        jQueryCharts.chartsAppearanceClick();
        waitFor(2);

        jQueryCharts.chartsAnimationClick();
        waitFor(2);

        jQueryCharts.chartsPlotBandsClick();
        waitFor(2);

        jQueryCharts.scrollToViewComponents3(getDriver());
        waitFor(3);

        String expectedResult = "All Kendo UI for jQuery Components";
        Assert.assertEquals(expectedResult, "All Kendo UI for jQuery Components");
        waitFor(2);
        System.out.println("Test Successful!");
    }

}
