package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IntegrationsPage extends CommonAPI {
    @FindBy(css = "#form > div.technologies > div > div.row.d-flex.pull-tech-up > div:nth-child(3) > div > div.tech-card-products > div.tech-card-products-update > a:nth-child(1)")
    WebElement JIRAcollaboratorbtn;
    public IntegrationsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickONJIRACOLLABORATORBTN(){
        click(JIRAcollaboratorbtn);
    }
}
