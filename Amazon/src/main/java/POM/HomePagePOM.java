package POM;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.nio.channels.AsynchronousServerSocketChannel;

public class HomePagePOM {
    /*WebElement element= getElementByLinkTest("Shopper Toolkit");
    WebElement element2=getElement("");

    public void validateShopperDisplayed(){
        System.out.println(element.isDisplayed());
        Assert.assertEquals(element.isDisplayed(),true);

    }
    public void validateShopperClickAble(){
        element.click();
        Assert.assertEquals(element2.isDisplayed(),true);
    }*/

    //replacing element by shopperToolkit and element2 by shopperToolkitValue to make it easily understandable to others


    //WebElement shopperToolkitValue=getElement("//h2[contains(text(),'Get more value out of shopping')]");
                      //or
    @FindBy(linkText = "Shopper Toolkit")
    public static WebElement shopperToolkit;
     //Option 1
    @FindBy(xpath="//h2[contains(text(),'Get more value out of shopping')]")
    public static WebElement shopperToolkitValue;

     //Option 2
    @FindBy(how= How.XPATH,using="//h2[contains(text(),'Get more value out of shopping')]")
    public static WebElement getShopperToolkitValue2;

    @FindBy(linkText="Best Sellers")
    public static WebElement bestSellers;
    @FindBy(xpath="//div[@id='zg_banner_text_wrapper']")
    public static WebElement bestSellersValue;

    @FindBy(linkText="Gift Ideas")
    public static WebElement giftIdeas;

    @FindBy(xpath="//div[@id='zg_banner_text_wrapper']")
    public static WebElement giftIdeasValue;

    @FindBy(linkText="New Releases")
    public static WebElement newReleases;

    @FindBy(xpath="//div[@id='zg_banner_text_wrapper']")
    public static WebElement newReleasesValue;

    @FindBy(linkText="Today's Deals")
    public static WebElement todaysDeal;

    @FindBy(linkText="AmazonBasics")
    public static WebElement amazonsBasics;

    @FindBy(linkText="Coupons")
    public static WebElement coupons;


    public void validateShopperDisplayed(){
        System.out.println(shopperToolkit.isDisplayed());
        Assert.assertEquals(shopperToolkit.isDisplayed(),true);
    }
    public void validateShopperClickable(){
        shopperToolkit.click();
        Assert.assertEquals(shopperToolkitValue.isDisplayed(),true);
    }
    public void validateBestSellersDisplayed(){
        System.out.println(bestSellers.isDisplayed());
        Assert.assertEquals(bestSellers.isDisplayed(),true);
    }
    public void validateBestSellersClickable(){
        bestSellers.click();
        Assert.assertEquals(bestSellersValue.isDisplayed(),true);
    }
    public void validateGiftIdeasDisplayed(){
        System.out.println(giftIdeas.isDisplayed());
        Assert.assertEquals(giftIdeas.isDisplayed(),true);
    }
    public void validateGiftIdeasClickable(){
        giftIdeas.click();
        Assert.assertEquals(giftIdeasValue.isDisplayed(),true);
    }
    public  void validateNewReleasesDisplayed(){
        System.out.println(newReleases.isDisplayed());
        Assert.assertEquals(newReleases.isDisplayed(), true);
    }
    public  void validateNewReleasesClickable(){
        newReleases.click();
        Assert.assertEquals(newReleasesValue.isDisplayed(), true);
    }
}
