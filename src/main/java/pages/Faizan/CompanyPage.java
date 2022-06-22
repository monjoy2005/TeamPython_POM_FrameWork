package pages.Faizan;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CompanyPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"header\"]/a")
    private WebElement ViewAllJobsOption;
    public CompanyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Steps
    public void clickonViewAllJobsOption(){
        click(ViewAllJobsOption);
    }
}
