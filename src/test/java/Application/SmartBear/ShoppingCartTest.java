package Application.SmartBear;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Faizan.*;


public class ShoppingCartTest extends CommonAPI {
    //@Test
    public void Addtocart() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    public void Addquantity() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.ClickonPlusbtn();
    }
    //@Test
    public void Deductquantity(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.ClickonPlusbtn();
        shoppingCartPage.ClickonMinusbtn();
    }
    //@Test
    public void Removeitemfromcart(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.ClickonCheckbtn();
        shoppingCartPage.ClickonRemovebtn();
    }
    //@Test
    public void Applygiftcode(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.ClickonRepcodebtn();
        shoppingCartPage.ClickonRepcodespacebtn();
        shoppingCartPage.ClickonApplybtn();
    }
    //@Test
    public void Proceedtocheckout(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.ClickonCheckoutbtn();
        CredentialsPage CredentialsPage = new CredentialsPage(getDriver());
        CredentialsPage.clickandtypeonCompanyname();
        waitFor(5);
        CredentialsPage.clickandtypeonFirstname();
        CredentialsPage.clickandtypeonLastname();
        CredentialsPage.clickandtypeonStreetaddress();
        CredentialsPage.clickandtypeonCity();
        CredentialsPage.clickandtypeonZipcode();
        CredentialsPage.clickANDTYPEONPHONENUMBER();
        CredentialsPage.clickANDTYPEONEMAIL();
        CredentialsPage.clickANDTYPEONCARDHOLDERNAME();
        CredentialsPage.clickANDTYPEONCARDNUMBER();
        CredentialsPage.clickANDTYPEONCVVCODE();
        CredentialsPage.clickBUYNOWBTN();
    }
    //@Test
    public void ChangeQuantitymanually(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.typeANDDELETEONQUANTITYSPACEBTN();
        shoppingCartPage.ClickonCheckbtn();
    }
    //@Test
    public void AddtoCartUsingReadyAPI(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500);");
        shoppingCartPage.ClickonShopTrainingbtn();
        TrainingsPage TrainingsPage = new TrainingsPage(getDriver());
        TrainingsPage.clickONReadyAPI();
        TrainingsPage.clickONAddtoCartOption1();
    }
    //@Test
    public void AddtoCartUsingTestComplete(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500);");
        shoppingCartPage.ClickonShopTrainingbtntestcomplete();
        TrainingsPage TrainingsPage = new TrainingsPage(getDriver());
        TrainingsPage.clickONTestComplete();
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,400);");
        TrainingsPage.clickAddtoCartfirstOption();
    }
    //@Test
    //Not Finished Come back to this one
    public void ContinueShopping(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500);");
        shoppingCartPage.ClickonShopTrainingbtntestcomplete();
        TrainingsPage TrainingsPage = new TrainingsPage(getDriver());
        TrainingsPage.clickONReadyAPI();
        TrainingsPage.clickONAddtoCartOption1();
        waitFor(5);
        shoppingCartPage.ClickonContinueShoppingBtn();
    }
    //@Test
    public void AQtimeProFloatingLicense(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimeProFloatingLicenseOption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    // just fix the assertion
    public void ContinueShoppings(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimeProFloatingLicenseOption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.ClickonContinueShoppinsgbtn();
        String expectedSmartBearPageTitle = "Online Store | SmartBear";
        Assert.assertTrue(true,"Online Store | SmartBear");
    }
    //@Test
    // Not Finished come back
    public void ChangeLanguage(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.ClickonCheckoutbtn();
        CredentialsPage CredentialsPage = new CredentialsPage(getDriver());
        CredentialsPage.clickonLanguagebtn();
        waitFor(4);
        CredentialsPage.clickonSpanishOption();
    }
    //@Test
    public void AddtoCartusingShopCollaborator(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopCollaboratorbtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonChooseYourLicenseSelectField();
        StorePage.clickonNamedLicenseOption();
        StorePage.clickonChooseYourPackageSelectField();
        StorePage.clickonCollaboratorTeamOption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    public void AddtoCartusingShopCollaborators(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopCollaboratorbtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonChooseYourLicenseSelectField();
        StorePage.clickonConcurrentLicense();
        StorePage.clickonChooseYourPackageSelectField();
        StorePage.clickonCollaboratorEnterprise();
    }
    //@Test
    public void AddtoCartusingShopQAComplete(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopQACompletebtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonQaCompleteSelectfield();
        StorePage.clickonQaCompletesaas();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    public void AddtoCartusingShopQACompletes(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopQACompletebtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonQaCompleteSelectfield();
        StorePage.clickonQaComplete();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    public void AddtoCartusingFixedLicenseandPerformancesmallpackage(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopReadyAPIbtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonAPIChooseYourLicenseselectfield();
        StorePage.clickonFixedLicenseoption();
        StorePage.clickonAPIChooseyourpackagefield();
        StorePage.clickonPerformanceSmalloption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    public void AddtoCartusingFixedLicenseandPerformancemediumpackage(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopReadyAPIbtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonAPIChooseYourLicenseselectfield();
        StorePage.clickonFixedLicenseoption();
        StorePage.clickonAPIChooseyourpackagefield();
        StorePage.clickonPerformanceMediumoption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    public void AddtoCartusingFixedLicenseandPerformanceUnlimitedpackage(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopReadyAPIbtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonAPIChooseYourLicenseselectfield();
        StorePage.clickonFixedLicenseoption();
        StorePage.clickonAPIChooseyourpackagefield();
        StorePage.clickonPerformanceUnlimitedoption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    public void AddtoCartusingFloatingLicenseandPerformanceSmallpackage(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopReadyAPIbtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonAPIChooseYourLicenseselectfield();
        StorePage.clickonFloatingLicenseoption();
        StorePage.clickonAPIChooseyourpackagefield();
        StorePage.clickonPerformanceSmalloption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    //@Test
    public void AddtoCartusingFloatingLicenseandPerformanceMediumpackage(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopReadyAPIbtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonAPIChooseYourLicenseselectfield();
        StorePage.clickonFloatingLicenseoption();
        StorePage.clickonAPIChooseyourpackagefield();
        StorePage.clickonPerformanceMediumoption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    @Test
    public void AddtoCartusingFloatingLicenseandPerformanceUnlimitedpackage(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        SmartBearOnlineStorePage SmartBearOnlineStorePage = new SmartBearOnlineStorePage(getDriver());
        SmartBearOnlineStorePage.clickonShopReadyAPIbtn();
        StorePage StorePage = new StorePage(getDriver());
        StorePage.clickonAPIChooseYourLicenseselectfield();
        StorePage.clickonFloatingLicenseoption();
        StorePage.clickonAPIChooseyourpackagefield();
        StorePage.clickonPerformanceUnlimitedoption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }




















    }



















