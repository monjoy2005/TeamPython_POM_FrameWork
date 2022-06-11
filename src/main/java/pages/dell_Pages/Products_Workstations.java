package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_Workstations extends CommonAPI {
    public Products_Workstations(WebDriver driver){PageFactory.initElements(driver, this);}

        @FindBy (xpath = "//div[@class='cat-banner-text']/h1")
        public WebElement workstationsHeaderText;


}
