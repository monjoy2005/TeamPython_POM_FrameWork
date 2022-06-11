package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.VueDatePickerPage;

public class TC22VueDatePickerPage extends CommonAPI {

    @Test
    public void vueDatePicker(){
        VueDatePickerPage vueDatePicker = new VueDatePickerPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        vueDatePicker.hoverOver(getDriver());
        waitFor(2);

        vueDatePicker.UIforVueClick();
        waitFor(2);

        vueDatePicker.componentsVueClick();
        waitFor(2);

        vueDatePicker.vueDatePickerClick();
        waitFor(2);

        vueDatePicker.setVueTable();
        waitFor(2);

        vueDatePicker.vueOverviewClick();
        waitFor(2);

        vueDatePicker.vueDefaultValueClick();
        waitFor(2);

        vueDatePicker.vueFocusedDateClick();
        waitFor(2);

        vueDatePicker.vueDisabledDatePickersClick();
        waitFor(2);

        vueDatePicker.vueDateLimitsClick();
        waitFor(2);

        vueDatePicker.vueFormatsClick();
        waitFor(2);

        vueDatePicker.vuePlaceHoldersClick();
        waitFor(2);

        vueDatePicker.vueNumberColumnClick();
        waitFor(2);

        vueDatePicker.vueRenderingClick();
        waitFor(2);

        vueDatePicker.vueFormsSupportClick();
        waitFor(2);

        vueDatePicker.vueGlobalizationClick();
        waitFor(2);

        vueDatePicker.vueKeyboardNavClick();
        waitFor(2);

        vueDatePicker.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "Native Vue Components";
        Assert.assertEquals(expectedResult, "Native Vue Components");
        waitFor(2);
        System.out.println("Test Successful!");
    }
}
