package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientDataSourcePage extends CommonAPI {

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

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[1]/div/div[1]/div/a")
    WebElement clientDataSource;


    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement clientAPI_Events;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement clientIntegration;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement clientCRUD_Operations;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    WebElement clientDataPopulation;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[5]/a")
    WebElement clientWebServices;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[6]/a")
    WebElement clientDataOperations;


    public ClientDataSourcePage(WebDriver driver){
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

    public void clientDataSourceClick(){click(clientDataSource);}

    public void clientAPI_EventsClick(){click(clientAPI_Events);}

    public void clientIntegrationsClick(){click(clientIntegration);}

    public void clientCRUD_OperationsClick(){click(clientCRUD_Operations);}

    public void clientDataPopulationClick(){click(clientDataPopulation);}

    public void clientWebServicesClick(){click(clientWebServices);}

    public void clientDataOperationsClick(){click(clientDataOperations);}
}
