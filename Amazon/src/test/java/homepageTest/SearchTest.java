package homepageTest;

import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import searchResult.ResultPage;

import java.util.List;

public class SearchTest extends HomePage {

    ResultPage resultpage = new ResultPage();

    @Test(enabled = false)
    public void validateSearchButtonWorks() {
        clickOnSearchBar();
        typeOnSearchBar("Java Books");
        clickOnSearchButton();
        sleepFor(2);
        resultpage.validateSearchPageDisplayed();
        sleepFor(2);
    }

    @Test
    public void testAllDropdownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        for(int i=0;i<elementList.size();i++){
            System.out.println(elementList.get(i).getText());
        }
    }
}
