package Application.Telerik;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.ReferralProgramPage;

public class TC04TelerikReferralPage extends CommonAPI {

    @Test
    public void referralPage(){
       ReferralProgramPage referralPage = new ReferralProgramPage(getDriver());
       LoginPage loginPage = new LoginPage(getDriver());
       loginPage.clickYourAccount();
       loginPage.typeEmail();
       loginPage.typePassword();
       loginPage.clickLoginBtn();


        referralPage.clickReferralProgram();
        waitFor(2);

        referralPage.typeYourEmail();
        waitFor(2);

        referralPage.typeFirstName();
        waitFor(2);

        referralPage.typeLastName();
        waitFor(2);

        referralPage.clickDropdownCountry();
        waitFor(2);

        referralPage.clickCountry();
        waitFor(2);
    }
}
