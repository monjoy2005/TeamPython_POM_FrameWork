package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomizingItemPage extends CommonAPI {

@FindBy(css = "a[class='btn btn-default button-plus product_quantity_up']")
    public WebElement quantityUp;

@FindBy(css = "a[class='btn btn-default button-minus product_quantity_down']")
public WebElement quantityDown;

@FindBy(css = "#group_1")
public WebElement size;

@FindBy(xpath = "(//label[@class='attribute_label'])[1]")
public WebElement sizeLabelAssertion;


@FindBy(css = "a[title='Blue']")
public WebElement color;

@FindBy(xpath = "(//label[@class='attribute_label'])[2]")
public WebElement colorAssertion;







    public CustomizingItemPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
}
