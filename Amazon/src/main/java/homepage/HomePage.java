package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import report.TestLogger;

import java.util.List;

public class HomePage extends CommonAPI {
    public void clickOnSearchBar(){
       clickOnElementByXpath("/html//input[@id='twotabsearchtextbox']");
        TestLogger.log("search bar is clicked");
    }
    public void typeOnSearchBar(String value){
        typeOnElementByXpath("/html//input[@id='twotabsearchtextbox']", value);
        TestLogger.log(value + " typed on search bar");
    }
    public void clickOnSearchButton(){
       clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        TestLogger.log("search button is clicked");
    }
    public List <WebElement>getAllElementFromList(){
        // for understanding
        //List<WebElement> elementList= driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
        //return elementList;
        return driver.findElements(By.xpath("//*[contains(@value,'search-alias')]"));
    }
}///html//select[@id='searchDropdownBox']
////div[@id='nav-search']/form[@role='search']//input[@value='Go']