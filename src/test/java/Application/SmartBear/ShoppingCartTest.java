package Application.SmartBear;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.Faizan.CredentialsPage;
import pages.Faizan.ShoppingCartPage;


public class ShoppingCartTest extends CommonAPI {
    @Test
    public void Addtocart() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
    }
    @Test
    public void Addquantity() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        shoppingCartPage.clickonShopAQTimeprobutton();
        shoppingCartPage.ClickonSelectoptionbtn();
        shoppingCartPage.ClickonAQtimefirstoption();
        shoppingCartPage.ClickonAddtoCartbtn();
        shoppingCartPage.ClickonPlusbtn();
    }
    @Test
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
    @Test
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
    @Test
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
    @Test
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



    }

//Test

















