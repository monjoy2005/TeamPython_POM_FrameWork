package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoadNinjaLoginCredentials extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement EmailField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement PasswordField;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[2]/div/form/div[5]/button")
    WebElement SignInBtn;

    public LoadNinjaLoginCredentials(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Steps
    public void TypeonEmailField(){
        type(EmailField,"TonyStark123@gmail.com");
    }
    public void TypeonPasswordField(){
        type(PasswordField,"TonyStark123");
    }
    public void ClickonSignInBtn(){
        click(SignInBtn);
    }

}
