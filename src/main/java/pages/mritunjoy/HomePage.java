package pages.mritunjoy;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(css = "#ac-gn-searchform-input") //modified
    private WebElement searchField;

    @FindBy(css = "#ac-gn-searchform-submit") //modified
    private WebElement searchBtn;

    @FindBy(css = "#ac-gn-link-search") //NEW
    private WebElement searchBtnBeforeSearch;

    @FindBy(xpath = "//a[@class='ac-gn-link ac-gn-link-mac']")//NEW
    private WebElement macBtn;

    public void clickMacBtn(){ //NEW
        click(macBtn);
    }

    public String getLandedPageTitle(){ //NEW
        return getPageTitle();
    }

    @FindBy(css = "#searchDropdownBox")
    private WebElement menuDropdown;

    @FindBy(css = "#nav-link-accountList-nav-line-1")
    private WebElement floatingMenu;

    @FindBy(xpath = "//*[text()='Sign in']")
    private WebElement signInBtn;

    @FindBy(css = "#searchDropdownBox option")
    private List<WebElement> menuDropdownOptions;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps
    public void searchElement(String item){
        type(searchField, item);
    }
    public void clickSearchBtn(){
        click(searchBtn);
    }
    public void clickSearchBtnBeforeSearch(){
        click(searchBtnBeforeSearch);
    }
    public void clearSearchField(){
        clear(searchField);
    }
    public void searchElementAndEnter(String item){
        typeAndEnter(searchField, item);
    }
    public void selectOptionFromMenuDropdown(String option){
        selectFromDropdown(menuDropdown, option);
    }
    public List<String> getHomePageDropdownOptions(){
        List<String> options = new ArrayList<>();
        List<WebElement> elements = getDropDownOptions(menuDropdown);
        for (WebElement element:elements) {
            options.add(element.getText());
        }
        return options;
    }
    public void selectOptionFromMenuDropdownWithSelectOptions(String option){
        List<WebElement> elements = getDropDownOptions(menuDropdown);
        for (WebElement element:elements) {
            if (element.getText().equalsIgnoreCase(option)){
                element.click();
            }
        }
    }
    public void selectOptionFromMenuDropdownWithGivenText(String option){
        List<WebElement> elements = menuDropdownOptions;
        for (WebElement element :elements) {
            if (element.getText().equalsIgnoreCase(option)){
                element.click();
            }
        }
    }
    public void hoverOverFloatingMenu(WebDriver driver){
        hoverOver(driver, floatingMenu);
    }
    public void clickOnLoginBtn(){
        click(signInBtn);
    }
}