package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QACompletePage extends CommonAPI {
    @FindBy(css = "div[class='button forgot']")
    private WebElement ForgotPasswordBtn;
    @FindBy(xpath = "//*[@id=\"ForgotPasswordForm_username\"]/input")
    private WebElement EmailAddressField;
    @FindBy(xpath = "//*[@id=\"ForgotPasswordForm_submit\"]")
    private WebElement ResetPasswordBtn;
    @FindBy(xpath = "//div[contains(text(),'Change Password')]")
    private WebElement ChangePassword;
    public QACompletePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickONForgotPasswordBtn() {
        click(ForgotPasswordBtn);
    }

    public void TYPEONEmailAddressField(){
        type(EmailAddressField,"ElonMusk@gmail.com");
    }
    public void clickONResetPasswordBtn() {
        click(ResetPasswordBtn);
    }

    public void clickONChangePassword() {
        click(ChangePassword);
    }
}
