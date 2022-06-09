package Application.dell;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.mritunjoy.CreateAccountPage;
import pages.mritunjoy.DellFinancialSesvicesPage;
import pages.mritunjoy.HomePage;

public class SignInTest extends CommonAPI {
    @Test
    public void createAccountBtn(){
    HomePage homePage=new HomePage(getDriver());
    CreateAccountPage createAccountPage =new CreateAccountPage(getDriver());
    hoverOver(getDriver(),homePage.signInHoverOver);
    click(homePage.createAccountBtn);
    isPresent(createAccountPage.createAccountText);
    }

    @Test
    public void signInBtn(){
    HomePage homePage=new HomePage(getDriver());
    CreateAccountPage createAccountPage =new CreateAccountPage(getDriver());
    hoverOver(getDriver(),homePage.signInHoverOver);
    }

    @Test
    public void dellFinancialServiceBtn(){
    HomePage homePage=new HomePage(getDriver());
    DellFinancialSesvicesPage dellFinancialSesvicesPage =new DellFinancialSesvicesPage(getDriver());
    hoverOver(getDriver(),homePage.signInHoverOver);
    click(homePage.financialServiceBtn);
    isPresent(dellFinancialSesvicesPage.dellFinancialServiceText);

    }



}
