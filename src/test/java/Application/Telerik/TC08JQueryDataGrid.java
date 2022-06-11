package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.JQueryDataGridPage;
import pages.methi.LoginPage;

public class TC08JQueryDataGrid extends CommonAPI {

    @Test
    public void jqueryDatGrid(){
        JQueryDataGridPage jQueryDataGrid = new JQueryDataGridPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        jQueryDataGrid.hoverOver3(getDriver());
        waitFor(2);

        jQueryDataGrid.kendoUiJQueryClick2();
        waitFor(2);

        jQueryDataGrid.setExploreComponents();
        waitFor(2);

        jQueryDataGrid.dataGridClick();
        waitFor(2);

        jQueryDataGrid.hoverGridTable(getDriver());
        waitFor(2);

        jQueryDataGrid.overviewGridClick();
        waitFor(2);

        jQueryDataGrid.renderingGridClick();
        waitFor(2);

        jQueryDataGrid.interactionsGridClick();
        waitFor(2);

        jQueryDataGrid.hierarchicalGridClick();
        waitFor(2);

        jQueryDataGrid.frozenGridClick();
        waitFor(2);

        jQueryDataGrid.filterGridClick();
        waitFor(2);

        jQueryDataGrid.editingGridClick();
        waitFor(2);

        jQueryDataGrid.bindingGridClick();
        waitFor(2);

        jQueryDataGrid.virtualizationGridClick();
        waitFor(2);

        jQueryDataGrid.excelGridClick();
        waitFor(2);

        jQueryDataGrid.templatesGridClick();
        waitFor(2);

        jQueryDataGrid.globalizationGridClick();
        waitFor(2);

        jQueryDataGrid.keyboardGridClick();
        waitFor(2);

        jQueryDataGrid.accessibilityGridClick();
        waitFor(2);

        jQueryDataGrid.scrollToViewComponents(getDriver());
        waitFor(3);

        String expectedResult = "All Kendo UI for jQuery Components";
        Assert.assertEquals(expectedResult, "All Kendo UI for jQuery Components");
        waitFor(2);
        System.out.println("Test Successful!");

    }
}
