package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KendoUIAngularPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[3]")
    WebElement UIForAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[1]")
    WebElement overviewModernAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    WebElement demoModernAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[3]")
    WebElement benefitsModernAngular;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement componentsModernAngular;

    public KendoUIAngularPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void kendoUIAngularClick(){click(UIForAngular);}

    public void setOverviewModernAngular(){click(overviewModernAngular);}

    public void setDemoModernAngular(){click(demoModernAngular);}

    public void setBenefitsModernAngular(){click(benefitsModernAngular);}

    public void setComponentsModernAngular(){click(componentsModernAngular);}


}




























