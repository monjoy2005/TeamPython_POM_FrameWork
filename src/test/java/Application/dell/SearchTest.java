package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.HomePage;
import pages.dell_Pages.SearchResultPage;

public class SearchTest extends CommonAPI {

    @Test
    public void searchLaptop(){
    HomePage homePage = new HomePage(getDriver());
    SearchResultPage searchResultPage = new SearchResultPage(getDriver());
    homePage.searchElement("Laptop");
    homePage.clickSearchBtn();
    String expectedLaptopPageUrl="https://www.dell.com/en-us/search/Laptop";
    Assert.assertEquals(expectedLaptopPageUrl,getPageUrl());
    }


    @Test
    public void searchAmdLaptop(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("AMD Laptop");                                 //  with reusable steps
        //type(homePage.searchField,"AMD Laptop");                            //  without reusable steps
        homePage.clickSearchBtn();
        searchResultPage.checkAmdLogoIsPresent();
    }

    @Test
    public void searchGamingPc(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("Gaming Pc");
        homePage.clickSearchBtn();
        String expectedGamingPcPageUrl="https://www.dell.com/en-us/search/Gaming%20Pc";
        Assert.assertEquals(expectedGamingPcPageUrl,getPageUrl());
    }
    @Test
    public void searchMonitor(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("Monitor");
        homePage.clickSearchBtn();
        searchResultPage.checkMonitorsTextIsPresent();
    }

    @Test
    public void searchKvmConsole(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("kvm console");
        homePage.clickSearchBtn();
        searchResultPage.checkKvmTextIsPresent();
    }

    @Test
    public void searchServer(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("Server");
        homePage.clickSearchBtn();
        String expectedMassage= searchResultPage.getServerPageInfo();
        Assert.assertEquals("server",expectedMassage);
    }

    @Test
    public void emptySearch(){
        HomePage homepage=new HomePage(getDriver());
        homepage.searchElement("");
        String expectedTitle = "Computers, Monitors & Technology Solutions | Dell USA";
        Assert.assertEquals(expectedTitle,getPageTitle());
    }

    @Test
    public void backPack(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("backpack");
        homePage.clickSearchBtn();
        searchResultPage.checkLessThan100();
        searchResultPage.checkLessThan100MassageIsPresent();
    }

}
