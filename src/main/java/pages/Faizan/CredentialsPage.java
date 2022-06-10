package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CredentialsPage extends CommonAPI {
    //Address Information
    @FindBy(css = "#cbiID0ECARBCFBFBOA")
    WebElement Companyname;

    @FindBy(css = "#cbiID0ECAPBCFBFBOA")
    WebElement Firstname;

    @FindBy(css = "#cbiID0ECAOBCFBFBOA")
    WebElement Lastname;

    @FindBy(css = "#cbiID0ECALBCFBFBOA")
    WebElement Streetaddress;

    @FindBy(css = "#cbiID0ECAJBCFBFBOA")
    WebElement City;

    @FindBy(css = "#cbiID0ECAHBCFBFBOA")
    WebElement Zipcode;


    public CredentialsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Method
     public void clickandtypeonCompanyname(){
        click(Companyname);
        type(Companyname,"Spacex");
     }
     public void clickandtypeonFirstname(){
        click(Companyname);
        type(Companyname,"Elon");
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




}
