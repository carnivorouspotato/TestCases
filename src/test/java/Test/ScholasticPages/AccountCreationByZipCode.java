package Test.ScholasticPages;

import DriverWrapper.Web;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pages.Scholastic.NewAccountByZipCode;

public class AccountCreationByZipCode extends Web {
    NewAccountByZipCode acctCreation = new NewAccountByZipCode();
WebDriver driver;
    @Test
    public void initalizeZipcodeAccountCreation() throws InterruptedException {
        acctCreation.educationRoleSelectioniFrame();
        acctCreation.personalInformationiFrame();
        acctCreation.zipcodeiFram();
        acctCreation.schoolSelection();
       acctCreation.teacherRoleSelection();
       acctCreation.teacherReadingLevel();
       acctCreation.loggedInLandingPage();
       acctCreation.profileLandingPage();

    }

}


