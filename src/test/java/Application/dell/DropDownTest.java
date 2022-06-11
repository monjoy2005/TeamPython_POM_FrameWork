package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.DellGamingPage;
import pages.dell_Pages.HomePage;
import pages.dell_Pages.PerspectivesPage;

public class DropDownTest extends CommonAPI {
    @Test
    public void dellGaming(){
        HomePage homePage=new HomePage(getDriver());
        hoverOver(getDriver(), homePage.hoverOverProducts);
        hoverOver(getDriver(), homePage.hoverOverProductsGaming);
        //waitFor(2);
        click(homePage.hoverOverProductsGamingDellGaming);
        String expectedGamingPageTitle = "Gaming PCs and Accessories | Dell USA";
        Assert.assertEquals(getPageTitle(),expectedGamingPageTitle);

    }

    @Test
    public void workStations(){
        HomePage homePage=new HomePage(getDriver());
        hoverOver(getDriver(), homePage.hoverOverProducts);
        homePage.clickWorkStationsBtn();
        String expectedUrl = "https://www.dell.com/en-us/work/shop/scc/sc/workstations";
        Assert.assertEquals(expectedUrl,getPageUrl());

    }


    @Test
    public void perspectives(){
        HomePage homePage=new HomePage(getDriver());
        PerspectivesPage perspectivesPage=new PerspectivesPage(getDriver());
        homePage.hoverOverAboutUs(getDriver());                //only works if <aboutUs> is public webelement in HomePage
        //waitFor(2);
        click(homePage.perspectivesBtn);
        String expectedHeaderText = "Perspectives";
        Assert.assertEquals(expectedHeaderText,perspectivesPage.perspectivesHeaderText());
    }









}
