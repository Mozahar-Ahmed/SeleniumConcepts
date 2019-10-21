package tests;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNdrop extends CommonAPI {
    @Test(enabled = false)
    public void testDragNdrop(){
        sleepFor(2);
        Actions actions= new Actions(driver);
        WebElement from = getElement("//a[contains(text(),'BANK')]");
        WebElement to = getElement("//*[@id='bank']/li");
        actions.dragAndDrop(from,to).build().perform();
        sleepFor(2);
    }
    @Test
    public void testDragNdropUsingCommonAPIMethod(){
        dragNdropByXpath("//a[contains(text(),'BANK')]", "//ol[@id='bank']//li[@class='placeholder']");
    }
}
