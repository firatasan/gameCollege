package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import org.testng.Assert;

public class _Parent {

    WebDriver driver;
    WebDriverWait wait;

    public _Parent() { driver= Driver.getDriver(); wait=new WebDriverWait(driver,10);}

    public void waitUntilClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilVisible(WebElement element){

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element)
    {
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void mouseHoverOver (WebElement element)
    {

        Actions action=new Actions(driver);
        waitUntilVisible(element);
        scrollToElement(element);
        action.moveToElement(element).build().perform();

    }



    public void verifyElementContainsText(WebElement element, String text){

        wait.until(ExpectedConditions.visibilityOf(element));

        System.out.println("Actual result : "+ element.getText());
        System.out.println("Expected result : "+ text);

        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

}
