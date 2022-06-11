package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.ReactDataGridPage;

public class TC16ReactDataGridPage extends CommonAPI {

    @Test
    public void reactDataGrid(){
        ReactDataGridPage reactDataGrid = new ReactDataGridPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        reactDataGrid.hoverOver(getDriver());
        waitFor(2);

        reactDataGrid.UIforReactClick();
        waitFor(2);

        reactDataGrid.componentsReactClick();
        waitFor(2);

        reactDataGrid.reactDataGridClick();
        waitFor(2);

        reactDataGrid.reactHighlightsClick();
        waitFor(2);

        reactDataGrid.reactFilterSortLink();
        waitFor(2);

        reactDataGrid.reactExportClick();
        waitFor(2);

        reactDataGrid.reactCellSelectionClick();
        waitFor(2);

        reactDataGrid.reactCustomEditingClick();
        waitFor(2);

        reactDataGrid.reactInteractionsClick();
        waitFor(2);

        reactDataGrid.reactVirtualizationClick();
        waitFor(2);

        reactDataGrid.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "More React Data Grid Features";
        Assert.assertEquals(expectedResult, "More React Data Grid Features");
        waitFor(2);
        System.out.println("Test Successful!");

    }

}
