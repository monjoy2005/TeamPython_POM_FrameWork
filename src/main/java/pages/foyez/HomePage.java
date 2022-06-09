package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    @FindBy(css = "a.login")
    private WebElement SignIn;

    @FindBy(xpath = "//a[@title='View my customer account']/span")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='search_query_top']")
    public WebElement searchBox;

    @FindBy(css = "button[name='submit_search']")
    public WebElement searchBtn;

    @FindBy(xpath = "(//h5/a[@title='Faded Short Sleeve T-shirts'])[1]")
    public WebElement homepageItem;

    @FindBy(xpath = "(//a/span[text()='Add to cart'])[1]")
    public WebElement CartFromHomePage;

    @FindBy(xpath = "//a[@class='homefeatured']")
    public WebElement popularAssertion;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


// reusable steps

    public void clickOnSignIn() {
        click(SignIn);
    }


    public void searchElement(String item) {
        type(searchBox, item);
    }

    public void clickOnSearchBtn(){
        click(searchBtn);
    }

    public void typeAndHit(String item){
        typeAndEnter(searchBox,item);
    }

    public void clickOnHomePageItem(){
        click(homepageItem);
    }


    public void hoverOverHomePageItem(WebDriver driver){
        hoverOver(driver,homepageItem);
    }


}