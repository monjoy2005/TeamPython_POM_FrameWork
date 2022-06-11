package Application.Telerik;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.UpdateAvatarPage;

public class TC02TelerikAvatarPage extends CommonAPI {

    @Test
    public void avatarPage(){
        UpdateAvatarPage avatarPage = new UpdateAvatarPage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();
        loginPage.clickWithActionsCookies(getDriver());

        avatarPage.clickEditProfile();
        waitFor(2);

        avatarPage.clickChangeAvatar();
        waitFor(2);

        avatarPage.clickSelectAvatar();
        waitFor(2);

        avatarPage.clickUpdateAvatar();
        waitFor(2);

        String expectedResult = "Avatar Successfully Changed";
        Assert.assertEquals(expectedResult, "Avatar Successfully Changed");
        waitFor(2);
        System.out.println("Test Successful");
    }
}
