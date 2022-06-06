package Application.apple;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultPage;

public class SearchBar extends CommonAPI {

    @Test
    public void searchJavaBook(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        homePage.searchElement("java book");
        homePage.clickSearchBtn();
        String expectedJavaPageTitle = "Amazon.com : java book";
        Assert.assertEquals(expectedJavaPageTitle, searchResultPage.getSearchPageTitle());
    }

    @Test
    public void StorePage(){
        click("//li[@class='ac-gn-item ac-gn-item-menu ac-gn-store']");
        String expectedMassage = "The best way to buy the products you love.";
        Assert.assertEquals(expectedMassage,getElementText("//div[text()='The best way to buy the products you love.']"));
    }
}
