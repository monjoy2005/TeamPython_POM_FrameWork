package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.CreateAccountPage;
import pages.dell_Pages.DellFinancialSesvicesPage;
import pages.dell_Pages.HomePage;
import pages.dell_Pages.SignInPage;

public class SignInTest extends CommonAPI {
    @Test
    public void createAccountBtn(){
    HomePage homePage=new HomePage(getDriver());
    CreateAccountPage createAccountPage =new CreateAccountPage(getDriver());
    homePage.hoverOverOnSignInBtn(getDriver());         //this is the format off calling hoverOver
    //hoverOver(getDriver(),homePage.signInHoverOver);        //this is NOT the format
    homePage.chickCreateAccountBtn();
    isPresent(createAccountPage.createAccountText);
    }

    @Test
    public void signInBtn(){
    HomePage homePage=new HomePage(getDriver());
    SignInPage signInPage=new SignInPage(getDriver());
    CreateAccountPage createAccountPage =new CreateAccountPage(getDriver());
    homePage.hoverOverOnSignInBtn(getDriver());
    homePage.clickSignInBtn();
    String expectedHeaderText = "Sign In";
    Assert.assertEquals(expectedHeaderText,signInPage.signInPageHeaderText());
    }

    @Test
    public void dellFinancialServiceBtn(){
    HomePage homePage=new HomePage(getDriver());
    DellFinancialSesvicesPage dellFinancialSesvicesPage =new DellFinancialSesvicesPage(getDriver());
    homePage.hoverOverOnSignInBtn(getDriver());
    homePage.clickFinancialServiceBtn();
    isPresent(dellFinancialSesvicesPage.dellFinancialServiceText);

    }



}
