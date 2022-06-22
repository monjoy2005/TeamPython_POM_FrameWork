package pages.Faizan;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CollaboratorPage extends CommonAPI {
    @FindBy(css = "#form > div.brand-wrap.brand-wrap-independent > section.band.band-hero.bg-transparent > div:nth-child(1) > div > div > div > div > div > p:nth-child(2) > a")
    private WebElement ScheduleADemobtn;
    @FindBy(xpath = "//*[@id=\"p_lt_Header\"]/div[2]/div/nav/ul/li[5]/a")
    private WebElement clickONROICalculator;

    @FindBy(xpath = "//*[@id=\"more_def_ff\"]/input[1]")
    private WebElement clickanddragonoption1;
    @FindBy(xpath = "//*[@id=\"form\"]/div[5]/section[1]/div/div/div/div[2]/div[2]/a")
    private WebElement Clickonconsultationbtn;
    //Consultation credentials
    @FindBy(css = "input[id='FirstName']")
    private WebElement FirstName;
    @FindBy(css = "input[id='LastName']")
    private WebElement LastName;
    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement EmailAddress;
    @FindBy(xpath = "//*[@id=\"Phone\"]")
    private WebElement PhoneNumber;
    @FindBy(xpath = "//*[@id=\"Company\"]")
    private WebElement CompanyName;
    @FindBy(xpath = "//*[@id=\"mktoForm_3371\"]/div[8]/span/button")
    private WebElement RequestDemoBtn;
    public CollaboratorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickONScheduleADemobtn(){
        click(ScheduleADemobtn);
    }
    public void clickONROICalculator(){
        click(clickONROICalculator);
    }
    public void clickanddragonoption1(){
        clickWithActions(getDriver(),"clickanddragonoption1");
    }
    public void Clickonconsultationbtn(){
        click(Clickonconsultationbtn);
    }
    public void TypeonFirstName(){
        type(FirstName,"Bill");
    }
    public void TypeonLastName(){
        type(LastName,"Gates");
    }
    public void TypeonEmailAddress(){
        type(EmailAddress,"BillGates@gmail.com");
    }
    public void TypeonPhoneNumber(){
        type(PhoneNumber,"929-397-5923");
    }
    public void TypeonCompanyName(){
        type(CompanyName,"Microsoft");
    }
    public void ClickonRequestDemoBtn(){
        click(RequestDemoBtn);
    }
}
