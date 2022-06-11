package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VueDatePickerPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[5]")
    WebElement UIForVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement componentsVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1074_Col02\"]/a")
    WebElement vueDatePicker;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    WebElement vueTable;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement vueOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement vueDefaultValue;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement vueFocusedDate;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    WebElement vueDisabledDatePicker;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    WebElement vueDateLimits;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    WebElement vueFormats;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    WebElement vuePlaceHolders;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    WebElement vueNumberColumn;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    WebElement vueRendering;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    WebElement vueFormsSupport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    WebElement vueGlobalization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    WebElement vueKeyboardNav;

    @FindBy(xpath = "//*[@id=\"all-components\"]")
    WebElement vueFeatures;

    public VueDatePickerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable Steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforVueClick(){click(UIForVue);}

    public void componentsVueClick(){click(componentsVue);}

    public void vueDatePickerClick(){click(vueDatePicker);}

    public void setVueTable(){isPresent(vueTable);}

    public void vueOverviewClick(){click(vueOverview);}

    public void vueDefaultValueClick(){click(vueDefaultValue);}

    public void vueFocusedDateClick(){click(vueFocusedDate);}

    public void vueDisabledDatePickersClick(){click(vueDisabledDatePicker);}

    public void vueDateLimitsClick(){click(vueDateLimits);}

    public void vueFormatsClick(){click(vueFormats);}

    public void vuePlaceHoldersClick(){click(vuePlaceHolders);}

    public void vueNumberColumnClick(){click(vueNumberColumn);}

    public void vueRenderingClick(){click(vueRendering);}

    public void vueFormsSupportClick(){click(vueFormsSupport);}

    public void vueGlobalizationClick(){click(vueGlobalization);}

    public void vueKeyboardNavClick(){click(vueKeyboardNav);}

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", vueFeatures);
    }
}
