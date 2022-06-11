package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI{


    @FindBy(xpath = "//div[@class='mh-search']/input")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='mh-search-btn mh-search-submit']")
    private WebElement searchBtn;

    @FindBy(xpath = "//div[@class='mh-myaccount']")
    private WebElement signInHoverOver;

    @FindBy(xpath = "//a[@class='mh-btn mh-btn-primary navigate']")
    private WebElement signInBtn;

    @FindBy(xpath = "//*[text()=' Create an account ']")
    public WebElement createAccountBtn;

    @FindBy(xpath = "//div[@class='mh-myaccount-ctas']/a[3]")
    private WebElement financialServiceBtn;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    public WebElement hoverOverProducts;

    @FindBy(xpath = "//a[contains(text(),'Gaming')]")
    public WebElement hoverOverProductsGaming;

    @FindBy(xpath = "//a[contains(text(),'Dell Gaming')]")
    public WebElement hoverOverProductsGamingDellGaming;

    @FindBy(xpath = "//div[@class='hp-h-category-wrap']/div[3]/div")
    public WebElement hoverOverAlienware;
    @FindBy(xpath = "//div[@class='hp-h-category-wrap']/div[3]/div/figure/following-sibling::div/following-sibling::div/a[1]")
    public WebElement hoverOverAlienwareLaptops;

    @FindBy(xpath = "//span[contains(text(),'Products')]//..//../following-sibling::ul/li[6]/a")
    private WebElement workStationsOption;

    @FindBy(xpath = "//ul[@class='mh-top-menu-nav aria-nav']/li[8]/a/span")
    public WebElement aboutUsOption;

    @FindBy(xpath = "//ul[@class='mh-top-menu-nav aria-nav']/li[8]/ul/li[11]/a")
    public WebElement perspectivesBtn;

    @FindBy(xpath = "//div[@class='ContextualFooter1']/div[3]/ul/li[2]/a")
    private WebElement contactSupportBtn;

    @FindBy(xpath = "//div[@class='ContextualFooter2']/div[4]/ul/li[3]/a")
    private WebElement emailSignUp;








    public HomePage(WebDriver driver){PageFactory.initElements(driver, this);}
// reusable steps

    public void clickSignInBtn(){
        click(signInBtn);
    }
    public void clickFinancialServiceBtn(){
        click(financialServiceBtn);
    }
    public void chickCreateAccountBtn(){
        click(createAccountBtn);}
    public void clickEmailSignUpBtn(){
        click(emailSignUp);
    }

    public void clickContactSupportBtn(){click(contactSupportBtn);}

    public void hoverOverAboutUs(WebDriver driver){
        hoverOver(driver,aboutUsOption);}

    public void searchElement(String item){
        type(searchField,item);
    }

    public void clickWorkStationsBtn(){
        click(workStationsOption);}

    public void clickSearchBtn(){
        click(searchBtn);
    }
    public void searchElementAndEnter(String item){
        typeAndEnter(searchField,item);
    }
    public void clearSearchField(){
        clear(searchField);
    }

    public void hoverOverOnSignInBtn(WebDriver driver){  //this is the format of hoverOver
        hoverOver(driver,signInHoverOver);}



    //public void clickCreateAccountBtn(){click(createAccountBtn);}
   // public String pageTitle(){return getPageTitle();}
   // public String pageUrl(){return getPageUrl();}



}
