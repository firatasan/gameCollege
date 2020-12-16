package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null){

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

            //Firefox için ise;
//            WebDriverManager.firefoxdriver().setup();
//            driver=new FirefoxDriver();

        }

        return driver;
    }

    public static void quitDriver(){

        if(driver!=null) {
            driver.quit();
            driver = null;
        }

    }

}
