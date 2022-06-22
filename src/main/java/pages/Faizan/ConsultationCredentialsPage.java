package pages.Faizan;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultationCredentialsPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    private WebElement FirstName;

    public ConsultationCredentialsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //REUSABLE STEPS
    public void TypeonFirstName(){
        type(FirstName,"Bill");
    }
}
