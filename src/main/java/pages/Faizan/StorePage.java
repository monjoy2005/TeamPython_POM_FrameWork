package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/button/div/div/div")
    WebElement ChooseYourLicenseSelectField;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement NamedLicenseOption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/button/div/div/div")
    WebElement ChooseYourPackageSelectField;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement CollaboratorTeamOption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement ConcurrentLicense;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement CollaboratorEnterprise;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/button/div/div/div")
    WebElement QaCompleteSelectfield;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement QaCompletesaas;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement QaCompleteoption;
    //Ready API Store page
    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/button/div/div/div")
    WebElement APIChooseYourLicenseselectfield;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement FixedLicenseoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/button/div/div/div")
    WebElement APIChooseyourpackageselectfield;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[2]/a/span/strong")
    WebElement PerformanceSmalloption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement Performancemediumoption;

    @FindBy (xpath = "//*[@id=\"Buy\"]/div/div[1]/div[2]/div[2]/div/div/div/ul/li[4]/a/span/strong")
    WebElement PerformanceUnlimitedoption;

    @FindBy(xpath = "//*[@id=\"Buy\"]/div/div[1]/div[1]/div[2]/div/div/div/ul/li[3]/a/span/strong")
    WebElement FloatingLicenseoption;




    public StorePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    //Reusable Steps
    public void clickonChooseYourLicenseSelectField(){
        click(ChooseYourLicenseSelectField);
    }

    public void clickonNamedLicenseOption(){
        click(NamedLicenseOption);
    }

    public void clickonChooseYourPackageSelectField(){
        click(ChooseYourPackageSelectField);
    }

    public void clickonCollaboratorTeamOption(){
        click(CollaboratorTeamOption);
    }

    public void clickonConcurrentLicense(){
        click(ConcurrentLicense);
    }

    public void clickonCollaboratorEnterprise(){
        click(CollaboratorEnterprise);
    }

    public void clickonQaCompleteSelectfield(){
        click(QaCompleteSelectfield);
    }

    public void clickonQaCompletesaas(){
        click(QaCompletesaas);
    }

    public void clickonQaComplete(){
        click(QaCompleteoption);
    }

    public void clickonAPIChooseYourLicenseselectfield(){
        click(APIChooseYourLicenseselectfield);
    }

    public void clickonFixedLicenseoption(){
        click(FixedLicenseoption);
    }

    public void clickonAPIChooseyourpackagefield(){
        click(APIChooseyourpackageselectfield);
    }

    public void clickonPerformanceSmalloption(){
        click(PerformanceSmalloption);
    }

    public void clickonPerformanceMediumoption(){
        click(Performancemediumoption);
    }

    public void clickonPerformanceUnlimitedoption(){
        click(PerformanceUnlimitedoption);
    }

    public void clickonFloatingLicenseoption(){
        click(FloatingLicenseoption);
    }










}
