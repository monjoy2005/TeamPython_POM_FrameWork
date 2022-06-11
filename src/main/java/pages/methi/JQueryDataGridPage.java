package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JQueryDataGridPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount3;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[2]")
    WebElement UIForJquery2;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement exploreComponents;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1070_Col00\"]/a")
    WebElement dataGrid;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C061_Col01\"]/div[3]/h4/a")
    WebElement dataGridTable;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement dataGridOverview;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement dataGridRendering;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement dataGridInteractions;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    WebElement dataGridHierarchical;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    WebElement dataGridFrozen;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    WebElement dataGridFilter;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    WebElement dataGridEditing;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    WebElement dataGridDataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    WebElement dataGridVirtualization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[10]/a")
    WebElement dataGridExcel;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[11]/a")
    WebElement dataGridTemplates;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[12]/a")
    WebElement dataGridGlobalization;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[13]/a")
    WebElement dataGridKeyboard;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[14]/a")
    WebElement dataGridAccessibility;

    @FindBy(xpath = "//*[@id=\"all-components\"]")
    WebElement allJQueryComponents;

    public JQueryDataGridPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable elements

    public void hoverOver3(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount3).build().perform();
    }

    public void kendoUiJQueryClick2(){click(UIForJquery2);}

    public void setExploreComponents(){click(exploreComponents);}

    public void dataGridClick(){click(dataGrid);}

    public void hoverGridTable(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(dataGridTable).build().perform();
    }

    public void overviewGridClick(){click(dataGridOverview);}

    public void renderingGridClick(){click(dataGridRendering);}

    public void interactionsGridClick(){click(dataGridInteractions);}

    public void hierarchicalGridClick(){click(dataGridHierarchical);}

    public void frozenGridClick(){click(dataGridFrozen);}

    public void filterGridClick(){click(dataGridFilter);}

    public void editingGridClick(){click(dataGridEditing);}

    public void bindingGridClick(){click(dataGridDataBinding);}

    public void virtualizationGridClick(){click(dataGridVirtualization);}

    public void excelGridClick(){click(dataGridExcel);}

    public void templatesGridClick(){click(dataGridTemplates);}

    public void globalizationGridClick(){click(dataGridGlobalization);}

    public void keyboardGridClick(){click(dataGridKeyboard);}

    public void accessibilityGridClick(){click(dataGridAccessibility);}

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", allJQueryComponents);
    }

}
