package Application.SmartBear;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.Faizan.AlertsitePage;
import pages.Faizan.FreeTrialCredentialsPage;
import pages.Faizan.HomePage;
import pages.Faizan.SupportPage;

public class LoginTest extends CommonAPI {
    //@Test
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
    //@Test
    public void AlertSiteinvalidLogin(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONLoginbtn();
        waitFor(3);
        HomePage.clickONAlertsite();
        waitFor(3);
        AlertsitePage AlertsitePage = new AlertsitePage(getDriver());
        AlertsitePage.clickANDTYPEONEMAIL();
        waitFor(3);
        AlertsitePage.clickANDTYPEONpassword();
        waitFor(3);
        AlertsitePage.clickONSigninbtn();
        waitFor(3);
    }
    //@Test
    public void SupportSearchfunction(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONCONTACTUS();
        HomePage.clickONSUPPORTBTN();
        waitFor(3);
        SupportPage SupportPage = new SupportPage(getDriver());
        SupportPage.clickANDTYPEONSearchfield();
        waitFor(3);
    }
    //@Test
    public void Clearandclose(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONCONTACTUS();
        HomePage.clickONSUPPORTBTN();
        waitFor(3);
        SupportPage SupportPage = new SupportPage(getDriver());
        SupportPage.clickANDTYPEONSearchfield();
        waitFor(3);
        SupportPage SupportPages = new SupportPage(getDriver());
        SupportPages.clickONCLEAR();
        waitFor(3);
        SupportPages.clickONCLOSE();
        waitFor(3);
    }
    @Test
    public void Openacase(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONCONTACTUS();
        HomePage.clickONSUPPORTBTN();
        waitFor(3);
        SupportPage SupportPage = new SupportPage(getDriver());
        SupportPage.clickONopencasebtn();
        waitFor(3);
        SupportPage.clickONCaptureforJIRABTN();
        waitFor(3);
        SupportPage.clickANDTYPEONYOUREMAIL();
        waitFor(3);
        SupportPage.clickANDTYPEONCCEMAIL();
        waitFor(3);
        SupportPage.clickANDTYPEONYOURFULLNAME();
        waitFor(3);
        SupportPage.clickANDTYPEONSUBJECTFIELD();
        waitFor(3);
        SupportPage.clickANDTYPEONSUBJECTFIELD();
        waitFor(3);
    }






}
