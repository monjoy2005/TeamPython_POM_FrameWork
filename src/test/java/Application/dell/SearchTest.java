package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mritunjoy.HomePage;
import pages.mritunjoy.SearchResultPage;

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
        homePage.searchElement("AMD Laptop");
        homePage.clickSearchBtn();
        searchResultPage.checkLogoIsPresent();
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
        String expectedMassage="server";
        Assert.assertEquals(expectedMassage,getElementText(searchResultPage.getServerPageInfo()));
    }


}
