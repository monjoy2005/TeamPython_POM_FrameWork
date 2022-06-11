package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReactDataGridPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[4]")
    WebElement UIForReact;

    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div[3]/div[5]/a")
    WebElement componentsReact;

    @FindBy(xpath = "//*[@id=\"explore-all-components-section\"]/div/div[2]/div/div/div[1]/a")
    WebElement reactDataGrid;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    WebElement reactHighlights;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[1]/a/h3")
    WebElement reactFilterSort;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[2]/a/h3")
    WebElement reactExport;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[3]/a/h3")
    WebElement reactCellSelection;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[4]/a/h3")
    WebElement reactCustomEditing;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[5]/a/h3")
    WebElement reactInteractions;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[6]/a/h3")
    WebElement reactVirtualization;

    @FindBy(xpath = "//*[@id=\"benefits\"]")
    WebElement reactFeatures;


    public ReactDataGridPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforReactClick(){click(UIForReact);}

    public void componentsReactClick(){click(componentsReact);}

    public void reactDataGridClick(){click(reactDataGrid);}

    public void reactHighlightsClick(){click(reactHighlights);}

    public void reactFilterSortLink(){isPresent(reactFilterSort);}

    public void reactExportClick(){click(reactExport);}

    public void reactCellSelectionClick(){click(reactCellSelection);}

    public void reactCustomEditingClick(){click(reactCustomEditing);}

    public void reactInteractionsClick(){click(reactInteractions);}

    public void reactVirtualizationClick(){click(reactVirtualization);}

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", reactFeatures);
    }
}
