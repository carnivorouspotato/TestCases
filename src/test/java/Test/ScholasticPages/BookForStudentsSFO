package Test.ScholasticPages;
import DriverWrapper.Web;
import org.testng.annotations.Test;
import Pages.Scholastic.BooksforStudentsInSFO;
public class BookForStudentsSFO extends Web {

    BooksforStudentsInSFO sfoFlyer = new BooksforStudentsInSFO();

    @Test
    public void initalizeSfoFlyer () throws InterruptedException {
        sfoFlyer.signintoTeacherAccount();
        sfoFlyer.closeDropDownAtMainScreen();
        sfoFlyer.closeShopAsParentMessage();
        sfoFlyer.startNewOrder();
    }

}
