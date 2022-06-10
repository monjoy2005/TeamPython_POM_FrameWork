package Application.apple;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.mritunjoy.HomePage;

public class Page extends CommonAPI {

    @Test
    public void macPage(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickMacBtn();
        String expectedPageTitle = "Mac - Apple";
        Assert.assertEquals(expectedPageTitle,homePage.getLandedPageTitle());
    }
}
