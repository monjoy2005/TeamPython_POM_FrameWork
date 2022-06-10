package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PerspectivesPage extends CommonAPI {
    public PerspectivesPage(WebDriver driver){
        PageFactory.initElements(driver, this);}


    @FindBy(xpath = "//div[@class='nav-dir']")
    private WebElement headerText;



    public String perspectivesHeaderText(){return getElementText(headerText);}

    public String perspectivesHeader(){
        return getElementText(headerText);}

}
