package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VueDataGridPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[5]")
    WebElement UIForVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement componentsVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1074_Col00\"]/a")
    WebElement vueDataGrid;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    WebElement vueTable;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement vueOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement vueIntegrations;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement vueOperations;

    @FindBy(xpath = "//*[@id=\"all-components\"]")
    WebElement vueComponents;


    public VueDataGridPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforVueClick(){click(UIForVue);}

    public void componentsVueClick(){click(componentsVue);}

    public void vueDataGridClick(){click(vueDataGrid);}

    public void setVueTable(){isPresent(vueTable);}

    public void reactOverviewClick(){click(vueOverview);}

    public void vueIntegrationsClick(){click(vueIntegrations);}

    public void vueOperationsClick(){click(vueOperations);}

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", vueComponents);
    }

}
