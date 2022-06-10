package Application.SmartBear;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.Faizan.ShoppingCartPage;


public class ShoppingCartTest extends CommonAPI {
    @Test
    public void Addtocart() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        waitFor(3);
        shoppingCartPage.clickonShopAQTimeprobutton();
        waitFor(3);
        shoppingCartPage.ClickonSelectoptionbtn();
        waitFor(3);
        shoppingCartPage.ClickonAQtimefirstoption();
        waitFor(3);
        shoppingCartPage.ClickonAddtoCartbtn();
        waitFor(3);

    }

    @Test
    public void Addquantity() {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        waitFor(3);
        shoppingCartPage.clickonShopAQTimeprobutton();
        waitFor(3);
        shoppingCartPage.ClickonSelectoptionbtn();
        waitFor(3);
        shoppingCartPage.ClickonAQtimefirstoption();
        waitFor(3);
        shoppingCartPage.ClickonAddtoCartbtn();
        waitFor(3);
        shoppingCartPage.ClickonPlusbtn();
        waitFor(3);
    }
    @Test
    public void Deductquantity(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        waitFor(3);
        shoppingCartPage.clickonShopAQTimeprobutton();
        waitFor(3);
        shoppingCartPage.ClickonSelectoptionbtn();
        waitFor(3);
        shoppingCartPage.ClickonAQtimefirstoption();
        waitFor(3);
        shoppingCartPage.ClickonAddtoCartbtn();
        waitFor(3);
        shoppingCartPage.ClickonPlusbtn();
        waitFor(3);
        shoppingCartPage.ClickonMinusbtn();
        waitFor(3);
    }
    @Test
    public void Removeitemfromcart(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        waitFor(3);
        shoppingCartPage.clickonShopAQTimeprobutton();
        waitFor(3);
        shoppingCartPage.ClickonSelectoptionbtn();
        waitFor(3);
        shoppingCartPage.ClickonAQtimefirstoption();
        waitFor(3);
        shoppingCartPage.ClickonAddtoCartbtn();
        waitFor(3);
        shoppingCartPage.ClickonCheckbtn();
        waitFor(3);
        shoppingCartPage.ClickonRemovebtn();
        waitFor(3);
    }
    @Test
    public void Applygiftcode(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        waitFor(3);
        shoppingCartPage.clickonShopAQTimeprobutton();
        waitFor(3);
        shoppingCartPage.ClickonSelectoptionbtn();
        waitFor(3);
        shoppingCartPage.ClickonAQtimefirstoption();
        waitFor(3);
        shoppingCartPage.ClickonAddtoCartbtn();
        waitFor(3);
        shoppingCartPage.ClickonRepcodebtn();
        waitFor(3);
        shoppingCartPage.ClickonRepcodespacebtn();
        waitFor(3);
        shoppingCartPage.ClickonApplybtn();
        waitFor(3);
    }
    public void Proceedtocheckout(){
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(getDriver());
        shoppingCartPage.Clickonshoppingcartbtn();
        waitFor(3);
        shoppingCartPage.clickonShopAQTimeprobutton();
        waitFor(3);
        shoppingCartPage.ClickonSelectoptionbtn();
        waitFor(3);
        shoppingCartPage.ClickonAQtimefirstoption();
        waitFor(3);
        shoppingCartPage.ClickonAddtoCartbtn();
        waitFor(3);
        shoppingCartPage.ClickonCheckoutbtn();
        waitFor(3);




    }



    }

















