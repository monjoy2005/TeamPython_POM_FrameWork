package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataFormPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav\"]/section/div/ul/li/button/i")
    WebElement hoverOverAccount;

    @FindBy(xpath = "//*[@id=\"js-tlrk-nav-dash\"]/div/div/div[2]/div[1]/div[1]/div[1]/a[6]")
    WebElement UIForASP_Ajax;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C446_Col00\"]/div/div/div[1]/div[1]/a[2]")
    WebElement listOfControls;

    @FindBy(xpath = "//*[@id=\"Controls\"]")
    WebElement controls;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[2]/ul/li[1]/a")
    WebElement dataManagement;

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[1]/div/div[3]/div/a")
    WebElement dataForm;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement presentData;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement Insert_Update_DeleteOperations;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement serverSideDataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    WebElement builtInValidation;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    WebElement scalableAndFluidBehavior;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    WebElement lightweightRendering;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[7]/a")
    WebElement studioIntegrationDesignSupport;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[8]/a")
    WebElement builtInSkins;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[9]/a")
    WebElement crossBrowserSupport;

    public DataFormPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforAjaxClick(){click(UIForASP_Ajax);}

    public void listOfControlsClick(){click(listOfControls);}

    public void controlsPresent(){isPresent(controls);}

    public void dataManagementPresent(){isPresent(dataManagement);}

    public void dataFormClick(){click(dataForm);}

    public void presentDataClick(){click(presentData);}

    public void insert_Update_DeleteOperationsClick(){click(Insert_Update_DeleteOperations);}

    public void serverSideDataBindingClick(){click(serverSideDataBinding);}

    public void builtInValidationClick(){click(builtInValidation);}

    public void scalableAndFluidBehaviorClick(){click(scalableAndFluidBehavior);}

    public void lightweightRenderingClick(){click(lightweightRendering);}

    public void studioIntegrationDesignSupportClick(){click(studioIntegrationDesignSupport);}

    public void builtInSkinsClick(){click(builtInSkins);}

    public void crossBrowserSupportClick(){click(crossBrowserSupport);}


}
