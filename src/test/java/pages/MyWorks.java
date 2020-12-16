package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyWorks extends _Parent{

    WebElement myElement;

    public MyWorks(){PageFactory.initElements(driver, this);}

    @FindBy (xpath = "/html/body") private WebElement homePGVerify;
    @FindBy (id = "cn-accept-cookie") public WebElement acceptCookies;
    @FindBy (xpath = "//li[@id='menu-item-323']") private WebElement lifeInCollege;
    @FindBy (xpath = "//a[@title='Online ED']") private WebElement onlineEd;
    @FindBy (xpath = "//a[@title='Social Activities']") private WebElement socialActivities;
    @FindBy (xpath = "//a[@title='Hackathon']") private WebElement gameJam;
    @FindBy (xpath = "//a[@title='Excursions']") private WebElement excursions;
    @FindBy (xpath = "//a[@title='Clubs']") private WebElement clubs;
    @FindBy (xpath = "//a[@title='Library']") private WebElement library;
    //TODO asagidaki locatorler clubs sayfasındaki linkler için
    @FindBy (xpath = "//a[@title='SOCİAL MEDİA CLUBS']") private WebElement socialMediaClubs;
    @FindBy (xpath = "//a[@title='GAME ART CLUB']") private WebElement gameArtClub;
    @FindBy (xpath = "//a[@title='GAME MARKETING CLUB']") private WebElement gameMarketingClub;
    @FindBy (xpath = "//a[@title='GAME COLLEGE MAGAZINE CLUB']") private WebElement gameCollegeMagazineClub;
    @FindBy (xpath = "//a[@title='GAME NETWORKING CLUB']") private WebElement gameNetworkingClub;
    //TODO asagidaki locatorler ise ilk linke tıkladıktan sonra sag tarafta acılan Navbar linkleri
    //@FindBy (xpath = "(//div[@class='cbp-container'])[2]//li[2]/*") private WebElement gameArtClub2;
    @FindBy (xpath = "(//a[text()='Game Art Club'])[2]") private WebElement gameArtClub2;
    @FindBy (xpath = "(//a[text()='Game Marketing Club'])[2]") private WebElement gameMarketingClub2;
    @FindBy (xpath = "(//a[text()='Game College Magazine Club'])[2]") private WebElement gameCollegeMagazineClub2;
    @FindBy (xpath = "(//a[text()='Game Networking Club'])[2]") private WebElement gameNetworkingClub2;



    @FindBy (xpath = "(//*[@itemprop='name'])[3]") private WebElement focusedPage;



    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "acceptCookies": myElement = acceptCookies;break;
            case "onlineEd": myElement = onlineEd;break;
            case "socialActivities": myElement = socialActivities;break;
            case "gameJam": myElement = gameJam;break;
            case "excursions": myElement = excursions;break;
            case "clubs": myElement = clubs;break;
            case "library": myElement = library;break;
            case "socialMediaClubs": myElement = socialMediaClubs;break;
            case "gameArtClub": myElement = gameArtClub;break;
            case "gameMarketingClub": myElement = gameMarketingClub;break;
            case "gameCollegeMagazineClub": myElement = gameCollegeMagazineClub;break;
            case "gameNetworkingClub": myElement = gameNetworkingClub;break;
            case "gameArtClub2": myElement = gameArtClub2;break;
            case "gameMarketingClub2": myElement = gameMarketingClub2;break;
            case "gameCollegeMagazineClub2": myElement = gameCollegeMagazineClub2;break;
            case "gameNetworkingClub2": myElement = gameNetworkingClub2;break;

        }

        clickFunction(myElement);
    }


    public void verifyPage(String pageName) {

        String pageURL = "";

        switch (pageName) {
            case "Game College Home": {
                myElement = homePGVerify; pageURL=driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/"));
                Assert.assertTrue(myElement.getText().contains("Our strategy is to utilize effective thinking skills with our student-centred curriculum."));
                break;
            }

            case "Online Education": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/life-in-college/online-ed/"));
                Assert.assertTrue(myElement.getText().contains("Online ED"));
                break;
            }

            case "Social Activities": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/life-in-college/social-activities/"));
                Assert.assertTrue(myElement.getText().contains("Social Activities"));
                break;
            }

            case "Game Jam": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/life-in-college/gamejams/"));
                Assert.assertTrue(myElement.getText().contains("GameJams"));
                break;
            }

            case "Excursions": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/life-in-college/excursions/"));
                Assert.assertTrue(myElement.getText().contains("Excursions"));
                break;
            }

            case "Clubs": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/life-in-college/clubs/"));
                Assert.assertTrue(myElement.getText().contains("Clubs"));
                break;
            }

            case "Social Media Clubs": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/clubs/social-media-clubs/"));
                Assert.assertTrue(myElement.getText().contains("Social Media Clubs"));
                break;
            }

            case "Game Art Club": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/clubs/game-art-club/"));
                Assert.assertTrue(myElement.getText().contains("Game Art Club"));
                break;
            }

            case "Game Marketing Club": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/clubs/game-marketing-club/"));
                Assert.assertTrue(myElement.getText().contains("Game Marketing Club"));
                break;
            }

            case "Game College Magazine Club": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/clubs/game-college-magazine-club/"));
                Assert.assertTrue(myElement.getText().contains("Game College Magazine Club"));
                break;
            }

            case "Game Networking Club": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/clubs/game-networking-club/"));
                Assert.assertTrue(myElement.getText().contains("Game Networking Club"));
                break;
            }


            case "Library": {
                myElement = focusedPage; pageURL = driver.getCurrentUrl();
                Assert.assertTrue(driver.getCurrentUrl().equalsIgnoreCase("https://igamecollege.com/life-in-college/library/"));
                Assert.assertTrue(myElement.getText().contains("Library"));
                break;
            }

        }

        System.out.println("URL: " + pageURL);
    }


    public void findElementAndHoverFunction(String elementName) {

        switch (elementName) {
            case "lifeInCollege": myElement = lifeInCollege;break;

        }

        mouseHoverOver(myElement);
    }

    public void gorunmeyenScriptClick(String elementName) {

        switch (elementName) {
            case "gameArtClub2": myElement = gameArtClub2;break;
            case "gameMarketingClub2": myElement = gameMarketingClub2;break;
            case "gameCollegeMagazineClub2": myElement = gameCollegeMagazineClub2;break;
            case "gameNetworkingClub2": myElement = gameNetworkingClub2;break;

        }


        //TODO Gorunmeyen right side nav bar için eklendi...
        //TODO yukarıdaki right Nav Bar linklerini normal yöntemle bulmaya calısınca "Element is not clickable at point" error veriyordu.
        // JavascriptExecutor eklendi. parantez icinde MouseEvent tanımlandı. Bu satırın parametreleri ne anlama geliyor?
        // event.initMouseEvent(type, canBubble, cancelable, view,
        //                     detail, screenX, screenY, clientX, clientY,
        //                     ctrlKey, altKey, shiftKey, metaKey,
        //                     button, relatedTarget);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("var evt = document.createEvent('MouseEvents');"
                + "evt.initMouseEvent('click',true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0,null);"
                + "arguments[0].dispatchEvent(evt);", myElement);

    }
}
