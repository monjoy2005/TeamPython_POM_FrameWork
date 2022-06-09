package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.DellGamingPage;
import pages.dell_Pages.HomePage;

public class DropDownTest extends CommonAPI {
    @Test
    public void dellGaming(){
        HomePage homePage=new HomePage(getDriver());
        DellGamingPage dellGamingPage=new DellGamingPage(getDriver());
        hoverOver(getDriver(), homePage.hoverOverProducts);
        hoverOver(getDriver(), homePage.hoverOverProductsGaming);
        waitFor(2);
        click(homePage.hoverOverProductsGaming);
        //isPresent(dellGamingPage.dellGamingPageTitle);

    }

    //@Test
    public void alienwareLaptops(){
        HomePage homePage=new HomePage(getDriver());
        hoverOver(getDriver(), homePage.hoverOverAlienware);
        waitFor(2);
        click(homePage.hoverOverAlienwareLaptops);
        String expectedUrl = "https://www.dell.com/en-us/shop/dell-laptops/sf/alienware-laptops";
        Assert.assertEquals(expectedUrl,getPageUrl());

    }






}
