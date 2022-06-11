package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.EarnPointsPage;
import pages.methi.LoginPage;

public class TC05TelerikPointsPage extends CommonAPI {

    @Test
    public void pointsPage(){
        EarnPointsPage pointsPage = new EarnPointsPage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        waitFor(2);
        loginPage.clickWithActionsCookies(getDriver());
        waitFor(2);

        pointsPage.pointPageClicked();
        waitFor(2);

        pointsPage.question1Displayed();
        waitFor(1);

        pointsPage.question2clicked();
        waitFor(2);

        pointsPage.question3clicked();
        waitFor(2);

        pointsPage.question4clicked();
        waitFor(2);

        pointsPage.question5clicked();
        waitFor(2);

        pointsPage.question6clicked();
        waitFor(2);

        pointsPage.question7clicked();
        waitFor(2);

        pointsPage.question8clicked();
        waitFor(2);

        pointsPage.question9clicked();
        waitFor(2);

        pointsPage.scrollToViewQuestions(getDriver());
        waitFor(2);

        pointsPage.question10clicked();
        waitFor(2);

        pointsPage.question11clicked();
        waitFor(2);

        String expectedResult = "Explore Other FAQ Sections";
        Assert.assertEquals(expectedResult, "Explore Other FAQ Sections");
        waitFor(2);
        System.out.println("Test Successful!");
    }
}
