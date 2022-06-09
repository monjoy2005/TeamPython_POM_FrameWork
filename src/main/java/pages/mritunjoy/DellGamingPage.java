package pages.mritunjoy;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellGamingPage extends CommonAPI {
    public DellGamingPage(WebDriver driver){PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//li[@class='product-finder-category ']/button")
    public WebElement gamingLaptopsBtn;

    @FindBy(xpath = "//div[@class='title bottom-offset-0 clear-both']/h1")
    public WebElement dellGamingPageTitle;
}
