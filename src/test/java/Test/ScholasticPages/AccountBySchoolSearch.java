package Test.ScholasticPages;
import DriverWrapper.Web;
import Pages.Scholastic.NewAccountByZipCode;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Pages.Scholastic.NewAccountBySchoolSearch;
public class AccountBySchoolSearch extends Web{
    NewAccountBySchoolSearch newAcctForSearchBySchool = new NewAccountBySchoolSearch();

    @Test
    public void initalizeSearchByStateAndCityAccountCreation() throws InterruptedException {
       newAcctForSearchBySchool.educationRoleSelectioniFrame();
       newAcctForSearchBySchool.personalInformationiFrame();
       newAcctForSearchBySchool.searchByStateandCityiFrame();
       newAcctForSearchBySchool.schoolSelection();
       newAcctForSearchBySchool.teacherRoleSelection();
       newAcctForSearchBySchool.teacherReadingLevel();
       newAcctForSearchBySchool.loggedInLandingPage();
       newAcctForSearchBySchool.profileLandingPage();


    }
}
