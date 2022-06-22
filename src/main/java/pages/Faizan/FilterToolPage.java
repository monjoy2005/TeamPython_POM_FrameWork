package pages.Faizan;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class FilterToolPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"productComponent\"]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]")
    private WebElement integrationsBTN;
    @FindBy(xpath = "//*[@id=\"productComponent\"]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/div[1]/label")
    private WebElement option1;
    @FindBy(xpath = "//*[@id=\"productComponent\"]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/div[3]/div[1]/label")
    private WebElement option2;
    @FindBy(xpath = "//*[@id=\"productComponent\"]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/form/div[1]/div[4]/div[1]/label")
    private WebElement option3;
    public FilterToolPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Steps
    public void clickONINTEGRATIONBTN(){
        click(integrationsBTN);
    }
    public void clickOPTION1(){
        click(option1);
    }
    public void clickOPTION2(){
        click(option2);
    }
    public void clickOPTION3(){
        click(option3);
    }
}
