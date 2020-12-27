package Test.ScholasticPages;
import DriverWrapper.Web;
import Pages.Scholastic.NewTeacherNonTaxable;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class AccountByNonTaxable extends Web {

    NewTeacherNonTaxable newAcctNonTaxable = new NewTeacherNonTaxable();

    @Test
    public void initalizeNonTaxableAcct () throws InterruptedException {
        newAcctNonTaxable.educationRoleSelectioniFrame();
        newAcctNonTaxable.personalInformationiFrame();
        newAcctNonTaxable.zipcodeiFram();
        newAcctNonTaxable.schoolSelection();
        newAcctNonTaxable.teacherRoleSelection();
        newAcctNonTaxable.teacherReadingLevel();
        newAcctNonTaxable.loggedInLandingPage();
        newAcctNonTaxable.profileLandingPage();

    }

}
