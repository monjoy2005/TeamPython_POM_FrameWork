package Application.apple;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.mritunjoy.HomePage;
import pages.methi.mritunjoy.SearchResultPage;

public class SearchBarTest extends CommonAPI {

    @Test
    public void searchAirPods(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickSearchBtnBeforeSearch();
        homePage.searchElement("AirPods");
        homePage.clickSearchBtn();
        String expectedPageUrl = "https://www.apple.com/airpods/";
        //Assert.assertEquals(expectedPageUrl, searchResultPage.getSearchPageUrl());
    }

    @Test
    public void searchGiftCards(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickSearchBtnBeforeSearch();
        homePage.searchElement("Gift Cards");
        homePage.clickSearchBtn();
        String expectedPageUrl = "https://www.apple.com/shop/gift-cards";
        Assert.assertEquals(expectedPageUrl, searchResultPage.getSearchPageUrl());
    }

    @Test
    public void searchAirTag(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.clickSearchBtnBeforeSearch();
        homePage.searchElement("AirTag");
        homePage.clickSearchBtn();
        String expectedPageTitle = "AirTag - Apple";
        //Assert.assertEquals(expectedPageTitle, searchResultPage.getSearchPageTitle());
    }

//    //@Test
//    public void StorePage(){
//        click("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-store']");
//        String expectedMassage = "The best way to buy the products you love.";
//        Assert.assertEquals(expectedMassage,getElementText("//div[text()='The best way to buy the products you love.']"));
//    }
}
