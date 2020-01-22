package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends CommonAPI {
    HomePage homePage=PageFactory.initElements(driver,HomePage.class);
    @Test
    public void headerTest(){
        homePage.validateTutorialBtn();
        homePage.validateReferenceBtn();
        homePage.ValidateExampleButton();
        homePage.validateExerciseBtn();

    }
   /* @Test
    public void headerButtonTest(){
        homePage.ValidateExampleButton();
    }*/


}
