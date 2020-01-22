package homePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Webstaurant;

public class WebstaurantstoreTest extends CommonAPI {

    Webstaurant webstaurant;
    @BeforeMethod
    public void test() {
        webstaurant=PageFactory.initElements(driver, Webstaurant.class);
    }
    @Test
    public void validateSearchField(){
        webstaurant.clickOnSearchField();
        webstaurant.typeOnSearchField("stainless work table");
        webstaurant.clickOnSearchButton();
        //webstaurant.isProductTitleContainsTable("Table");
        webstaurant.productTitleValidation();
        webstaurant.clickOnLastElement();
        webstaurant.addToCart();
        webstaurant.clickOnViewCartButton();
        webstaurant.clickOnEmptyCart();
        webstaurant.clickOnPoppedupEmptyCart();


    }

}
