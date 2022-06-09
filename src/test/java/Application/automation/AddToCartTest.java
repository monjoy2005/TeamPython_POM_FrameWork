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
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        String expectedMessage="POPULAR";
        Assert.assertEquals(getElementText(homePage.popularAssertion),expectedMessage);
        homePage.hoverOverHomePageItem(getDriver());
        click(homePage.CartFromHomePage);



    }





}
