package pages.mritunjoy;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellFinancialSesvicesPage extends CommonAPI {

    public DellFinancialSesvicesPage(WebDriver driver){PageFactory.initElements(driver, this);}
    @FindBy(xpath = "//div[@class='sc-dIsAE dWzdfH']/h1")
    public WebElement dellFinancialServiceText;



}



