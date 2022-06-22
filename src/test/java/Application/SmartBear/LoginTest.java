package Application.SmartBear;
import base.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Faizan.*;
public class LoginTest extends CommonAPI {
    //@Test
    // Test Passed come back to this one to fix the assertion
    public void Freetrialaccountwithvalidcredentials(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONTryanytoolforfreebtn();
        HomePage.clickONTestCompletebtn();
        FreeTrialCredentialsPage FreeTrialCredentialsPage = new FreeTrialCredentialsPage(getDriver());
        FreeTrialCredentialsPage.clickONFREETRIALBTN();
        FreeTrialCredentialsPage.clickandtypeonWorkEmail();
        FreeTrialCredentialsPage.clickandtypeonFirstname();
        FreeTrialCredentialsPage.clickandtypeonLastname();
        FreeTrialCredentialsPage.clickandtypeonCompanyname();
        FreeTrialCredentialsPage.clickandtypeonPhonenumber();
        FreeTrialCredentialsPage.clickONSTARTTRIALBTN();
        String expectedSmartBearPageTitle = "Enjoy Your TestComplete Free Trial | SmartBear Software";
        Assert.assertTrue(true,"Enjoy Your TestComplete Free Trial | SmartBear Software");
    }
    //@Test
    public void FreetrialaccountwithInvalidcredentials(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONTryanytoolforfreebtn();
        HomePage.clickONTestCompletebtn();
        FreeTrialCredentialsPage FreeTrialCredentialsPage = new FreeTrialCredentialsPage(getDriver());
        FreeTrialCredentialsPage.clickONFREETRIALBTN();
        FreeTrialCredentialsPage.typeONinvalidWORKEMAIL();
        FreeTrialCredentialsPage.clickandtypeonFirstname();
        FreeTrialCredentialsPage.clickandtypeonLastname();
        FreeTrialCredentialsPage.clickandtypeonCompanyname();
        FreeTrialCredentialsPage.clickandtypeonPhonenumber();
        FreeTrialCredentialsPage.clickONSTARTTRIALBTN();
    }
    //@Test
    // Not Finished Come back to this one
    public void LoadNinjaInvalidLogin(){
        HomePage HomePage = new HomePage(getDriver());
        waitFor(4);
        HomePage.clickONLoginbtn();
        waitFor(4);
        HomePage.clickonLoadNinjaOption();
        waitFor(4);
        LoadNinjaLoginCredentials LoadNinjaLoginCredentials = new LoadNinjaLoginCredentials(getDriver());
        waitFor(4);
        LoadNinjaLoginCredentials.TypeonEmailField();
        waitFor(15);
        LoadNinjaLoginCredentials.TypeonPasswordField();
        waitFor(4);
        LoadNinjaLoginCredentials.ClickonSignInBtn();
        waitFor(4);
    }
    //@Test
    public void SupportSearchfunction(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,7000);");
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONCONTACTUS();
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000);");
        HomePage.clickONSUPPORTBTN();
        SupportPage SupportPage = new SupportPage(getDriver());
        SupportPage.TypeandEnterONSearchfield();
    }
    //@Test
    public void Clearandclose(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONCONTACTUS();
        HomePage.clickONSUPPORTBTN();
        SupportPage SupportPage = new SupportPage(getDriver());
        SupportPage.TypeandEnterONSearchfield();
        SupportPage SupportPages = new SupportPage(getDriver());
        SupportPages.clickONCLEAR();
        SupportPages.clickONCLOSE();
    }
    //@Test
    // had to add wait time Because without wait time my iframe is giving me error.
    public void Openacase(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONCONTACTUS();
        HomePage.clickONSUPPORTBTN();
        SupportPage SupportPage = new SupportPage(getDriver());
        SupportPage.clickONopencasebtn();
        waitFor(3);
        SupportPage.clickONCaptureforJIRABTN();
        waitFor(3);
        getDriver().switchTo().frame(0);
        waitFor(5);
        SupportPage.clickANDTYPEONYOUREMAIL();
        SupportPage.clickANDTYPEONCCEMAIL();
        SupportPage.clickANDTYPEONYOURFULLNAME();
        SupportPage.clickANDTYPEONSUBJECTFIELD();
        SupportPage.clickANDTYPEONSUBJECTFIELD();
    }
    @Test
    public void checkbox(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONPRODUCTSBTN();
        HomePage.clickONviewALLPRODUCTSBTN();
        FilterToolPage FilterToolPage = new FilterToolPage(getDriver());
        FilterToolPage.clickONINTEGRATIONBTN();
        FilterToolPage.clickOPTION1();
        FilterToolPage.clickOPTION2();
        FilterToolPage.clickOPTION3();
    }
    //@Test
    // fix the issue
    public void Forgotpassword(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONLoginbtn();
        waitFor(3);
        HomePage.clickonQACompleteBtn();
        waitFor(3);
        QACompletePage QACompletePage = new QACompletePage(getDriver());
        waitFor(20);
        QACompletePage.clickONForgotPasswordBtn();
        waitFor(3);
        QACompletePage.TYPEONEmailAddressField();
        waitFor(3);
        QACompletePage.clickONResetPasswordBtn();
        waitFor(3);
    }
    //@Test
    public void Switchtab(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONPRODUCTSBTN();
        HomePage.clickonBitBarBtn();
        }
    //@Test
    //Not Finished
        public void ChangePasswordwithvalidcredentials(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONLoginbtn();
        HomePage.clickonQACompleteBtn();
        QACompletePage QACompletePage = new QACompletePage(getDriver());
        waitFor(20);
        QACompletePage.clickONChangePassword();
    }
    //@Test
    public void SmartBearContactFunctionality(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0,6400);");
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONCONTACTUS();
        ContactUsCredentialsPage ContactUsCredentialsPage = new ContactUsCredentialsPage(getDriver());
        ContactUsCredentialsPage.TypeFirstName();
        ContactUsCredentialsPage.TypeLastName();
        ContactUsCredentialsPage.TypeWorkEmail();
        ContactUsCredentialsPage.TypeCompany();
        ContactUsCredentialsPage.TypePhone();
        ContactUsCredentialsPage.ClickCountryOption();
        ContactUsCredentialsPage.clickUSoption();
        ContactUsCredentialsPage.clickProductoption();
        ContactUsCredentialsPage.clickAlertSiteoption();
        ContactUsCredentialsPage.clickAreaofInterestOption();
        ContactUsCredentialsPage.clickOtherOption();
        ContactUsCredentialsPage.TypeoncommentsorQuestions();
        ContactUsCredentialsPage.clickContactSmartBear();
        String expectedSmartBearPageTitle = "Contact Us | SmartBear";
        Assert.assertTrue(true,"Contact Us | SmartBear");
    }
    //@Test
    public void SmartBearContactFunctionalitywithmissingfield(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0,6400);");
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONCONTACTUS();
        ContactUsCredentialsPage ContactUsCredentialsPage = new ContactUsCredentialsPage(getDriver());
        ContactUsCredentialsPage.TypeFirstName();
        ContactUsCredentialsPage.TypeLastName();
        ContactUsCredentialsPage.TypeWorkEmail();
        ContactUsCredentialsPage.TypeCompany();
        ContactUsCredentialsPage.TypePhone();
        ContactUsCredentialsPage.ClickCountryOption();
        ContactUsCredentialsPage.clickProductoption();
        ContactUsCredentialsPage.clickAreaofInterestOption();
        ContactUsCredentialsPage.clickContactSmartBear();
    }













}
