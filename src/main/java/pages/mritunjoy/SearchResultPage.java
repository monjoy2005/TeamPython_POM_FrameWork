package pages.mritunjoy;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {

    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@class='direct-content__img']")
    private WebElement amdLogo;

    @FindBy(xpath = "//span[@class='search-string']")
    private WebElement monitorsText;
    @FindBy(xpath = "//h2[@class='pageinfo']/span[3]")
    private WebElement kvmText;

    public String getSearchPageTitle(){
        return getPageTitle();
    }

    public String getSearchPageUrl(){
        return getPageUrl();
    }

    public boolean checkLogoIsPresent(){
        return isPresent(amdLogo);
    }
    public boolean checkMonitorsTextIsPresent(){
        return isPresent(monitorsText);
    }
    public boolean checkKvmTextIsPresent(){
        return isPresent(kvmText);
    }


}