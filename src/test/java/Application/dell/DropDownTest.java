package Application.dell;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.mritunjoy.DellGamingPage;
import pages.mritunjoy.HomePage;

public class DropDownTest extends CommonAPI {
    @Test
    public void dellGaming(){
        HomePage homePage=new HomePage(getDriver());
        DellGamingPage dellGamingPage=new DellGamingPage(getDriver());
        hoverOver(getDriver(), homePage.hoverOverProducts);
        hoverOver(getDriver(), homePage.hoverOverProductsGaming);
        click(homePage.hoverOverProductsGaming);
        //isPresent(dellGamingPage.dellGamingPageTitle);

    }






}
