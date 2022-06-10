package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CredentialsPage extends CommonAPI {
    //Address Information
    @FindBy(css = "#cbiID0ECARBCFBFBOA")
    private WebElement Companyname;

    @FindBy(css = "#cbiID0ECAPBCFBFBOA")
    private WebElement Firstname;

    @FindBy(css = "#cbiID0ECAOBCFBFBOA")
    private WebElement Lastname;

    @FindBy(css = "#cbiID0ECALBCFBFBOA")
    private WebElement Streetaddress;

    @FindBy(css = "#cbiID0ECAJBCFBFBOA")
    private WebElement City;

    @FindBy(css = "#cbiID0ECAHBCFBFBOA")
    private WebElement Zipcode;

    @FindBy(css = "#cbiID0EDAEBCFBFBOA")
    private WebElement phoneNUMBER;

    @FindBy(css = "#cbiID0ECAABBBCFBFBOA")
    private WebElement Email;
    //Payment options
    @FindBy(css = "#cbiID0ECABAAAWDABBFBOA")
    private WebElement cardHOLDERNAME;

    @FindBy(css = "#cbiID0ECABCAAWDABBFBOA")
    private WebElement Cardnumber;

    @FindBy(css = "#cbiID0ECABBAAWDABBFBOA")
    private WebElement CVVcode;

    @FindBy(css = "#cleverSubmitPurchase > span > span > span > span > span > input")
    private WebElement BuyNowbtn;
    public CredentialsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Method
     public void clickandtypeonCompanyname(){
        click(Companyname);
        type(Companyname,"Spacex");
     }
     public void clickandtypeonFirstname(){
        click(Firstname);
        type(Firstname,"Elon");
     }
    public void clickandtypeonLastname(){
        click(Lastname);
        type(Lastname,"Musk");
    }
    public void clickandtypeonStreetaddress(){
        click(Streetaddress);
        type(Streetaddress,"86-11 Woodside ave");
    }
    public void clickandtypeonCity(){
        click(City);
        type(City,"Sunnyside");
    }
    public void clickandtypeonZipcode(){
        click(Zipcode);
        type(Zipcode,"11368");
    }
    public void clickANDTYPEONPHONENUMBER(){
        click(phoneNUMBER);
        type(phoneNUMBER,"929-396-5922");
    }
    public void clickANDTYPEONEMAIL(){
        click(Email);
        type(Email,"ElonMusk@gmail.com");
    }
    public void clickANDTYPEONCARDHOLDERNAME(){
        click(cardHOLDERNAME);
        type(cardHOLDERNAME,"Elon Musk");
    }
    public void clickANDTYPEONCARDNUMBER(){
        click(Cardnumber);
        type(Cardnumber,"123-456-7891");
    }
    public void clickANDTYPEONCVVCODE(){
        click(CVVcode);
        type(CVVcode,"826");
    }
    public void clickBUYNOWBTN(){
        click(BuyNowbtn);
    }












}
