package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferralProgramPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div/div/profile-card/div/div[2]/div[2]/div[2]/a")
    WebElement referralProgram;

    @FindBy(css = "#Email-1")
    WebElement yourEmail;

    @FindBy(css = "#Textbox-1")
    WebElement firstName;

    @FindBy(css = "#Textbox-2")
    WebElement lastName;

    @FindBy(css = "#Country-1")
    WebElement dropdownCountryMenu;

    @FindBy(xpath = "//*[@id=\"Country-1\"]/option[2]")
    WebElement chooseCountry;

    @FindBy(css = "#State-1")
    WebElement dropdownStateMenu;

    @FindBy(xpath = "//*[@id=\"State-1\"]/option[34]")
    WebElement chooseState;

    @FindBy(xpath = "//*[@id=\"C053_Col00\"]/div[4]/div/label/input")
    WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"C052_Col00\"]/button")
    WebElement nextBtn;

    public ReferralProgramPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable steps


    public void clickReferralProgram(){click(referralProgram);}

    public void typeYourEmail(){type(yourEmail, "facebooktester1089@gmail.com");}

    public void typeFirstName(){type(firstName, "John");}

    public void typeLastName(){type(lastName, "Smith");}

    public void clickDropdownCountry(){click(dropdownCountryMenu);}

    public void clickCountry(){click(chooseCountry);}

}
