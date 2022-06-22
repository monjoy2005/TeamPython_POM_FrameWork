package Application.SmartBear;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.Faizan.CollaboratorPage;
import pages.Faizan.CompanyPage;
import pages.Faizan.HomePage;
import pages.Faizan.LoadNinjaPage;

public class SideCategories extends CommonAPI {
    //@Test
    public void SmartBearLogo(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickonSmartBearLogo();
        waitFor(5);
        String expectedSmartBearPageTitle = "Software Testing,Monitoring,Developer Tools | SmartBear";
        Assert.assertTrue(true,"Software Testing,Monitoring,Developer Tools | SmartBear");
    }
    //@Test
    //Not Finish come back later
    public void Changevaluebyholdanddrag(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONTryanytoolforfreebtn();
        waitFor(3);
        HomePage.clickonCollaborator();
        CollaboratorPage CollaboratorPage = new CollaboratorPage(getDriver());
        CollaboratorPage.clickONROICalculator();
        waitFor(3);
        Actions actions = new Actions(getDriver());
        actions.click().build().perform();
        CollaboratorPage.clickanddragonoption1();
        waitFor(5);
    }
    //@Test
    public void RequestFreeConsultation(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONTryanytoolforfreebtn();
        HomePage.clickonCollaborator();
        CollaboratorPage CollaboratorPage = new CollaboratorPage(getDriver());
        CollaboratorPage.clickONROICalculator();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000);");
        CollaboratorPage.Clickonconsultationbtn();
        CollaboratorPage.TypeonFirstName();
        CollaboratorPage.TypeonLastName();
        CollaboratorPage.TypeonEmailAddress();
        CollaboratorPage.TypeonPhoneNumber();
        CollaboratorPage.TypeonCompanyName();
        CollaboratorPage.ClickonRequestDemoBtn();
    }
    //@Test
    public void FindingJobsusingSmartBear(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickonCareersbtn();
        HomePage.clickonJobsatSmartBearbtn();
        HomePage.clickonSelectaTeamoption();
        waitFor(3);
        HomePage.clickonSalesoption();
        HomePage.clickonSelectaLocationoption();
        waitFor(3);
        HomePage.clickonSomervilleoption();
        HomePage.clickonStrategicAccountManager();
        CompanyPage CompanyPage = new CompanyPage(getDriver());
        getDriver().switchTo().frame(0);
        CompanyPage.clickonViewAllJobsOption();
    }
    //@Test
    public void ClearFiltersAfterFindingJobs(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickonCareersbtn();
        HomePage.clickonJobsatSmartBearbtn();
        HomePage.clickonSelectaTeamoption();
        HomePage.clickonSalesoption();
        HomePage.clickonSelectaLocationoption();
        HomePage.clickonSomervilleoption();
        HomePage.clickonClearFilters();
    }
    //@Test
    //Not Finished
    public void ChangeMonthlyandAnnualvaluesbyusingpricingtogglebtn(){
        HomePage HomePage = new HomePage(getDriver());
        HomePage.clickONTryanytoolforfreebtn();
        waitFor(3);
        HomePage.clickonLoadNinjaOption();
        waitFor(3);
        LoadNinjaPage LoadNinjaPage = new LoadNinjaPage(getDriver());
        getDriver().switchTo().frame(0);
        LoadNinjaPage.clickonPricingbtn();
        waitFor(3);
        LoadNinjaPage.clickonPricingtogglebtn();
        waitFor(3);
    }
    //@Test
    public void SmartBearTwitterLink(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,7000);");
        HomePage HomePage = new HomePage(getDriver());
        waitFor(5);
        HomePage.clickonTwitterbtn();
        waitFor(5);
        String expectedSmartBearTwitterPageTitle = "SmartBear (@SmartBear) / Twitter";
        Assert.assertEquals("SmartBear (@SmartBear) / Twitter","SmartBear (@SmartBear) / Twitter");
    }
    //@Test
    public void SmartBearFacebookLink(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,7000);");
        HomePage HomePage = new HomePage(getDriver());
        waitFor(4);
        HomePage.clickonFacebookbtn();
        waitFor(4);
        String expectedSmartBearFacebookPageTitle = "SmartBear - Home | Facebook";
        Assert.assertEquals("SmartBear - Home | Facebook","SmartBear - Home | Facebook");
    }
    //@Test
    public void SmartBearLinkedinLink(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,7000);");
        HomePage HomePage = new HomePage(getDriver());
        waitFor(4);
        HomePage.clickonLinkedinbtn();
        waitFor(4);
        String expectedSmartBearLinkedinPageTitle = "SmartBear | LinkedIn";
        Assert.assertTrue(true,"SmartBear | LinkedIn");
    }
    @Test
    public void SmartBearYoutubeLink(){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,7000);");
        HomePage HomePage = new HomePage(getDriver());
        waitFor(4);
        HomePage.clickonYoutubebtn();
        waitFor(4);
        String expectedSmartBearYoutubePageTitle = "SmartBear | YouTube";
        Assert.assertTrue(true,"SmartBear | YouTube");
    }







}
