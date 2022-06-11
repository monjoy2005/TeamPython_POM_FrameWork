package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KendoUIVuePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[5]")
    WebElement UIForVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[1]")
    WebElement overviewModernVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[2]")
    WebElement demoModernVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[3]")
    WebElement benefitsModernVue;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_T53129E6C012_Col00\"]/nav/a[4]")
    WebElement componentsModernVue;

    public KendoUIVuePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void kendoUIVueClick(){click(UIForVue);}

    public void setOverviewModernVue(){click(overviewModernVue);}

    public void setDemoModernVue(){click(demoModernVue);}

    public void setBenefitsModernVue(){click(benefitsModernVue);}

    public void setComponentsModernVue(){click(componentsModernVue);}
}
