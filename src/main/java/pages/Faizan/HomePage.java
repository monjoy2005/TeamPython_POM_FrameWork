package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"dropdownMenuLink\"]")
    WebElement Tryanytoolforfreebtn;
    @FindBy(css = "#p_lt_Header > div > div > nav > ul > li.nav-item.nav-item-free-trial.dropdown.show > div > a:nth-child(1)")
    WebElement TestCompletebtn;

    @FindBy(css = "#p_lt_Header > div > div > nav > ul > li:nth-child(2) > a")
    WebElement Solutionsbtn;

    @FindBy(css = "#p_lt_Header > div > div > nav > ul > li.nav-item.dropdown.show > div > div > div > div > div > div:nth-child(2) > div.solutions-see-all.mb-4.mb-lg-0 > a")
    WebElement SeeAllIntegrations;

    @FindBy(css = "#p_lt_Header > div > div > nav > ul > li.nav-item.nav-item-login > a")
    WebElement Loginbtn;

    @FindBy(css = "#form > div.login-modal > div.container > div > div.row.d-flex.h-100 > div:nth-child(2) > a > span.prod-icon.as.empty")
    WebElement AlertSiteBtn;

    @FindBy(css = "#form > footer > nav.main-footer > div > div > div.right-side.col-12.col-md-12.col-xl-3 > div.right-side-container > div > div.contact.col-12 > ul > li:nth-child(1) > a")
    WebElement Contactusbtn;

    @FindBy(css = "#form > section > div > div > div.col-12.col-md-6.col-lg-7.pt-5 > div > div.border.p-4.mb-5 > div > div.col-md-12.mt-3.mb-2 > a")
    WebElement Supportbtn;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable steps
    public void clickONTryanytoolforfreebtn(){
        click(Tryanytoolforfreebtn);
    }
    public void clickONTestCompletebtn(){
        click(TestCompletebtn);
    }

    public void clickONSOLUTIONBTN(){
        click(Solutionsbtn);
    }

    public void clickONSeeAllIntegrationsbtn(){
        click(SeeAllIntegrations);
    }

    public void clickONLoginbtn(){
        click(Loginbtn);
    }

    public void clickONAlertsite(){
        click(AlertSiteBtn);
    }

    public void clickONSUPPORTBTN(){
        click(Supportbtn);
    }

    public void clickONCONTACTUS(){
        click(Contactusbtn);
    }





}
