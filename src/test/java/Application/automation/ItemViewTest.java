package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.SearchResultPage;

public class ItemViewTest extends CommonAPI {
@Test
 public void itemDetails(){
  HomePage homePage= new HomePage(getDriver());
  LoginPage loginPage= new LoginPage(getDriver());
  SearchResultPage searchResultPage= new SearchResultPage(getDriver());
  homePage.clickOnSignIn();
  loginPage.putEmail("khan23@gmail.com");
  loginPage.putPassword("abc123");
  loginPage.hitSignIn();
  homePage.searchElement("Blouses");
  homePage.clickOnSearchBtn();
  click(searchResultPage.itemViewer);

 }

 @Test
 public void itemDetailsFromTopSeller(){
  HomePage homePage= new HomePage(getDriver());
  LoginPage loginPage= new LoginPage(getDriver());
  SearchResultPage searchResultPage= new SearchResultPage(getDriver());
  homePage.clickOnSignIn();
  loginPage.putEmail("khan23@gmail.com");
  loginPage.putPassword("abc123");
  loginPage.hitSignIn();
  homePage.searchElement("Blouses");
  homePage.clickOnSearchBtn();
  click(searchResultPage.topSellerItem);
  String expected = "Printed chiffon knee length dress with tank straps. Deep v-neckline.";
  Assert.assertEquals(getElementText(searchResultPage.itemDescription),expected);

 }

 @Test
 public void itemsViewingFromFashionManu(){
  HomePage homePage= new HomePage(getDriver());
  SearchResultPage searchResultPage= new SearchResultPage(getDriver());
  homePage.searchElement("Blouses");
  homePage.clickOnSearchBtn();
  click(searchResultPage.fashionManu);
  String expectedMessage="LIST OF PRODUCTS BY MANUFACTURER FASHION MANUFACTURER";
  Assert.assertEquals(getElementText(searchResultPage.listOfProductFromFashionManu),expectedMessage);

 }

 @Test
 public void itemsViewingFromFashionSupplier(){
  HomePage homePage= new HomePage(getDriver());
  SearchResultPage searchResultPage= new SearchResultPage(getDriver());
  homePage.searchElement("Blouses");
  homePage.clickOnSearchBtn();
  click(searchResultPage.fashionSupplier);
  String expectedMessage="LIST OF PRODUCTS BY SUPPLIER: FASHION SUPPLIER";
  Assert.assertEquals(getElementText(searchResultPage.listOfProductFromFashionSupplier),expectedMessage);


 }

@Test
 public void itemsViewingByExtendingTopsSubCategory(){
 HomePage homePage= new HomePage(getDriver());
 SearchResultPage searchResultPage= new SearchResultPage(getDriver());
 homePage.searchElement("Blouses");
 homePage.clickOnSearchBtn();
 searchResultPage.extendWomen();
 click(searchResultPage.Categories_Women_Top_plus);
 click(searchResultPage.Categories_Women_Top_TShirt);
 String expectedMessage="T-SHIRTS ";
 Assert.assertEquals(getElementText(searchResultPage.TShirts),expectedMessage);

}

@Test
 public void itemsViewingByExtendingDressesSubCategory(){
 HomePage homePage= new HomePage(getDriver());
 SearchResultPage searchResultPage= new SearchResultPage(getDriver());
 homePage.searchElement("Blouses");
 homePage.clickOnSearchBtn();
 searchResultPage.extendWomen();
 click(searchResultPage.Categories_Women_Dresses_plus);
 click(searchResultPage.Categories_Women_Dresses_SummerDresses);
 String expectedMessage="SUMMER DRESSES ";
 Assert.assertEquals(getElementText(searchResultPage.SummerDresses),expectedMessage);

}
@Test
public void casualViewingByHoverOver(){
 HomePage homePage= new HomePage(getDriver());
 SearchResultPage searchResultPage= new SearchResultPage(getDriver());
 homePage.searchElement("Blouses");
 homePage.clickOnSearchBtn();
 searchResultPage.hoverOverFloating(getDriver());
 click(searchResultPage.floatingCasual);
 String expectedMessage = "CASUAL DRESSES ";
 Assert.assertEquals(getElementText(searchResultPage.casualAssertion),expectedMessage);

}
@Test
public void eveningViewingByHoverOver(){
 HomePage homePage= new HomePage(getDriver());
 SearchResultPage searchResultPage= new SearchResultPage(getDriver());
 homePage.searchElement("Blouses");
 homePage.clickOnSearchBtn();
 searchResultPage.hoverOverFloating(getDriver());
 click(searchResultPage.floatingEvening);
 String expectedMessage="EVENING DRESSES ";
 Assert.assertEquals(getElementText(searchResultPage.eveningAssertion),expectedMessage);
}

@Test
public void TShirtsViewingByHoverOver(){
 HomePage homePage= new HomePage(getDriver());
 SearchResultPage searchResultPage= new SearchResultPage(getDriver());
 homePage.searchElement("Blouses");
 homePage.clickOnSearchBtn();
 searchResultPage.hoverOverFloating(getDriver());
 click(searchResultPage.floatingTShirts);
 String expectedMessage="There is 1 product.";
 Assert.assertEquals(getElementText(searchResultPage.floatingTShirtsAssertion),expectedMessage);
}
@Test
 public void itemViewingFromHomePage(){
 HomePage homePage= new HomePage(getDriver());
 SearchResultPage searchResultPage= new SearchResultPage(getDriver());
 homePage.clickOnHomePageItem();
 String expectedMessage="Faded Short Sleeve T-shirts";
 Assert.assertEquals(getElementText(searchResultPage.fadedShortTShirtAssertion),expectedMessage);
}

}
