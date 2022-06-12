package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsitePage extends CommonAPI {
    @FindBy(css = "//input[@placeholder='email']")
    WebElement AlertsiteEmail;

    @FindBy(css = "//*[@id=\"id_password\"]")
    WebElement Alertpassword;

    @FindBy(css = "//*[@id=\"signin-form\"]/div[3]/input")
    WebElement SignInbtn;

    public AlertsitePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable steps
    public void clickANDTYPEONEMAIL(){
        click(AlertsiteEmail);
        type(AlertsiteEmail,"ElonMusk@gmail.com");
    }
    public void clickANDTYPEONpassword(){
        click(Alertpassword);
        type(Alertpassword,"ElonMusk123");
    }
    public void clickONSigninbtn() {
        click(SignInbtn);
    }

    }

