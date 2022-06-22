package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadNinjaPage extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Pricing')]")
    private WebElement Pricingbtn;
    @FindBy(xpath = "//*[@id=\"pricing-toggle-js\"]")
    private WebElement Pricingtogglebtn;
    public LoadNinjaPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Steps
    public void clickonPricingbtn(){
        click(Pricingbtn);
    }

    public void clickonPricingtogglebtn(){
        click(Pricingtogglebtn);
    }
}
