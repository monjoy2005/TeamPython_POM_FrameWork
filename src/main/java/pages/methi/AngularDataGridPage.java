package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngularDataGridPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[3]")
    WebElement UIForAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement componentsModernAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1101_Col00\"]/a")
    WebElement angularDataGrid;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    WebElement angularHighlights;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[1]/a/h3")
    WebElement angularSuperCustomizable;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[2]/a/h3")
    WebElement angularFilterSort;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[3]/a/h3")
    WebElement angularCRUD;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[4]/a/h3")
    WebElement angularInteractions;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[5]/a/h3")
    WebElement angularVirtualization;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[6]/a/h3")
    WebElement angularExport;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1089_Col00\"]/div/div[2]/ul/li[7]/a/h3")
    WebElement angularAccessibility;

    @FindBy(xpath = "//*[@id=\"benefits\"]")
    WebElement angularFeatures;


    public AngularDataGridPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforAngularClick(){click(UIForAngular);}

    public void setExploreComponents(){click(componentsModernAngular);}

    public void angularDataGridClick(){click(angularDataGrid);}

    public void angularHighlights(){click(angularHighlights);}

    public void setAngularSuperCustomizable(){isPresent(angularSuperCustomizable);}

    public void setAngularFilterSort(){click(angularFilterSort);}

    public void setAngularCRUD(){click(angularCRUD);}

    public void setAngularInteractions(){click(angularInteractions);}

    public void setAngularVirtualization(){click(angularVirtualization);}

    public void setAngularExport(){click(angularExport);}

    public void setAngularAccessibility(){click(angularAccessibility);}

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", angularFeatures);
    }
}
