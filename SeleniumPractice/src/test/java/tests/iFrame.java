package tests;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iFrame extends CommonAPI {
    @Test
    public void iFrameTests(){
        driver.switchTo().frame(1);
        driver.get(driver.getCurrentUrl());
        //driver.switchTo().frame("iframe2");
        sleepFor(5);
        //-frameID     //FrameName     //FrameIndex
        WebElement element= getElementByLinkTest("Sortable");
        System.out.println(element.getText());
        Assert.assertEquals(element.getText(),"Sortable", "sortable assertion failed");

    }

}
