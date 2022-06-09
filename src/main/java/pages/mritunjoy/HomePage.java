package pages.mritunjoy;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI{


    @FindBy(xpath = "//div[@class='mh-search']/input")
    public WebElement searchField;

    @FindBy(xpath = "//button[@class='mh-search-btn mh-search-submit']")
    public WebElement searchBtn;

    @FindBy(xpath = "//div[@class='mh-myaccount']")
    public WebElement signInHoverOver;

    @FindBy(xpath = "//*[text()=' Create an account ']")
    public WebElement createAccountBtn;

    @FindBy(xpath = "//div[@class='mh-myaccount-ctas']/a[3]")
    public WebElement financialServiceBtn;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    public WebElement hoverOverProducts;

    @FindBy(xpath = "//a[contains(text(),'Gaming')]")
    public WebElement hoverOverProductsGaming;

    @FindBy(xpath = "//a[contains(text(),'Dell Gaming')]")
    public WebElement hoverOverProductsGamingDellGaming;










    public HomePage(WebDriver driver){PageFactory.initElements(driver, this);}
// reusable steps

    public void searchElement(String item){
        type(searchField,item);
    }
    public void clickSearchBtn(){
        click(searchBtn);
    }
    public void searchElementAndEnter(String item){
        typeAndEnter(searchField,item);
    }
    public void clearSearchField(){
        clear(searchField);
    }

    public void hoverOverOnSignInBtn(){hoverOver(getDriver(),signInHoverOver);}

    //public void clickCreateAccountBtn(){click(createAccountBtn);}
   // public String pageTitle(){return getPageTitle();}
   // public String pageUrl(){return getPageUrl();}



}
