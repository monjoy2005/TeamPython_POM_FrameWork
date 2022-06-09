package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.SearchResultPage;

public class SearchBoxTest extends CommonAPI {

    @Test(enabled = false)
    public void search(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnSignIn();
        loginPage.putEmail("khan23@gmail.com");
        loginPage.putPassword("abc123");
        loginPage.hitSignIn();
        homePage.searchElement("Blouses");
        homePage.clickOnSearchBtn();
        String expected="\"BLOUSES\"";
        Assert.assertEquals(getElementText(searchResultPage.searchedItem),expected);


    }
    @Test(enabled = false)
    public void searchWithKeyBoardBtn(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnSignIn();
        loginPage.putEmail("khan23@gmail.com");
        loginPage.putPassword("abc123");
        loginPage.hitSignIn();
        homePage.typeAndHit("Blouses");
        String expected= "1 result has been found.";
        Assert.assertEquals(getElementText(searchResultPage.noOfFoundResult),expected);
    }

    @Test(enabled = false)
    public void searchWithoutSearchKeyword(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnSignIn();
        loginPage.putEmail("khan23@gmail.com");
        loginPage.putPassword("abc123");
        loginPage.hitSignIn();
        homePage.clickOnSearchBtn();
        String expectedMessage="Please enter a search keyword";
        Assert.assertEquals(getElementText(searchResultPage.KeyWordText),expectedMessage);

    }
    @Test
    public void searchByNonAcHolder(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.searchElement("Blouses");
        homePage.clickOnSearchBtn();
        String expected="\"BLOUSES\"";
        Assert.assertEquals(getElementText(searchResultPage.searchedItem),expected);
    }

    @Test
    public void searchWithKeyBoardBtnByNonAcHOlder(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.typeAndHit("Blouses");
        String expected= "1 result has been found.";
        Assert.assertEquals(getElementText(searchResultPage.noOfFoundResult),expected);
    }

    @Test
    public void searchWithoutSearchKeywordByNonAcHolder(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnSearchBtn();
        String expectedMessage="Please enter a search keyword";
        Assert.assertEquals(getElementText(searchResultPage.KeyWordText),expectedMessage);


    }

    


}
