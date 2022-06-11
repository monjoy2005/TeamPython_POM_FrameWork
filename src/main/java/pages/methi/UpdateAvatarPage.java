package pages.methi;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateAvatarPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div/div/profile-card/div/div[2]/div[2]/div[1]/a")
    WebElement editProfile;

    @FindBy(xpath = "//*[@id=\"ya-app-content\"]/ng-component/div/div/div[2]/div[1]/div/div/div[1]/button[1]")
    WebElement changeAvatar;

    @FindBy(xpath = "//*[@id=\"change-avatar-window\"]/change-avatar-form/div/form/div[2]/div/img[1]")
    WebElement selectAvatar;

    @FindBy(xpath = "//*[@id=\"change-avatar-window\"]/change-avatar-form/div/form/div[3]/button[1]")
    WebElement updateAvatar;

//    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[1]/div[2]/div")
//    WebElement updateSuccessful;

    public UpdateAvatarPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //reusable steps

    public void clickEditProfile(){click(editProfile);}

    public void clickChangeAvatar(){click(changeAvatar);}

    public void clickSelectAvatar(){click(selectAvatar);}

    public void clickUpdateAvatar(){click(updateAvatar);}

//    public void checkUpdateSuccessful(){isPresent(updateSuccessful);}


}
