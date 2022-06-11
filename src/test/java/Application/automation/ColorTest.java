package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.CustomizingItemPage;
import pages.foyez.HomePage;
import pages.foyez.SearchResultPage;

public class ColorTest extends CommonAPI {

    @Test
    public void colorSelection(){
        HomePage homePage= new HomePage(getDriver());
        CustomizingItemPage customizingItemPage=new CustomizingItemPage(getDriver());
        homePage.clickOnHomePageItem();
        click(customizingItemPage.color);
        String expected="Color ";
        Assert.assertEquals(getElementText(customizingItemPage.colorAssertion),expected);
    }

}
