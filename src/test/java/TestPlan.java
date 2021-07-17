import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "TC1: Testing Navbar functions 1")
    public void VerifyFirstPage1() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickLearnLink();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.getLearnText(), "Learn The Fundamentals");
        webForm.setNavbarSoftwareTestingCourse();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.getHeaderText(), "Certified Software Tester");
    }

    @Test(testName = "TC2: Testing Navbar functions 2")
    public void VerifyFirstPage2() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickQuestionsLink();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.getQuestionText(), "Frequently Asked Questions");
        webForm.setNavbarSoftwareTestingCourse();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.getHeaderText(), "Certified Software Tester");
    }

    @Test(testName = "TC3: Testing Navbar functions 3")
    public void VerifyFirstPage3() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickInstructorsLink();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.getInstructorsText(), "Our Instructors");
        webForm.setNavbarSoftwareTestingCourse();
        Utils.waitForElementToLoad(3);
        Assert.assertEquals(webForm.getHeaderText(), "Certified Software Tester");
    }

    @Test(testName = "TC4: Testing “Become a Certified Software Tester” section")
    public void VerifyEnrollment() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setClickEnrollmentButton();
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(webForm.getEnrollmentButtonText(), "Personal information");
        Utils.waitForElementToLoad(1);
    }

    @Test(testName = "TC 5: “Sing Up For Our Newsletter” section - positive test")
    public void VerifyEnterEmailFieldPositive() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setEnterEmailField();
        Utils.waitForElementToLoad(1);
        webForm.setEnrollmentFieldPositive();
        Utils.waitForElementToLoad(3);
        webForm.setSubmitButton();
        Utils.waitForElementToLoad(3);
        webForm.dismissPopup();
    }

    @Test(testName = "TC 6: Testing “Sing Up For Our Newsletter” section - negative test 1")
    public void VerifyNewsletter() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setSubmitButton();
        Assert.assertEquals(webForm.getNewsletterSectionText(), "Sign Up For Our Newsletter");
        Utils.waitForElementToLoad(3);
    }

    @Test(testName = "TC 7: Testing “Sing Up For Our Newsletter” section – negative test 2")
    public void VerifyEnterEmailFieldNegative() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setEnterEmailField();
        webForm.setEnrollmentFieldNegative();
        Utils.waitForElementToLoad(1);
        webForm.setSubmitButton();
        Assert.assertEquals(webForm.getNewsletterSectionText(), "Sign Up For Our Newsletter");
        Utils.waitForElementToLoad(1);
    }

    @Test(testName = "TC 8: Testing “Sing up” section – positive test")
    public void VerifySingUpPagePositive() {
        driver.get(Utils.ENROLLMENT_URL);
        SingUpPage webForm = new SingUpPage(driver);
        webForm.setClickFirstNameField();
        webForm.setPositiveFirstNameField();
        webForm.setClickLastNameField();
        webForm.setPositiveLastNameField();
        webForm.setClickUsernameField();
        webForm.setPositiveUsernameField();
        webForm.setClickPasswordField();
        webForm.setClickPositivePasswordField();
        webForm.setClickConfirmPasswordField();
        webForm.setClickPositiveConfirmPasswordField();
        Utils.waitForElementToLoad(1);
        webForm.setClickNextButton();
        Assert.assertEquals(webForm.getNextButtonText(), "Contact information");
        Utils.waitForElementToLoad(1);
    }

    @Test(testName = "TC 9: Testing “Sing up” section – negative test")
    public void VerifySingUpPagNegative() {
        driver.get(Utils.ENROLLMENT_URL);
        SingUpPage webForm = new SingUpPage(driver);
        webForm.getNextButtonNegativeText();
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(webForm.getNextButtonNegativeText(), "Personal information");
    }

    @Test(testName = "TC 10: Testing “Sing up” section, Second Page – positive test")
    public void VerifySingUpSecondPagPositive() {
        driver.get(Utils.ENROLLMENT_URL);
        SingUpSecondPage webForm = new SingUpSecondPage(driver);
        webForm.setClickEmailField();
        Utils.waitForElementToLoad(5);
        webForm.setPositiveEmailField();
        Utils.waitForElementToLoad(5);
        webForm.setClickPhoneField();
        webForm.setPositivePhoneField();
        webForm.setClickCountryField();
        webForm.setPositiveCountryField();
        webForm.setClickCityField();
        webForm.setPositiveCityField();
        webForm.setClickPostCodeField();
        webForm.setPositivePostCodeField();
        Utils.waitForElementToLoad(1);
        webForm.setClickSecondNextButton();
        Assert.assertEquals(webForm.getSecondNextButtonText(), "Course options");
        Utils.waitForElementToLoad(1);
    }

    @Test(testName = "TC11: Testing Virtual – Read More button - First Page")
    public void VerifyReadMoreVirtualButton(){
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setReadMoreVirtualButton();
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(webForm.getVirtualPage(), "Virtual");
    }

    @Test(testName = "TC12: Testing Learn section – Read More button - First Page")
    public void VerifyReadMoreLearnTheFundamentals() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setReadMoreFundamentalButton();
        Utils.waitForElementToLoad(1);
        Assert.assertEquals(webForm.getFundamentalPage(), "Fundamentals page");
    }

    @Test(testName = "TC12: Testing Learn section – Read More button - First Page")
    public void VerifyAccordionButton() {
        driver.get(Utils.BASE_URL);
        FirstPage webForm = new FirstPage(driver);
        webForm.setExtendAccordionButton();
        Utils.waitForElementToLoad(2);
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}

