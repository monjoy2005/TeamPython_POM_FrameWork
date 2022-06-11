package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UpdateProfilePage extends CommonAPI {


    @FindBy(css = "#phone")
    WebElement scrollToPhone;

    @FindBy(css = "#job_title")
    WebElement jobTitle;

    @FindBy(css = "#interests")
    WebElement interests;

    @FindBy(css = "#company_url")
    WebElement companyURL;

    @FindBy(css = "#company_industry > span")
    WebElement dropdownMenu;


    public UpdateProfilePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void scrollToView(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrollToPhone);
    }

    public void typeJobTitle(){type(jobTitle,"Quality Assurance Engineer");}

    public void typeInterests(){type(interests, "Video Games");}

    public void typeCompanyURL(){type(companyURL, "https://www.facebook.com/");}


    public List<WebElement> getDropDownOptions(){
        Select select = new Select(dropdownMenu);
        return select.getOptions();
    }
}
