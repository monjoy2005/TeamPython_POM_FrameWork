package pages.Faizan;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AlertsitePage extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Forgot Password?')]")
    private WebElement forgotPASSWORDBTN;
    @FindBy(xpath = "//input[@id='id_email']")
    private WebElement resetPASSWORDBAR;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]")
    private WebElement submitBTN;
    public AlertsitePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable steps
    public void clickonforgotPASSWORDBTN() {
        click(forgotPASSWORDBTN);
    }
    public void typeOnresetPASSWORDBAR() {
        type(resetPASSWORDBAR,"pnt123@gmail.com");
    }
    public void clickONSUBMITBTN() {
        click(submitBTN);
    }
}

