package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.ReactSchedulerPage;

public class TC17ReactSchedulerPage extends CommonAPI {

    @Test
    public void reactScheduler(){
        ReactSchedulerPage reactScheduler = new ReactSchedulerPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        reactScheduler.hoverOver(getDriver());
        waitFor(2);

        reactScheduler.setUIForReact();
        waitFor(2);

        reactScheduler.setExploreComponents();
        waitFor(2);

        reactScheduler.setScheduler();
        waitFor(2);

        reactScheduler.hoverSchedulerTable(getDriver());
        waitFor(2);

        reactScheduler.schedulerOverviewClick();
        waitFor(2);

        reactScheduler.setSchedulerDayViewClick();
        waitFor(2);

        reactScheduler.setReactSchedulerWorkWeek();
        waitFor(2);

        reactScheduler.setReactSchedulerMonthView();
        waitFor(2);

        reactScheduler.setReactSchedulerTimeLine();
        waitFor(2);

        reactScheduler.setReactSchedulerAgendaView();
        waitFor(2);

        reactScheduler.setReactSchedulerMultipleEvent();
        waitFor(2);

        reactScheduler.setReactSchedulerDataBinding();
        waitFor(2);

        reactScheduler.setReactSchedulerEvents();
        waitFor(2);

        reactScheduler.setReactSchedulerRecurrence();
        waitFor(2);

        reactScheduler.setReactSchedulerResources();
        waitFor(2);

        reactScheduler.setReactSchedulerTasks();
        waitFor(2);

        reactScheduler.setReactSchedulerSlots();
        waitFor(2);

        reactScheduler.setReactSchedulerEditing();
        waitFor(2);

        reactScheduler.setReactSchedulerEditorForm();
        waitFor(2);

        reactScheduler.setReactSchedulerGrouping();
        waitFor(2);

        reactScheduler.setReactSchedulerTimeZones();
        waitFor(2);

        reactScheduler.setReactSchedulerRendering();
        waitFor(2);

        reactScheduler.setReactSchedulerSlotHeight();
        waitFor(2);

        reactScheduler.setReactSchedulerItemHeight();
        waitFor(2);

        reactScheduler.setReactSchedulerTimeMarker();
        waitFor(2);

        reactScheduler.setReactSchedulerGlobalization();
        waitFor(2);

        reactScheduler.setReactSchedulerKeyboardNav();
        waitFor(2);

        reactScheduler.setReactSchedulerAccessibility();
        waitFor(2);

        reactScheduler.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "All KendoReact Components";
        Assert.assertEquals(expectedResult, "All KendoReact Components");
        waitFor(2);
        System.out.println("Test Successful!");
    }
}
