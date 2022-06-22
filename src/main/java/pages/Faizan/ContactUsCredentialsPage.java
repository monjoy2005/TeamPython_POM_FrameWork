package pages.Faizan;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ContactUsCredentialsPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"FirstName\"]")
    private WebElement FirstName;
    @FindBy(xpath = "//*[@id=\"LastName\"]")
    private WebElement LastName;
    @FindBy(xpath = "//*[@id=\"Email\"]")
    private WebElement WorkEmail;
    @FindBy(xpath = "//*[@id=\"Company\"]")
    private WebElement Company;
    @FindBy(xpath = "//*[@id=\"Phone\"]")
    private WebElement Phone;
    @FindBy(xpath = "//*[@id=\"Country\"]")
    private WebElement CountryOption;
    @FindBy(xpath = "//*[@id=\"Country\"]/option[2]")
    private WebElement USoption;
    @FindBy(xpath = "//*[@id=\"Product__c\"]")
    private WebElement Productoption;
    @FindBy(xpath = "//*[@id=\"Product__c\"]/option[1]")
    private WebElement AlertSiteoption;
    @FindBy(xpath = "//*[@id=\"Contact_interest\"]")
    private WebElement AreaofInterestOption;
    @FindBy(xpath = "//*[@id=\"Contact_interest\"]/option[8]")
    private WebElement OtherOption;
    @FindBy(xpath = "//*[@id=\"Contact_Me__c\"]")
    private WebElement Commentsorquestionsfield;
    @FindBy(xpath = "//*[@id=\"mktoForm_2961\"]/div[12]/span/button")
    private WebElement ContactSmartBearBtn;
    public ContactUsCredentialsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Steps
    public void TypeFirstName(){
        type(FirstName,"Bill");
    }
    public void TypeLastName(){
        type(LastName,"Gates");
    }
    public void TypeWorkEmail(){
        type(WorkEmail,"BillGates@gmail.com");
    }
    public void TypeCompany(){
        type(Company,"Microsoft");
    }
    public void TypePhone(){
        type(Phone,"929-463-9824");
    }
    public void ClickCountryOption(){
        click(CountryOption);
    }
    public void clickUSoption(){
        click(USoption);
    }
    public void clickProductoption(){
        click(Productoption);
    }
    public void clickAlertSiteoption(){
        click(AlertSiteoption);
    }
    public void clickAreaofInterestOption(){
        click(AreaofInterestOption);
    }
    public void clickOtherOption(){
        click(OtherOption);
    }
    public void TypeoncommentsorQuestions(){
        type(Commentsorquestionsfield,"Help");
    }
    public void clickContactSmartBear(){
        click(ContactSmartBearBtn);
    }
}
