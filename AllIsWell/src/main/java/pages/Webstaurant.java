package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

import java.util.List;

public class Webstaurant extends CommonAPI {
    @FindBy(id = "searchval")
    WebElement searchField;
    @FindBy(xpath = "//button[@value='Search']")
    WebElement searchButton;
    @FindBy(css = "a.description")
    List<WebElement> productTitle;
    @FindBy(id = "buyButton")
    WebElement lastItemAddTocart;
    @FindBy(xpath = "//button[contains(text(),'View Cart')]")
    WebElement viewCart;
    @FindBy(css = "a.emptyCartButton btn btn-mini btn-ui pull-right")
    WebElement emptyCart;
    @FindBy(xpath = "//button[contains(text(),'Empty Cart')]")
    WebElement sureEmptyCart;

    public void clickOnSearchField() {
        searchField.click();
        TestLogger.log("Search field is clickable");
    }

    public void typeOnSearchField(String searchText) {
        searchField.sendKeys(searchText);
        TestLogger.log(searchText + " " + "is typed on search field");
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public void productTitleValidation() {
        for (int i = 0; i < productTitle.size(); i++) {
            String titleText = productTitle.get(i).getText();
            if (titleText.contains("Table")) {
                System.out.println(titleText);
            } else {
                System.out.println("The product titles do not contain 'Table' word");
            }
        }
    }

    public void isProductTitleContainsTable(String certainText) {

   /*    int totalProduct =productTitle.size();
        System.out.println("Total number of product in the page "+ totalProduct);
        if(productTitle.contains(certainText)){
            System.out.println("Every product item has the word"+ certainText+ "in its title");
        }else{
            System.out.println("Titles do not contains word table");
        }*/


    }

    public void clickOnLastElement() {
        for (int i = 0; i < productTitle.size(); i++) {
            String str = productTitle.get(i).getText();
            if (i == productTitle.size() - 1) {
                productTitle.get(i).click();
                Assert.assertEquals(lastItemAddTocart.isDisplayed(), true, "Last item is not get clicked");
            }
        }
    }

    public void addToCart() {
        sleepFor(10);
        lastItemAddTocart.click();

    }

    public void clickOnViewCartButton() {
        sleepFor(10);
        viewCart.click();
    }

    public void clickOnEmptyCart() {
        sleepFor(10);
        emptyCart.click();
    }

    public void clickOnPoppedupEmptyCart() {
        sleepFor(10);
        sureEmptyCart.click();
    }

}
