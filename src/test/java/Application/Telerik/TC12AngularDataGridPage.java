package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.AngularDataGridPage;
import pages.methi.LoginPage;

public class TC12AngularDataGridPage extends CommonAPI {

    @Test
    public void angularDataGrid(){
        AngularDataGridPage angularDataGrid = new AngularDataGridPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());

        angularDataGrid.hoverOver(getDriver());
        waitFor(2);

        angularDataGrid.UIforAngularClick();
        waitFor(2);

        angularDataGrid.setExploreComponents();
        waitFor(2);

        angularDataGrid.angularDataGridClick();
        waitFor(2);

        angularDataGrid.angularHighlights();
        waitFor(2);

        angularDataGrid.setAngularSuperCustomizable();
        waitFor(2);

        angularDataGrid.setAngularFilterSort();
        waitFor(2);

        angularDataGrid.setAngularCRUD();
        waitFor(2);

        angularDataGrid.setAngularInteractions();
        waitFor(2);

        angularDataGrid.setAngularVirtualization();
        waitFor(2);

        angularDataGrid.setAngularExport();
        waitFor(2);

        angularDataGrid.setAngularAccessibility();
        waitFor(2);

        angularDataGrid.scrollToViewComponents(getDriver());
        waitFor(2);

        String expectedResult = "More Angular Data Grid Features";
        Assert.assertEquals(expectedResult, "More Angular Data Grid Features");
        waitFor(2);
        System.out.println("Test Successful!");

    }
}
