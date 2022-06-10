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





}
