package homepageTest;

import POM.HomePagePOM;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HeaderLinkedButtonTest extends CommonAPI {
    @Test
    public void testHeaderLinkedButton(){
        HomePagePOM homePagePOM= PageFactory.initElements(driver,HomePagePOM.class);

        homePagePOM.validateBestSellersDisplayed();
        sleepFor(2);
        homePagePOM.validateBestSellersClickable();
        sleepFor(3);
        homePagePOM.validateGiftIdeasDisplayed();
        sleepFor(2);
        homePagePOM.validateGiftIdeasClickable();
        sleepFor(3);
        homePagePOM.validateNewReleasesDisplayed();
        homePagePOM.validateNewReleasesClickable();
    }
}
