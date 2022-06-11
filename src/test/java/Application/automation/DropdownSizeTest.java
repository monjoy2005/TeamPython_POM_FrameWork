package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.CustomizingItemPage;
import pages.foyez.HomePage;

public class DropdownSizeTest extends CommonAPI {
        @Test
        public void selectRegardingSize(){
        HomePage homePage= new HomePage(getDriver());
        CustomizingItemPage customizingItemPage=new CustomizingItemPage(getDriver());
        homePage.clickOnHomePageItem();
        selectFromDropdown(customizingItemPage.size,"M");
        String expectedMessage="Size ";
        Assert.assertEquals(getElementText(customizingItemPage.sizeLabelAssertion),expectedMessage);
    }


}
