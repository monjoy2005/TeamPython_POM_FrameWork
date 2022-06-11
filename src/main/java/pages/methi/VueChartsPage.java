package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VueChartsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[5]")
    WebElement UIForVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement componentsVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1074_Col01\"]/a")
    WebElement vueCharts;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    WebElement vueTable;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement vueOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement vueDataBonding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement vueChartType;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    WebElement vueChartElements;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    WebElement vueChartSeriesPlot;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    WebElement vueChartPanningZooming;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    WebElement vueChartAnimations;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    WebElement vueChartRendering;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    WebElement vueChartDesignSupport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    WebElement vueChartGlobalization;

    @FindBy(xpath = "//*[@id=\"all-components\"]")
    WebElement vueFeatures;

    public VueChartsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable Steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforVueClick(){click(UIForVue);}

    public void componentsVueClick(){click(componentsVue);}

    public void vueChartsClick(){click(vueCharts);}

    public void setVueTable(){isPresent(vueTable);}

    public void vueOverviewClick(){click(vueOverview);}

    public void vueDataBondingClick(){click(vueDataBonding);}

    public void vueChartTypeClick(){click(vueChartType);}

    public void vueChartElementsClick(){click(vueChartElements);}

    public void vueChartSeriesClick(){click(vueChartSeriesPlot);}

    public void vueChartPanningClick(){click(vueChartPanningZooming);}

    public void vueChartAnimationsClick(){click(vueChartAnimations);}

    public void vueChartRenderingClick(){click(vueChartRendering);}

    public void vueChartDesignClick(){click(vueChartDesignSupport);}

    public void vueChartGlobalizationClick(){click(vueChartGlobalization);}

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", vueFeatures);
    }

}
