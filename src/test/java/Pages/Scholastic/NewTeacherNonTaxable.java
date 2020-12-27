package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class NewTeacherNonTaxable extends BasePage {
    By generateAccountButton = By.linkText("Create an Account");
    By teacherAdminHomeSchool = By.xpath("//label[@for='acccountTeacther']");
    By waitForNext = By.xpath("//div[@class='form-row form-row-button']");
    By teacherAdminSelectNextButton = By.id("linkChooseAcount");
    By nameTitle = By.xpath("//fieldset//div[@class='custom-select']");
    /**Start of personalization information iFrame*/
    By teacherPersonalTitle = By.xpath("//fieldset//div[@class='custom-select']");
    /**Must use this WebElement and click as Select dropdown was not created correctly*/
    By selectionOfTitile = By.xpath("//span[contains(text(),'Mr.')]");
    By firstName = By.id("dwfrm_profile_customer_firstname");
    By lastName = By.id("dwfrm_profile_customer_lastname");
    By emailfield = By.id("dwfrm_profile_customer_email");
    By accountPassword = By.id("dwfrm_profile_login_password");
    By termsOfUseCheckBox = By.id("dwfrm_registration_termsofuseteacher");
    By teacherAccountCreationNextButton = By.xpath("//button[@class='button-continue']");
    By zipCodeInputField = By.xpath("//input[@id='dwfrm_myschool_schoolzip']");
    By schoolSearchNextButton = By.xpath("//button[@name='dwfrm_myschool_search']");
    By schoolNameInputField = By.id("dwfrm_searchschool_schoolvalue");
    By locationOfUlForSchoolNames = By.xpath("//ul[@id='ui-id-2']");
    By schoolSelectedNextButton = By.xpath("//button[@name='dwfrm_searchschool_findnext']");
    By teacherRoleSelect = By.xpath("//div[@class='custom-select']");
    /**Must use this WebElement and click as Select dropdown was not created correctly*/
    By selectTeacherRole = By.xpath("//div[@id='scrollbar-0']//li[@data-label='teacher (by grade)']");
    By gradeSelection = By.xpath("//div[@class='selected-option input-select noscroll']");
    /**Must use this WebElement and click as Select dropdown was not created correctly*/
    By fourthGradeSelect = By.xpath("//ul[@class='content-scrollbar']//li[@data-label='1st grade']");
    By numberOfStudentsInput = By.id("dwfrm_myrole_students");
    By teacherRoleNextButton = By.name("dwfrm_myrole_findgrade");
    By readingLevelSelect = By.xpath("//div[@class='selected-option input-select required']");
    /**Must use this WebElement and click as Select dropdown was not created correctly*/
    By grlReadingLevelSelect = By.xpath("//div[@id='scrollbar-0']//span[contains(text(),'Guided Reading Level (GRL)')]");
    By workExperinceRadioButton = By.xpath("//label[@for='dwfrm_profileselection_teaching__firstyear-1']//span[@class='custom-radio fa']");
    By workExperinceNextButton = By.name("dwfrm_profileselection_confirmed");
    By closeMainPageDropDown = By.xpath("//span[@class='notification-chevron fa fa-chevron-up']");
    By classCodeOnHomePage = By.xpath("//div[@class='sec-top-boxes']//div[@class='value']");
    By accountToggleButton = By.xpath("//a[@class='user-account toggle-item']");
    By profileButton = By.xpath("//div[@class='toggle-content']//a[contains(text(),'Profile')]");
    By profilePageClassCode = By.xpath("//div[@class='customer-code']");


    public void educationRoleSelectioniFrame () throws InterruptedException {
        clickThis(generateAccountButton);
        clickThis(teacherAdminHomeSchool);
        pause();
        clickThis(teacherAdminSelectNextButton);





    }
    public void personalInformationiFrame () throws InterruptedException {
        clickThis(teacherPersonalTitle);
        clickThis(selectionOfTitile);
        clickThisAndSendKeys(firstName, "John");
        clickThisAndSendKeys(lastName, "Doe");
        clickThisAndSendKeys(emailfield, "billyjohndoe52@gmail.com");
        clickThisAndSendKeys(accountPassword, "Temp122520!");
        clickThis(termsOfUseCheckBox);
        pause();
        clickThis(teacherAccountCreationNextButton);

    }
    public void zipcodeiFram () throws InterruptedException {
        clickThisAndSendKeys(zipCodeInputField, "99518");
        pause();
        clickThis(schoolSearchNextButton);
    }


    public void schoolSelection () throws InterruptedException {
        clickThis(schoolNameInputField);
        pause();
        type(schoolNameInputField, "Adak Schoo");
        pause();
        loopToClickElements(locationOfUlForSchoolNames);
        clickThis(schoolSelectedNextButton);
    }

    public void teacherRoleSelection () throws InterruptedException {
        clickThis(teacherRoleSelect);
        clickThis(selectTeacherRole);
        clickThis(gradeSelection);
        pause();
        clickThis(fourthGradeSelect);
        clickThisAndSendKeys(numberOfStudentsInput, "30");
        clickThis(teacherRoleNextButton);
    }

    public void teacherReadingLevel (){
        clickThis(readingLevelSelect);
        clickThis(grlReadingLevelSelect);
        clickThis(workExperinceRadioButton);
        clickThis(workExperinceNextButton);
    }

    public void loggedInLandingPage () throws InterruptedException {
        clickThis(closeMainPageDropDown);
        pause();
        getText(classCodeOnHomePage);
    }

    public void profileLandingPage (){
        clickThis(accountToggleButton);
        clickThis(profileButton);

    }
}
