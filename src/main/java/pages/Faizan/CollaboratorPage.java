package pages.Faizan;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CollaboratorPage extends CommonAPI {
    @FindBy(css = "#form > div.brand-wrap.brand-wrap-independent > section.band.band-hero.bg-transparent > div:nth-child(1) > div > div > div > div > div > p:nth-child(2) > a")
    WebElement ScheduleADemobtn;

    public CollaboratorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickONScheduleADemobtn(){
        click(ScheduleADemobtn);
    }
}
