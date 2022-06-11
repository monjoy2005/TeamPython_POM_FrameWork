package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReactSchedulerPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[4]")
    WebElement UIForReact;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div[5]/a")
    WebElement componentsReact;

    @FindBy(xpath = "//*[@id=\"explore-all-components-section\"]/div/div[2]/div/div/div[2]/a")
    WebElement reactScheduler;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/a[2]")
    WebElement reactSchedulerTable;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[1]/a")
    WebElement reactSchedulerOverview;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[2]/a")
    WebElement reactSchedulerDayView;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[3]/a")
    WebElement reactSchedulerWorkWeek;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[4]/a")
    WebElement reactSchedulerMonthView;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[5]/a")
    WebElement reactSchedulerTimeLine;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[6]/a")
    WebElement reactSchedulerAgendaView;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[7]/a")
    WebElement reactSchedulerMultipleEvent;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[8]/a")
    WebElement reactSchedulerDataBinding;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[9]/a")
    WebElement reactSchedulerEvents;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[10]/a")
    WebElement reactSchedulerRecurrence;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[11]/a")
    WebElement reactSchedulerResources;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[12]/a")
    WebElement reactSchedulerTasks;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[13]/a")
    WebElement reactSchedulerSlots;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[14]/a")
    WebElement reactSchedulerEditing;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[15]/a")
    WebElement reactSchedulerEditorForm;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[16]/a")
    WebElement reactSchedulerGrouping;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[17]/a")
    WebElement reactSchedulerTimeZones;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[18]/a")
    WebElement reactSchedulerRendering;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[19]/a")
    WebElement reactSchedulerSlotHeight;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[20]/a")
    WebElement reactSchedulerItemHeight;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[21]/a")
    WebElement reactSchedulerTimeMarker;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[22]/a")
    WebElement reactSchedulerGlobalization;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[23]/a")
    WebElement reactSchedulerKeyboardNav;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[4]/div/div/div[2]/div/div[3]/ul/li[24]/a")
    WebElement reactSchedulerAccessibility;

    @FindBy(xpath = "//*[@id=\"all-components\"]/div/h2")
    WebElement allReactComponents;

    public ReactSchedulerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void setUIForReact(){click(UIForReact);}

    public void setExploreComponents(){click(componentsReact);}

    public void setScheduler(){click(reactScheduler);}

    public void hoverSchedulerTable(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(reactSchedulerTable).build().perform();
    }

    public void schedulerOverviewClick(){click(reactSchedulerOverview);}

    public void setSchedulerDayViewClick(){click(reactSchedulerDayView);}

    public void setReactSchedulerWorkWeek(){click(reactSchedulerWorkWeek);}

    public void setReactSchedulerMonthView(){click(reactSchedulerMonthView);}

    public void setReactSchedulerTimeLine(){click(reactSchedulerTimeLine);}

    public void setReactSchedulerAgendaView(){click(reactSchedulerAgendaView);}

    public void setReactSchedulerMultipleEvent(){click(reactSchedulerMultipleEvent);}

    public void setReactSchedulerDataBinding(){click(reactSchedulerDataBinding);}

    public void setReactSchedulerEvents(){click(reactSchedulerEvents);}

    public void setReactSchedulerRecurrence(){click(reactSchedulerRecurrence);}

    public void setReactSchedulerResources(){click(reactSchedulerResources);}

    public void setReactSchedulerTasks(){click(reactSchedulerTasks);}

    public void setReactSchedulerSlots(){click(reactSchedulerSlots);}

    public void setReactSchedulerEditing(){click(reactSchedulerEditing);}

    public void setReactSchedulerEditorForm(){click(reactSchedulerEditorForm);}

    public void setReactSchedulerGrouping(){click(reactSchedulerGrouping);}

    public void setReactSchedulerTimeZones(){click(reactSchedulerTimeZones);}

    public void setReactSchedulerRendering(){click(reactSchedulerRendering);}

    public void setReactSchedulerSlotHeight(){click(reactSchedulerSlotHeight);}

    public void setReactSchedulerItemHeight(){click(reactSchedulerItemHeight);}

    public void setReactSchedulerTimeMarker(){click(reactSchedulerTimeMarker);}

    public void setReactSchedulerGlobalization(){click(reactSchedulerGlobalization);}

    public void setReactSchedulerKeyboardNav(){click(reactSchedulerKeyboardNav);}

    public void setReactSchedulerAccessibility(){click(reactSchedulerAccessibility);}

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", allReactComponents);
    }
}
