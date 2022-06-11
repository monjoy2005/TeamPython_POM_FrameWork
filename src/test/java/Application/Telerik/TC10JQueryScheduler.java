package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.JQuerySchedulerPage;
import pages.methi.LoginPage;

public class TC10JQueryScheduler extends CommonAPI {

    @Test
    public void jQueryScheduler(){
        JQuerySchedulerPage jQueryScheduler = new JQuerySchedulerPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        jQueryScheduler.hoverOver5(getDriver());
        waitFor(2);

        jQueryScheduler.kendoUiJQueryClick4();
        waitFor(2);

        jQueryScheduler.setExploreComponents3();
        waitFor(2);

        jQueryScheduler.schedulerClick();
        waitFor(2);

        jQueryScheduler.hoverSchedulerTable(getDriver());
        waitFor(2);

        jQueryScheduler.schedulerOverviewClick();
        waitFor(2);

        jQueryScheduler.schedulerDataBindingClick();
        waitFor(2);

        jQueryScheduler.schedulerTimeZoneClick();
        waitFor(2);

        jQueryScheduler.schedulerAppointmentViewsClick();
        waitFor(2);

        jQueryScheduler.schedulerAppointmentEditClick();
        waitFor(2);

        jQueryScheduler.schedulerResourcesClick();
        waitFor(2);

        jQueryScheduler.schedulerHierarchicalClick();
        waitFor(2);

        jQueryScheduler.schedulerVerticalClick();
        waitFor(2);

        jQueryScheduler.schedulerICalClick();
        waitFor(2);

        jQueryScheduler.schedulerExportClick();
        waitFor(2);

        jQueryScheduler.schedulerTemplatesClick();
        waitFor(2);

        jQueryScheduler.schedulerSearchEventsClick();
        waitFor(2);

        jQueryScheduler.schedulerWorkingDaysClick();
        waitFor(2);

        jQueryScheduler.schedulerRTLClick();
        waitFor(2);

        jQueryScheduler.schedulerKeyboardClick();
        waitFor(2);

        jQueryScheduler.scrollToViewComponents4(getDriver());
        waitFor(2);

        String expectedResult = "All Kendo UI for jQuery Components";
        Assert.assertEquals(expectedResult, "All Kendo UI for jQuery Components");
        waitFor(2);
        System.out.println("Test Successful!");

    }
}
