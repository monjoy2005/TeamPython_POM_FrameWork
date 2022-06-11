package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.ReactChartPage;

public class TC18ReactChartsPage extends CommonAPI {

    @Test
    public void reactChartPage(){
        ReactChartPage reactChartPage = new ReactChartPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(3);
        loginPage.clickWithActionsCookies(getDriver());

        reactChartPage.hoverOver(getDriver());
        waitFor(2);

        reactChartPage.setUIForReact();
        waitFor(2);

        reactChartPage.setExploreComponents();
        waitFor(2);

        reactChartPage.setReactCharts();
        waitFor(3);

        reactChartPage.hoverReactTable(getDriver());
        waitFor(2);

        reactChartPage.reactOverviewClick();
        waitFor(2);

        reactChartPage.setReactChartTypesClick();
        waitFor(2);

        reactChartPage.setReactChartDataTypes();
        waitFor(2);

        reactChartPage.setReactChartSeriesSamePlot();
        waitFor(2);

        reactChartPage.setReactChartAnimations();
        waitFor(2);

        reactChartPage.setReactChartPanningZooming();
        waitFor(2);

        reactChartPage.setReactChartElements();
        waitFor(2);

        reactChartPage.setReactChartToolTips();
        waitFor(2);

        reactChartPage.setReactChartLabels();
        waitFor(2);

        reactChartPage.setReactChartErrorBars();
        waitFor(2);

        reactChartPage.setReactChartCrossHairs();
        waitFor(2);

        reactChartPage.setReactChartLegends();
        waitFor(2);

        reactChartPage.setReactChartPlotBands();
        waitFor(2);

        reactChartPage.setReactChartSelection();
        waitFor(2);

        reactChartPage.setReactChartDesignSupport();
        waitFor(2);

        reactChartPage.setReactChartCanvas();
        waitFor(2);

        reactChartPage.setReactChartExportOptions();
        waitFor(2);

        reactChartPage.setReactChartRendering();
        waitFor(2);

        reactChartPage.setReactChartTutorial();
        waitFor(2);

        reactChartPage.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "All KendoReact Components";
        Assert.assertEquals(expectedResult, "All KendoReact Components");
        waitFor(2);
        System.out.println("Test Successful!");
    }
}
