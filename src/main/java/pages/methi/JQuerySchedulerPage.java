package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQuerySchedulerPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount5;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[2]")
    WebElement UIForJquery4;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement exploreComponents3;

    @FindBy(xpath="//*[@id=\"ContentPlaceholder1_C1070_Col02\"]/a")
    WebElement scheduler;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    WebElement schedulerTable;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement schedulerOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement schedulerDataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement schedulerTimezone;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    WebElement schedulerAppointmentViews;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    WebElement schedulerAppointmentEdit;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    WebElement schedulerResources;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    WebElement schedulerHierarchical;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    WebElement schedulerVertical;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    WebElement schedulerICal;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    WebElement schedulerExport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    WebElement schedulerTemplates;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    WebElement schedulerSearchEvents;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[13]/a")
    WebElement schedulerWorkingDays;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[14]/a")
    WebElement schedulerRTL;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[15]/a")
    WebElement schedulerKeyboard;

    @FindBy(xpath = "//*[@id=\"all-components\"]")
    WebElement allJQueryComponents3;


    public JQuerySchedulerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void hoverOver5(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount5).build().perform();
    }

    public void kendoUiJQueryClick4(){click(UIForJquery4);}

    public void setExploreComponents3(){click(exploreComponents3);}

    public void schedulerClick(){click(scheduler);}

    public void hoverSchedulerTable(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(schedulerTable).build().perform();
    }

    public void schedulerOverviewClick(){click(schedulerOverview);}

    public void schedulerDataBindingClick(){click(schedulerDataBinding);}

    public void schedulerTimeZoneClick(){click(schedulerTimezone);}

    public void schedulerAppointmentViewsClick(){click(schedulerAppointmentViews);}

    public void schedulerAppointmentEditClick(){click(schedulerAppointmentEdit);}

    public void schedulerResourcesClick(){click(schedulerResources);}

    public void schedulerHierarchicalClick(){click(schedulerHierarchical);}

    public void schedulerVerticalClick(){click(schedulerVertical);}

    public void schedulerICalClick(){click(schedulerICal);}

    public void schedulerExportClick(){click(schedulerExport);}

    public void schedulerTemplatesClick(){click(schedulerTemplates);}

    public void schedulerSearchEventsClick(){click(schedulerSearchEvents);}

    public void schedulerWorkingDaysClick(){click(schedulerWorkingDays);}

    public void schedulerRTLClick(){click(schedulerRTL);}

    public void schedulerKeyboardClick(){click(schedulerKeyboard);}

    public void scrollToViewComponents4(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", allJQueryComponents3);
    }

}
