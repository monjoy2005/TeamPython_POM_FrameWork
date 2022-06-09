package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    public WebElement KeyWordText;

    @FindBy(xpath = "//h1/span[@class='lighter']")
    public WebElement searchedItem;

    @FindBy(css = "span.heading-counter")
    public WebElement noOfFoundResult;

    @FindBy(css="div.product-container")
    public WebElement itemViewer;

   @FindBy(xpath ="(//ul/li[1]/a/img[@class='replace-2x img-responsive'])[1]")
   public WebElement topSellerItem;


   @FindBy(css="div#short_description_block div p")
   public WebElement itemDescription;

   @FindBy(xpath = "//li/a[@title='More about Fashion Manufacturer']")
   public WebElement fashionManu;

   @FindBy(xpath = "//div/h1[@class='page-heading product-listing']")
    public WebElement listOfProductFromFashionManu;

   @FindBy(xpath = "//li/a[@title='More about Fashion Supplier']")
   public WebElement fashionSupplier;

   @FindBy(xpath = "//div/h1[@class='page-heading product-listing']")
   public WebElement listOfProductFromFashionSupplier;

    @FindBy(xpath = "//div/div/div/ul/li/span[@class='grower CLOSE']")
    public WebElement Categories_Women_plus;

    @FindBy(xpath = "(//ul/li/span[@class='grower CLOSE'])[1]")
    public WebElement Categories_Women_Top_plus;
    @FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?id_category=5&controller=category'])[3]")
    public WebElement Categories_Women_Top_TShirt;

    @FindBy(xpath = "//h1/span[@class='cat-name']")
    public WebElement TShirts; //assertion

    @FindBy(xpath = "(//ul/li/span[@class='grower CLOSE'])[2]")
    public WebElement Categories_Women_Dresses_plus;

    @FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?id_category=11&controller=category'])[3]")
    public WebElement Categories_Women_Dresses_SummerDresses;

    @FindBy(xpath = "//h1/span[@class='cat-name']")
    public WebElement SummerDresses;  //assertion


    @FindBy(xpath = "//a[@title='Women']")
    public WebElement floatingMenu;

    @FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
    public WebElement floatingCasual;

    @FindBy(xpath = "//h1/span[@class='cat-name']")
    public WebElement casualAssertion;

    @FindBy(xpath = "(//a[@title='Evening Dresses'])[1]")
    public WebElement floatingEvening;

    @FindBy(xpath = "//h1/span[@class='cat-name']")
    public WebElement eveningAssertion;


    @FindBy(xpath = "(//a[@title='T-shirts'])[1]")
    public WebElement floatingTShirts;

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement floatingTShirtsAssertion;

    @FindBy(css = "h1[itemprop='name']")
    public WebElement fadedShortTShirtAssertion;





    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }


//    reusable steps

    public void extendWomen(){
        click(Categories_Women_plus);
    }

    public void hoverOverFloating(WebDriver driver){
        hoverOver(driver,floatingMenu);

    }



}
