package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.AngularSchedulerPage;
import pages.methi.LoginPage;

public class TC14AngularSchedulerPage extends CommonAPI {

    @Test
    public void angularScheduler() {
        AngularSchedulerPage angularScheduler = new AngularSchedulerPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        angularScheduler.hoverOver(getDriver());
        waitFor(2);

        angularScheduler.setUIForAngular();
        waitFor(2);

        angularScheduler.setExploreComponents();
        waitFor(2);

        angularScheduler.setScheduler();
        waitFor(2);

        angularScheduler.hoverSchedulerTable(getDriver());
        waitFor(2);

        angularScheduler.schedulerOverviewClick();
        waitFor(2);

        angularScheduler.setSchedulerEvents();
        waitFor(2);

        angularScheduler.setSchedulerEdit();
        waitFor(2);

        angularScheduler.setSchedulerResources();
        waitFor(2);

        angularScheduler.setSchedulerRecurrence();
        waitFor(2);

        angularScheduler.setSchedulerTimeZones();
        waitFor(2);

        angularScheduler.setSchedulerAgendaView();
        waitFor(2);

        angularScheduler.setSchedulerDayView();
        waitFor(2);

        angularScheduler.setSchedulerMonthView();
        waitFor(2);

        angularScheduler.setSchedulerTimeLineView();
        waitFor(2);

        angularScheduler.setSchedulerWeekViews();
        waitFor(2);

        angularScheduler.setSchedulerRealTime();
        waitFor(2);

        angularScheduler.setSchedulerDataBinding();
        waitFor(2);

        angularScheduler.setSchedulerPDFExport();
        waitFor(2);

        angularScheduler.setSchedulerTemplates();
        waitFor(2);

        angularScheduler.setSchedulerGlobalization();
        waitFor(2);

        angularScheduler.setSchedulerKeyboard();
        waitFor(2);

        angularScheduler.setSchedulerAccessibility();
        waitFor(2);

        angularScheduler.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "All Kendo UI for Angular Components";
        Assert.assertEquals(expectedResult, "All Kendo UI for Angular Components");
        waitFor(2);
        System.out.println("Test Successful!");
    }
}
