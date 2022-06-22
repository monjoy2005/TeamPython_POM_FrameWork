package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"cart\"]/i")
    private WebElement Shoppingcartbtn;
    @FindBy(css = "#form > div.sb-legacy > div.store-content > div.container-wrap.home-tail > div > div > div:nth-child(1) > a > div")
    private WebElement ShopAQTimeprobutton;
    @FindBy(css = "#Buy > div > div.col-md-9 > div:nth-child(2) > div.d-flex.justify-content-between > div > button > div > div > div")
    private WebElement Selectoptionbtn;
    @FindBy(css = "#Buy > div > div.col-md-9 > div:nth-child(2) > div.d-flex.justify-content-between > div > div > div > ul > li:nth-child(2) > a > span > strong")
    private WebElement AQtimefirstoption;
    @FindBy(xpath = "//*[@id=\"subtotal-link-Buy\"]")
    private WebElement AddtoCartbtn;
    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__row.row-39960 > div:nth-child(2) > div > span.input-group-btn-vertical > button.btn.btn-default.bootstrap-touchspin-up")
    private WebElement Plusbtn;
    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__row.row-39960 > div:nth-child(2) > div > span.input-group-btn-vertical > button.btn.btn-default.bootstrap-touchspin-down")
    private WebElement Minusbtn;
    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__row.row-39960 > div.col-md-8.col-sm-12.col-xs-12 > div.cart__product-remove > input[type=checkbox]")
    private WebElement Checkbtn;
    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__actions > div:nth-child(1) > a")
    private WebElement Removebtn;
    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__actions > div:nth-child(2) > a.cart__apply_code.btn")
    private WebElement Repcodebtn;
    @FindBy(css = "#txtRepCode")
    private WebElement Repcodespacebtn;
    @FindBy(xpath = "//*[@id=\"btnApplyCode\"]")
    private WebElement applybtn;
    @FindBy(css = "#form > div.sb-legacy > div.store-content > div:nth-child(2) > div > div > div.row.cart__actions > div:nth-child(2) > a.cart__checkout-button.btn.btn-brand")
    private WebElement Checkoutbtn;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[1]/div[2]/div/div/div[10]/a/div/div[1]/div")
    WebElement ShopTrainingbtn;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[1]/div[2]/div/div/div[3]/div[2]/div/input")
    WebElement quantitySPACEBTN;
    @FindBy(xpath = "//div[contains(text(),'Trainings, Certification and Add-Ons')]")
    WebElement ShopTrainingbtntestcomplete;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/a[1]/span[1]")
    WebElement ContinueShoppingBtn;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement AQtimeProFloatingLicenseOption;

    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[1]/div[2]/div/div/p[1]/a")
    WebElement ContinueShoppingsbtn;
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

    public void typeANDDELETEONQUANTITYSPACEBTN(){
        type(quantitySPACEBTN,"2");
    }
    public void ClickonShopTrainingbtn(){
        click(ShopTrainingbtn);
    }

    public void ClickonShopTrainingbtntestcomplete(){
        click(ShopTrainingbtntestcomplete);
    }

    public void ClickonContinueShoppingBtn(){
        click(ContinueShoppingBtn);
    }

    public void ClickonAQtimeProFloatingLicenseOption(){
        click(AQtimeProFloatingLicenseOption);
    }

    public void ClickonContinueShoppinsgbtn(){
        click(ContinueShoppingsbtn);
    }








}



