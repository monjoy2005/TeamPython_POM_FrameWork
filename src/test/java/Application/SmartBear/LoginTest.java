package Application.SmartBear;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.Faizan.FreeTrialCredentialsPage;
import pages.Faizan.HomePage;

public class LoginTest extends CommonAPI {
    @Test
    public void Freetrialaccount(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONTryanytoolforfreebtn();
        waitFor(3);
        HomePage.clickONTestCompletebtn();
        waitFor(3);
        FreeTrialCredentialsPage FreeTrialCredentialsPage = new FreeTrialCredentialsPage(getDriver());
        FreeTrialCredentialsPage.clickONFREETRIALBTN();
        waitFor(3);
        FreeTrialCredentialsPage.clickandtypeonWorkEmail();
        waitFor(3);
        FreeTrialCredentialsPage.clickandtypeonFirstname();
        waitFor(3);
        FreeTrialCredentialsPage.clickandtypeonLastname();
        waitFor(3);
        FreeTrialCredentialsPage.clickandtypeonCompanyname();
        waitFor(3);
        FreeTrialCredentialsPage.clickandtypeonPhonenumber();
        waitFor(3);
        FreeTrialCredentialsPage.clickONSTARTTRIALBTN();
        waitFor(3);
    }
    @Test
    public void Signupfordemoaccount(){
        
    }




}
