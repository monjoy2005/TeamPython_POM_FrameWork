package pages.Faizan;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TrainingsPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[1]/div[2]/div/div[1]/div/div/div/div/a[1]/span")
    private WebElement ReadyAPI;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[2]/div/div[2]/div[1]/div/a")
    private WebElement AddtoCartOption1;
    //TestComplete
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[1]/div[2]/div/div[1]/div/div/div/div/a[2]")
    private WebElement TestComplete;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/div[2]/div/div[2]/div[1]/div/a")
    private WebElement AddtoCartfirstOption;
    public TrainingsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Steps
    public void clickONReadyAPI(){
        click(ReadyAPI);
    }
    public void clickONAddtoCartOption1(){
        click(AddtoCartOption1);
    }

    public void clickONTestComplete(){
        click(TestComplete);
    }

    public void clickAddtoCartfirstOption(){
        click(AddtoCartfirstOption);
    }
}

