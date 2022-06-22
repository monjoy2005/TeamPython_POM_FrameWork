package pages.Faizan;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"dropdownMenuLink\"]")
    private WebElement Tryanytoolforfreebtn;
    @FindBy(css = "#p_lt_Header > div > div > nav > ul > li.nav-item.nav-item-free-trial.dropdown.show > div > a:nth-child(1)")
    private WebElement TestCompletebtn;
    @FindBy(css = "#p_lt_Header > div > div > nav > ul > li:nth-child(2) > a")
    private WebElement Solutionsbtn;
    @FindBy(css = "#p_lt_Header > div > div > nav > ul > li.nav-item.dropdown.show > div > div > div > div > div > div:nth-child(2) > div.solutions-see-all.mb-4.mb-lg-0 > a")
    private WebElement SeeAllIntegrations;
    @FindBy(css = "#p_lt_Header > div > div > nav > ul > li.nav-item.nav-item-login > a")
    private WebElement Loginbtn;
    @FindBy(css = "#form > footer > nav.main-footer > div > div > div.right-side.col-12.col-md-12.col-xl-3 > div.right-side-container > div > div.contact.col-12 > ul > li:nth-child(1) > a")
    private WebElement Contactusbtn;
    @FindBy(css = "#form > section > div > div > div.col-12.col-md-6.col-lg-7.pt-5 > div > div.border.p-4.mb-5 > div > div.col-md-12.mt-3.mb-2 > a")
    private WebElement Supportbtn;
    @FindBy(xpath = "//*[@id=\"p_lt_Header\"]/div/div/nav/ul/li[1]/a")
    private WebElement ProductsBtn;
    @FindBy(xpath = "//*[@id=\"p_lt_Header\"]/div/div/nav/ul/li[1]/div/div/div/div/div/div[3]/a[6]")
    private WebElement ViewAllProductsBtn;
    @FindBy(xpath = "//*[@id=\"p_lt_Header\"]/div/div/nav/a")
    private WebElement SmartBearLogo;
    @FindBy(xpath = "//*[@id=\"p_lt_Header\"]/div/div/nav/ul/li[8]/div/a[8]")
    private WebElement CollaboratorBtn;
    @FindBy(xpath = "//*[@id=\"p_lt_Header\"]/div/div/nav/ul/li[1]/div/div/div/div/div/div[1]/a[1]/span[2]")
    private WebElement BitBarBtn;
    @FindBy(xpath = "//*[@id=\"form\"]/div[6]/div[1]/div/div[2]/div[6]/a/span[1]")
    private WebElement QAComplete;
    @FindBy(xpath = "//*[@id=\"p_lt_Header\"]/div/div/nav/ul/li[4]/a")
    private WebElement Careersbtn;
    @FindBy(xpath = "//*[@id=\"particles-js\"]/div/div[1]/div/a")
    private WebElement JobsatSmartBearbtn;
    @FindBy(xpath = "//*[@id=\"open-roles\"]/div/div/div/div[1]/div[1]/div/button/div/div/div")
    private WebElement SelectaTeamoption;
    @FindBy(xpath = "//*[@id=\"open-roles\"]/div/div/div/div[1]/div[1]/div/div/div/ul/li[1]/a")
    private WebElement SalesOption;
    @FindBy(xpath = "//*[@id=\"open-roles\"]/div/div/div/div[1]/div[2]/div/button")
    private WebElement SelectaLocationoption;
    @FindBy(xpath = "//*[@id=\"open-roles\"]/div/div/div/div[1]/div[2]/div/div/div/ul/li[1]/a/span")
    private WebElement Somervilleoption;
    @FindBy(xpath = "//*[@id=\"jobs-container\"]/div[2]/div/div/a")
    private WebElement StrategicAccountManager;
    @FindBy(xpath = "//*[@id=\"resetRoles\"]")
    private WebElement ClearFiltersbtn;
    @FindBy(xpath = "//*[@id=\"form\"]/div[6]/div[1]/div/div[2]/div[5]/a")
    private WebElement LoadNinjaOption;

    @FindBy(xpath = "//*[@id=\"form\"]/footer/nav[2]/div/div/div[2]/a[1]/i")
    WebElement Twitterbtn;

    @FindBy(xpath = "//*[@id=\"form\"]/footer/nav[2]/div/div/div[2]/a[2]/i")
    WebElement Facebookbtn;

    @FindBy(xpath = "//*[@id=\"form\"]/footer/nav[2]/div/div/div[2]/a[3]/i")
    WebElement Linkedin;

    @FindBy(xpath = "//*[@id=\"form\"]/footer/nav[2]/div/div/div[2]/a[4]/i")
    WebElement Youtube;
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
    public void clickONSUPPORTBTN(){
        click(Supportbtn);
    }
    public void clickONCONTACTUS(){
        click(Contactusbtn);
    }
    public void clickONPRODUCTSBTN(){
        click(ProductsBtn);
    }
    public void clickONviewALLPRODUCTSBTN(){
        click(ViewAllProductsBtn);
    }
    public void clickonSmartBearLogo(){
        click(SmartBearLogo);
    }
    public void clickonCollaborator(){
        click(CollaboratorBtn);
    }
    public void clickonBitBarBtn(){
        click(BitBarBtn);
    }
    public void clickonQACompleteBtn(){
        click(QAComplete);
    }
    public void clickonCareersbtn(){
        click(Careersbtn);
    }
    public void clickonJobsatSmartBearbtn(){
        click(JobsatSmartBearbtn);
    }
    public void clickonSelectaTeamoption(){
        click(SelectaTeamoption);
    }
    public void clickonSalesoption(){
        click(SalesOption);
    }
    public void clickonSelectaLocationoption(){
        click(SelectaLocationoption);
    }
    public void clickonSomervilleoption(){
        click(Somervilleoption);
    }
    public void clickonStrategicAccountManager(){
        click(StrategicAccountManager);
    }
    public void clickonClearFilters(){
        click(ClearFiltersbtn);
    }
    public void clickonLoadNinjaOption(){
        click(LoadNinjaOption);
    }

    public void clickonTwitterbtn(){
        click(Twitterbtn);
    }

    public void clickonFacebookbtn(){
        click(Facebookbtn);
    }

    public void clickonLinkedinbtn(){
        click(Linkedin);
    }

    public void clickonYoutubebtn(){
        click(Youtube);
    }











}
