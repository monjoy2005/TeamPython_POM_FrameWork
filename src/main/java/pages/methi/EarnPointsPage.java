package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EarnPointsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div/div/profile-card/div/div[2]/div[2]/div[4]/a")
    WebElement Points;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[2]")
    WebElement Question1;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[3]")
    WebElement Question2;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[4]")
    WebElement Question3;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[5]")
    WebElement Question4;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[6]")
    WebElement Question5;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[7]")
    WebElement Question6;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[8]")
    WebElement Question7;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[9]")
    WebElement Question8;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[10]")
    WebElement Question9;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[11]")
    WebElement Question10;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/div[2]/div[1]/side-menu/div/div/div[12]")
    WebElement Question11;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div[2]/table/thead/tr/th[2]")
    WebElement scrolledToDate;

    public EarnPointsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void pointPageClicked(){click(Points);}

    public void question1Displayed(){isPresent(Question1);}

    public void question2clicked(){click(Question2);}

    public void question3clicked(){click(Question3);}

    public void question4clicked(){click(Question4);}

    public void question5clicked(){click(Question5);}

    public void question6clicked(){click(Question6);}

    public void question7clicked(){click(Question7);}

    public void question8clicked(){click(Question8);}

    public void question9clicked(){click(Question9);}

    public void scrollToViewQuestions(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrolledToDate);
    }

    public void question10clicked(){click(Question10);}

    public void question11clicked(){click(Question11);}


}
