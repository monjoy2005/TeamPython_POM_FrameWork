package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;

public class LoginTest extends CommonAPI {

    @Test
    public void SignInWithValidCred(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        homePage.clickOnSignIn();
        loginPage.putEmail("khan23@gmail.com");
        loginPage.putPassword("abc123");
        loginPage.hitSignIn();
        String expectedMessage="karim khan";
        Assert.assertEquals(getElementText(homePage.userName),expectedMessage);

    }

    @Test
    public void SignInWithInvalidCred(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        homePage.clickOnSignIn();
        loginPage.putEmail("khan234@gmail.com");
        loginPage.putPassword("abc12");
        loginPage.hitSignIn();
        String expectedMessage="Authentication failed.";
        Assert.assertEquals(getElementText(loginPage.warning),expectedMessage);

    }
    @Test
    public void SignInWithInvalidIdAndValidPass(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        homePage.clickOnSignIn();
        loginPage.putEmail("khan234@gmail.com");
        loginPage.putPassword("abc123");
        loginPage.hitSignIn();
        String expectedMessage="Forgot your password?";
        Assert.assertEquals(getElementText(loginPage.forgotPassword),expectedMessage);

    }

    @Test
    public void SignInWithValidIdAndInvalidPass(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        homePage.clickOnSignIn();
        loginPage.putEmail("khan23@gmail.com");
        loginPage.putPassword("abc12");
        loginPage.hitSignIn();
        String expectedMessage="ALREADY REGISTERED?";
        System.out.println(getElementText(loginPage.alreadyRegistered));
        Assert.assertEquals(getElementText(loginPage.alreadyRegistered),expectedMessage);
    }


    // hello guys


}
