package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.SearchResultPage;

public class WishlistTest extends CommonAPI {

    @Test
    public void addToWishlist(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Condition New";
        Assert.assertEquals(getElementText(searchResultPage.productConditionAssertion),expectedMessage);
        click(searchResultPage.wishlist);


    }

    @Test
    public void viewingWishlist(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnSignIn();
        loginPage.putEmail("khan23@gmail.com");
        loginPage.putPassword("abc123");
        loginPage.hitSignIn();
        homePage.clickOnUserName();
        click(searchResultPage.myWishlist);
        String expectedMessage="MY WISHLISTS";
        Assert.assertEquals(getElementText(searchResultPage.wishlistAssertion),expectedMessage);
    }

    @Test
    public void addToWishlistByNonAcHolder(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnHomePageItem();
        click(searchResultPage.wishlist);
    }





}
