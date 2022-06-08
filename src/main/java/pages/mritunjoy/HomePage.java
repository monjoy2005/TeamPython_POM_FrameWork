package pages.mritunjoy;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI{


    @FindBy(xpath = "//div[@class='mh-search']/input")
    private WebElement searchField;
    @FindBy(xpath = "//button[@class='mh-search-btn mh-search-submit']")
    private WebElement searchBtn;








    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
// reusable methods

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
    public String pageTitle(){return getPageTitle();}
    public String pageUrl(){return getPageUrl();}



}
