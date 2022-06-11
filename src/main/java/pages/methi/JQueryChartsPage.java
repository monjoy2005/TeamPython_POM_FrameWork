package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryChartsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount4;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[2]")
    WebElement UIForJquery3;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement exploreComponents2;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1070_Col01\"]/a")
    WebElement charts;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    WebElement chartsTable;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement chartsOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement chartsChartType;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement chartsAxes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    WebElement chartsMultipleAxes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    WebElement chartsErrorBars;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    WebElement chartsPanningZooming;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    WebElement chartsDataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    WebElement chartsCanvasRendering;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    WebElement chartsNotes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    WebElement chartsPanes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    WebElement chartsTooltips;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    WebElement chartsExport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[13]/a")
    WebElement chartsAppearance;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[14]/a")
    WebElement chartsAnimation;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[15]/a")
    WebElement chartsPlotBands;

    @FindBy(xpath = "//*[@id=\"all-components\"]")
    WebElement allJQueryComponents2;

    public JQueryChartsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOver4(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount4).build().perform();
    }

    public void kendoUiJQueryClick3(){click(UIForJquery3);}

    public void setExploreComponents2(){click(exploreComponents2);}

    public void chartsClick(){click(charts);}

    public void hoverChartsTable(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(chartsTable).build().perform();
    }

    public void chartsOverviewClick(){click(chartsOverview);}

    public void chartsTypeClick(){click(chartsChartType);}

    public void chartsAxesClick(){click(chartsAxes);}

    public void multipleChartsAxesClick(){click(chartsMultipleAxes);}

    public void errorBarsClick(){click(chartsErrorBars);}

    public void panningZoomingClick(){click(chartsPanningZooming);}

    public void chartsDataBindingClick(){click(chartsDataBinding);}

    public void chartsRenderingClick(){click(chartsCanvasRendering);}

    public void chartsNotesClick(){click(chartsNotes);}

    public void chartsPanesClick(){click(chartsPanes);}

    public void chartsToolTipsClick(){click(chartsTooltips);}

    public void chartsExportClick(){click(chartsExport);}

    public void chartsAppearanceClick(){click(chartsAppearance);}

    public void chartsAnimationClick(){click(chartsAnimation);}

    public void chartsPlotBandsClick(){click(chartsPlotBands);}

    public void scrollToViewComponents3(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", allJQueryComponents2);
    }
}
