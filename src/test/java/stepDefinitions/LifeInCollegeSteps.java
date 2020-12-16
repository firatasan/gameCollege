package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MyWorks;
import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LifeInCollegeSteps {

    WebDriver driver;
    MyWorks myWorks=new MyWorks();

    @Given("^Navigate to gameCollege$")
    public void navigateToGameCollege() {
        driver= Driver.getDriver();
        driver.get("https://igamecollege.com/");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //ilk sayfadaki cookies görünüyorsa accept buttona tıkla:
        if(myWorks.acceptCookies.isDisplayed()){ myWorks.acceptCookies.click();}

    }

    @Then("^User should see \"([^\"]*)\" Page successfully$")
    public void userShouldSeePageSuccessfully(String pageName) {

        myWorks.verifyPage(pageName);
        System.out.println(pageName);


    }

    @When("^User move mouse cursor to element$")
    public void userMoveMouseCursorToElement(DataTable elements) {

        List<String> elementsToHover=elements.asList(String.class);

        for (int i = 0; i < elementsToHover.size(); i++) {
            myWorks.findElementAndHoverFunction(elementsToHover.get(i));
        }
    }

    @Then("^User click on element$")
    public void userClickOnElement(DataTable elements) {

        List<String> elementsToClick=elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            myWorks.findElementAndClickFunction(elementsToClick.get(i));

        }


    }

    @Then("^User click on elementx$")
    public void userClickOnElementx(DataTable elements) {

        List<String> elementsToClick=elements.asList(String.class);

        for (int i = 0; i < elementsToClick.size(); i++) {

            myWorks.gorunmeyenScriptClick(elementsToClick.get(i));

        }


    }


    }

