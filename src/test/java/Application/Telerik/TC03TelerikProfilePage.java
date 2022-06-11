package Application.Telerik;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.methi.LoginPage;
import pages.methi.UpdateAvatarPage;
import pages.methi.UpdateProfilePage;

public class TC03TelerikProfilePage extends CommonAPI {
    @Test
    public void profilePage(){
        UpdateProfilePage profilePage = new UpdateProfilePage(getDriver());

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickYourAccount();
        loginPage.typeEmail();
        loginPage.typePassword();
        loginPage.clickLoginBtn();

        UpdateAvatarPage avatarPage = new UpdateAvatarPage(getDriver());
        avatarPage.clickEditProfile();

        profilePage.typeJobTitle();
        waitFor(2);

        profilePage.typeInterests();
        waitFor(2);

        profilePage.typeCompanyURL();
        waitFor(2);

        profilePage.scrollToView(getDriver());
        waitFor(2);

//        profilePage.getDropDownOptions();
//        waitFor(2);

    }
}
