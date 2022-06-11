package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngularChartsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[3]")
    WebElement UIForAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement componentsModernAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1101_Col01\"]/a")
    WebElement angularCharts;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    WebElement angularHighlights;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1121_Col00\"]/div/div[2]/ul/li[1]/a/h3")
    WebElement angularSuperCustomizable;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1121_Col00\"]/div/div[2]/ul/li[2]/a/h3")
    WebElement angularPopularCharts;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1121_Col00\"]/div/div[2]/ul/li[3]/a/h3")
    WebElement angularEasyAPI;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1121_Col00\"]/div/div[2]/ul/li[4]/a/h3")
    WebElement angularPanZoom;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1121_Col00\"]/div/div[2]/ul/li[5]/a/h3")
    WebElement angularSVGRendering;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C1121_Col00\"]/div/div[2]/ul/li[6]/a/h3")
    WebElement angularEasyExport;

    @FindBy(xpath = "//*[@id=\"benefits\"]")
    WebElement angularFeatures;


    public AngularChartsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforAngularClick(){click(UIForAngular);}

    public void setExploreComponents(){click(componentsModernAngular);}

    public void angularDataGridClick(){click(angularCharts);}

    public void angularHighlights(){click(angularHighlights);}

    public void setAngularSuperCustomizable(){isPresent(angularSuperCustomizable);}

    public void setAngularPopularCharts(){click(angularPopularCharts);}

    public void setAngularEasyAPI(){click(angularEasyAPI);}

    public void setAngularPanZoom(){click(angularPanZoom);}

    public void setAngularSVGRendering(){click(angularSVGRendering);}

    public void setAngularEasyExport(){click(angularEasyExport);}

    public void scrollToViewComponents(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", angularFeatures);
    }







}
