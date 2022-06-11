package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage extends CommonAPI {
    @FindBy(css = "#searchComponentLite > div > div > div > div > input")
    WebElement Searchfield;

    @FindBy(css = "#searchComponent > div > div.app > div.app-input > div > div")
    WebElement clearbtn;

    @FindBy(css = "#searchComponent > div > div.app > div.app-input > div > div")
    WebElement Closebtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[1]/div/div/div[2]/p/a[1]")
    WebElement openacasebtn;

    @FindBy(xpath = "//*[@id=\"root\"]/div[4]/div[2]/div/div/div[4]/a/span[1]")
    WebElement CaptureforJIRABTN;

    //Provide Information about yourself
    @FindBy(xpath = "")
    WebElement youremail;

    @FindBy(xpath = "//*[@id=\"webToCasePage:w2cForm:webToCaseZephyr:webToCaseZephyrComponent:step1:webToCaseContainer:edtExtraEmails\"]")
    WebElement ccemails;

    @FindBy(xpath = "//*[@id=\"webToCasePage:w2cForm:webToCaseZephyr:webToCaseZephyrComponent:step1:webToCaseContainer:edtFullName\"]")
    WebElement YourFullName;
    //Enter description of the issue
    @FindBy(xpath = "//*[@id=\"webToCasePage:w2cForm:webToCaseZephyr:webToCaseZephyrComponent:step3:webToCaseContainer:edtSubject\"]")
    WebElement Subjectfield;
    // work on problem description element
    @FindBy(xpath = "//*[@id=\"webToCasePage:w2cForm:webToCaseZephyr:webToCaseZephyrComponent:save\"]")
    WebElement Submitnofilestouploadbtn;


    public SupportPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable steps
    public void clickANDTYPEONSearchfield(){
        click(Searchfield);
        typeAndEnter(Searchfield,"AlertSite");
    }
    public void clickONCLEAR() {
        click(clearbtn);
    }
    public void clickONCLOSE() {
        click(Closebtn);
    }
    public void clickONopencasebtn() {
        click(openacasebtn);
    }
    public void clickONCaptureforJIRABTN() {
        click(CaptureforJIRABTN);
    }
    public void clickANDTYPEONYOUREMAIL(){
        click(youremail);
        type(youremail,"jeffbezos@gmail.com");
    }
    public void clickANDTYPEONCCEMAIL(){
        click(ccemails);
        type(ccemails,"jeffbezos@gmail.com");
    }
    public void clickANDTYPEONYOURFULLNAME(){
        click(YourFullName);
        type(YourFullName,"Jeff Bezos");
    }
    public void clickANDTYPEONSUBJECTFIELD(){
        click(Subjectfield);
        type(Subjectfield,"Help");
    }
    public void clickONSubmitnofilestouploadbtn() {
        click(Submitnofilestouploadbtn);
    }


}
