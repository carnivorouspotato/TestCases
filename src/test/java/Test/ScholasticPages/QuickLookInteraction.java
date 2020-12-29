package Test.ScholasticPages;
import DriverWrapper.Web;
import org.testng.annotations.Test;
import Pages.Scholastic.RecommendBooksFromQuickView;
public class QuickLookInteraction extends Web {

    RecommendBooksFromQuickView recommendationTest = new RecommendBooksFromQuickView();

    @Test
    public void quickLookFunctionTest () throws InterruptedException {
        recommendationTest.signintoTeacherAccount();
        recommendationTest.closeDropDownAtMainScreen();
        recommendationTest.closeShopAsParentMessage();
        recommendationTest.searchForProductField();
        recommendationTest.productElementsOnProductPage();
        recommendationTest.quickLookFrameInteraction();
        recommendationTest.viewingRecommendationList();


    }
}
