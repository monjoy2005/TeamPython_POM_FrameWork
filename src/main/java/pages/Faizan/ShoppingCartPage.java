package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"cart\"]/i")
    WebElement Shoppingcartbtn;
    @FindBy(css = "#form > div.sb-legacy > div.store-content > div.container-wrap.home-tail > div > div > div:nth-child(1) > a > div")
    WebElement ShopAQTimeprobutton;

    @FindBy(css = "#Buy > div > div.col-md-9 > div:nth-child(2) > div.d-flex.justify-content-between > div > button > div > div > div")
    WebElement Selectoptionbtn;

    @FindBy(css = "#Buy > div > div.col-md-9 > div:nth-child(2) > div.d-flex.justify-content-between > div > div > div > ul > li:nth-child(2) > a > span > strong")
    WebElement AQtimefirstoption;

    @FindBy(xpath = "//*[@id=\"subtotal-link-Buy\"]")
    WebElement AddtoCartbtn;

    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__row.row-39960 > div:nth-child(2) > div > span.input-group-btn-vertical > button.btn.btn-default.bootstrap-touchspin-up")
    WebElement Plusbtn;

    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__row.row-39960 > div:nth-child(2) > div > span.input-group-btn-vertical > button.btn.btn-default.bootstrap-touchspin-down")
    WebElement Minusbtn;

    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__row.row-39960 > div.col-md-8.col-sm-12.col-xs-12 > div.cart__product-remove > input[type=checkbox]")
    WebElement Checkbtn;

    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__actions > div:nth-child(1) > a")
    WebElement Removebtn;

    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__actions > div:nth-child(2) > a.cart__apply_code.btn")
    WebElement Repcodebtn;

    @FindBy(css = "#txtRepCode")
    WebElement Repcodespacebtn;

    @FindBy(xpath = "//*[@id=\"btnApplyCode\"]")
    WebElement applybtn;

    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__actions > div:nth-child(2) > a.cart__checkout-button.btn.btn-brand")
    private WebElement Checkoutbtn;
    public ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //reusable steps
    public void Clickonshoppingcartbtn(){
        click(Shoppingcartbtn);
    }
    public void clickonShopAQTimeprobutton() {
        click(ShopAQTimeprobutton);
    }
    public void ClickonSelectoptionbtn(){
        click(Selectoptionbtn);
    }
    public void ClickonAQtimefirstoption(){
        click(AQtimefirstoption);
    }
    public void ClickonAddtoCartbtn() {
        click(AddtoCartbtn);
    }
    public void ClickonPlusbtn(){
        click(Plusbtn);
    }
    public void ClickonMinusbtn(){
        click(Minusbtn);
    }
    public void ClickonCheckbtn(){
        click(Checkbtn);
    }
    public void ClickonRemovebtn(){
        click(Removebtn);
    }
    public void ClickonRepcodebtn(){
        click(Repcodebtn);
    }
    public void ClickonRepcodespacebtn(){
        click(Repcodespacebtn);
        type(Repcodespacebtn,"Abc123");
    }
    public void ClickonApplybtn(){
        click(applybtn);
    }
    public void ClickonCheckoutbtn(){
        click(Checkoutbtn);
    }






}



