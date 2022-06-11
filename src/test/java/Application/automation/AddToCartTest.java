package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.SearchResultPage;

public class AddToCartTest extends CommonAPI {
    @Test
    public void AddToCartFromHomePage(){

        HomePage homePage= new HomePage(getDriver());
        String expectedMessage="POPULAR";
        Assert.assertEquals(getElementText(homePage.popularAssertion),expectedMessage);
        homePage.hoverOverHomePageItem(getDriver());
        click(homePage.CartFromHomePage);

    }

    @Test
    public void AddToCartAfterViewingItem(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(getElementText(searchResultPage.modelAssertion),expectedMessage);
        searchResultPage.clickToCart();

    }

    @Test
    public void continueShopping(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(getElementText(searchResultPage.modelAssertion),expectedMessage);
        searchResultPage.clickToCart();
        click(searchResultPage.continueShopping);

    }
    @Test
    public void viewCart(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(getElementText(searchResultPage.modelAssertion),expectedMessage);
        searchResultPage.clickToCart();
        click(searchResultPage.shoppingCart);

    }











}
