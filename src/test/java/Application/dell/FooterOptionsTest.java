package Application.dell;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.dell_Pages.ContactUsPage;
import pages.dell_Pages.EmailSignUpPage;
import pages.dell_Pages.HomePage;

public class FooterOptionsTest extends CommonAPI {
    @Test
    public void contactUsBtn(){
        HomePage homePage=new HomePage(getDriver());
        ContactUsPage contactUsPage = new ContactUsPage(getDriver());
        homePage.clickContactSupportBtn();
        contactUsPage.checkHeaderTextIsPresent();

    }

    @Test
    public void EmailSignUpBtn(){
        HomePage homePage = new HomePage(getDriver());
        EmailSignUpPage emailSignUpPage = new EmailSignUpPage(getDriver());
        homePage.clickEmailSignUpBtn();
        emailSignUpPage.emailSignUpHeaderTextIsPresent();
    }


}
