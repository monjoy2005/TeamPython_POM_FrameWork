package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends CommonAPI {

    public SearchResultPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public String getSearchPageTitle(){
        return getPageTitle();
    }

//    public String getSearchPageUrl(){
//        return getSearchPageUrl();
//    }
}