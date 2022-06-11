package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KendoUIPage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[1]")
    WebElement KendoUI;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[1]")
    WebElement kendoUIOverview;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    WebElement kendoUIFeatures;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[3]")
    WebElement kendoUIComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1133_Col00\"]/div[1]/nav/a[1]")
    WebElement kendoUIForJQuery;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1133_Col00\"]/div[1]/nav/a[2]")
    WebElement kendoUIForAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1133_Col00\"]/div[1]/nav/a[3]")
    WebElement kendoForReact;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1133_Col00\"]/div[1]/nav/a[4]")
    WebElement kendoForVue;

    public KendoUIPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void kendoUiClick() {click(KendoUI);}

    public void overviewKendoClick(){click(kendoUIOverview); }

    public void featuresKendoClick(){click(kendoUIFeatures);}

    public void componentsKendoClick(){click(kendoUIComponents);}

    public void jqueryKendoUIClick(){click(kendoUIForJQuery);}

    public void angularKendoUIClick(){click(kendoUIForAngular);}

    public void reactKendoUIClick(){click(kendoForReact);}

    public void vueKendoUIClick(){click(kendoForVue);}

}




