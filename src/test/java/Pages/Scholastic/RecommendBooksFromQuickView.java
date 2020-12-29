package Pages.Scholastic;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class RecommendBooksFromQuickView extends BasePage {


WebDriver driver;

        /**Elements to use to sign into the teachers account*/
    By triggerForSignInFrame = By.xpath("//a[@class='signin pureguest dialog-close disable-autoplay']");
    By inputForEmailAccount = By.id("dwfrm_login_username");
    By inputForPassword = By.id("dwfrm_login_password");
    By buttonToSignIntoAccount = By.id("loginModalBtn");
        /***/

        /**Elements to use for interacting with mainpage dropdown*/
    By clickableElementToRemoveDropDownScreen = By.xpath("//span[@class='notification-chevron fa fa-chevron-up']");
        /***/


        /**Elements to close Book club for Parents*/
    By openShopAsParentiFrame =  By.id("login-trasform-model");
    By closeShopAsParentiFrame = By.xpath("//a[@class='cancel-button']");
        /***/


        /**Elements to use in order to perform a search for products on the main page.*/
    By inputFieldForProductSearch = By.id("q");
    By searchButtonFromInputField = By.xpath("//button[@type='submit']//i[@class='fa fa-search']");
        /***/

        /**Elements on the product page for which we searched for*/
    By pathToHarryPotterDeathlyHallows = By.xpath("//div[@id='5e1d68d85c43f4117e13552d36']");
      By quickLookButtonForDeathlyHallows = By.xpath("//div[@id='5e1d68d85c43f4117e13552d36']//a[contains(text(),'QUICK LOOK')]");
        /***/

        /**Elements for quick look frame interactions*/
    By quickLookRecommendButton = By.xpath("//div[@class='recommended-button icon-button tooltipstered']");
    By checkBoxForRecommendForStudent = By.xpath("//input[@class='wishlist-dialog-checkbox recommended']");
    By buttonToCloseQuickLookFrame = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");
        /***/

        /**Elements for recommendation list*/
    By myListToggleButton = By.xpath("//span[contains(text(),'My Lists')]");
    By reccomendationForStudentsPage = By.xpath("//span[contains(text(),'My Lists')]");
        /***/



    public void signintoTeacherAccount () throws InterruptedException {
        clickThis(triggerForSignInFrame);
        clickThisAndSendKeys(inputForEmailAccount, "billyjohndoe52@gmail.com");
        clickThisAndSendKeys(inputForPassword, "Temp122520!");
        clickThis(buttonToSignIntoAccount);
    }

    public void closeDropDownAtMainScreen (){
        clickThis(clickableElementToRemoveDropDownScreen);
    }

    public void closeShopAsParentMessage (){
        clickThis(openShopAsParentiFrame);
        clickThis(closeShopAsParentiFrame);
    }

    public void searchForProductField () throws InterruptedException {
        pause();
        type(inputFieldForProductSearch, "Harry");
        clickThis(searchButtonFromInputField);
    }

    public void productElementsOnProductPage () throws InterruptedException {
        pause();
       hoverOverElement(pathToHarryPotterDeathlyHallows);
       clickThis(quickLookButtonForDeathlyHallows);



    }

    public void quickLookFrameInteraction (){
        clickThis(quickLookRecommendButton);
        clickThis(checkBoxForRecommendForStudent);
        clickThis(buttonToCloseQuickLookFrame);
    }

    public void viewingRecommendationList (){
        clickThis(myListToggleButton);
        clickThis(reccomendationForStudentsPage);
    }
}
