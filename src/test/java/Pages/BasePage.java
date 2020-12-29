package Pages;

import DriverWrapper.Web;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class BasePage {

    WebDriver driver;


    public void pause() throws InterruptedException {
        /**Having to use .sleep as no other waits were working(Implicit, explicit, nor fluent. All elements are present when the iFrame loads but submit buttons are not aperational until a 3 second
         * pause is applied*/
        Thread.sleep(3000);
    }

    public WebElement findElementUsingFluentWait(By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }


    public void type(By locator, String data) {
        findElementUsingFluentWait(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        findElementUsingFluentWait(locator).click();
    }

    public void clickThisAndSendKeys(By locator, String data) throws InterruptedException {
        findElementUsingFluentWait(locator).click();
        findElementUsingFluentWait(locator).sendKeys(data);
    }

    public boolean isElementDisplayed(By locator) {
        return findElementUsingFluentWait(locator).isDisplayed();
    }

    public void getText(By locator) {
        findElementUsingFluentWait(locator).getText();
        System.out.println(findElementUsingFluentWait(locator).getText());
    }

    public void loopToClickElements(By locator) throws InterruptedException {
        /**I had to use this loop as li contents of the Ul where dynamic and had no static attributes to follow xpath.*/
        List<WebElement> testList = findElementUsingFluentWait(locator).findElements(By.tagName("li"));
        for (int i = 0; i < testList.size(); i++) {
            WebElement clickTopOfList = testList.get(0);

            clickTopOfList.click();
            break;
        }


    }


    public void loopToClickElementsForSearchBySchool(By locator) throws InterruptedException {
        /**I had to use this loop as li contents of the Ul where dynamic and had no static attributes to follow xpath.*/
        List<WebElement> testList = findElementUsingFluentWait(locator).findElements(By.tagName("li"));
        for (int i = 0; i < testList.size(); i++) {
            WebElement clickTopOfList = testList.get(1);

            clickTopOfList.click();
            break;
        }


    }

            public void hoverOverElement (By locator){
            Actions action = new Actions(Web.getDriver());
            action.moveToElement(findElementUsingFluentWait(locator)).perform();
    }





        /**
         * select any value form any dropdown (locator, String)
         *
         * WebElement date = driver.findElement(By.id("month"));
         * Select dateDropdown = new Select(date);
         * dateDropdown.selectByVisibleText("Feb");
         *
         */

        /** public void selectFromDropdownUsingVisibleText(By locator, String data) {
         WebElement dropdownElement = findElementUsingFluentWait(locator);
         Select dropdown = new Select(dropdownElement);
         dropdown.selectByVisibleText(data);
         }*/


    }

