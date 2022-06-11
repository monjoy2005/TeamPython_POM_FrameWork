package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListBoxPage extends CommonAPI {

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

    @FindBy(xpath = "//*[@id=\"ContentPlaceholder1_C417_Col00\"]/div/div[1]/ul/li[1]/div/div[6]/div/a")
    WebElement listBox;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[1]/a")
    WebElement listingItems;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement dataBinding;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[3]/a")
    WebElement checkBoxes;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[4]/a")
    WebElement dragDrop;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement templates;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement loadDemand;

    @FindBy(xpath = "//*[@id=\"js-sidebar-menu\"]/li[2]/a")
    WebElement clientAPI;


    public ListBoxPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //Reusable Steps

    public void hoverOver(WebDriver driver) {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOverAccount).build().perform();
    }

    public void UIforAjaxClick(){click(UIForASP_Ajax);}

    public void listOfControlsClick(){click(listOfControls);}

    public void controlsPresent(){isPresent(controls);}

    public void dataManagementPresent(){isPresent(dataManagement);}

    public void listBoxClick(){click(listBox);}

    public void listingItemsClick(){click(listingItems);}

    public void dataBindingClick(){click(dataBinding);}

    public void checkBoxesClick(){click(checkBoxes);}

    public void dragDropClick(){click(dragDrop);}

    public void templatesClick(){click(templates);}

    public void loadDemandClick(){click(loadDemand);}

    public void clientAPIClick(){click(clientAPI);}
}
