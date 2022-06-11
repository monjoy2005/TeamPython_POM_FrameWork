package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KendoUIJQueryPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[2]")
    WebElement UIForJquery;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[1]")
    WebElement overviewModernJQuery;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    WebElement demoModernJQuery;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[3]")
    WebElement benefitsModernJQuery;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement componentsModernJQuery;

    public KendoUIJQueryPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void hoverOver2(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void kendoUiJQueryClick(){click(UIForJquery);}

    public void setOverviewModernJQuery(){click(overviewModernJQuery);}

    public void setDemoModernJQuery(){click(demoModernJQuery);}

    public void setBenefitsModernJQuery(){click(benefitsModernJQuery);}

    public void setComponentsModernJQuery(){click(componentsModernJQuery);}


}
