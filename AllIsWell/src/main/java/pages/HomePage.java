package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {
    @FindBy(id = "navbtn_tutorials")
    public static WebElement tutorials;

    public void validateTutorialBtn() {
        Assert.assertEquals(tutorials.isDisplayed(), true, "Tutorial button is not displayed");
    }

    @FindBy(id = "navbtn_references")
    public static WebElement references;

    public void validateReferenceBtn() {
        Assert.assertEquals(references.isDisplayed(), true, "References button is not get displayed");
    }

    @FindBy(id = "navbtn_examples")
    public static WebElement exampleButton;

    public void ValidateExampleButton() {
        Assert.assertEquals(exampleButton.isDisplayed(), true, "Example button is not get displayed");
    }

    @FindBy(id = "navbtn_exercises")
    public static WebElement exerciseButton;

    public void validateExerciseBtn() {
        Assert.assertEquals(exerciseButton.isDisplayed(), true, "Exercise button is not get displayed");
    }
}
