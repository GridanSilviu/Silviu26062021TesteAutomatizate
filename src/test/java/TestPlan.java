import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "TC1: Testing Navbar functions")
    public void VerifyNavbar(){
        driver.get(Utils.BASE_URL);
        Navbar webForme = new Navbar(driver);
        webForme.setNavbarSoftwareTestingCourse();
        Utils.waitForElementToLoad(3);
        webForme.setClickLearnLink();
        Utils.waitForElementToLoad(3);
        webForme.setNavbarSoftwareTestingCourse();
        Utils.waitForElementToLoad(3);
        webForme.setClickQuestionsLink();
        Utils.waitForElementToLoad(3);
        webForme.setNavbarSoftwareTestingCourse();
        Utils.waitForElementToLoad(3);
        webForme.setClickInstructorsLink();
        Utils.waitForElementToLoad(3);
        webForme.setNavbarSoftwareTestingCourse();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName = "TC2: Testing “Become a Certified Software Tester” section")
    public void VerifyEnrollment(){
        driver.get(Utils.BASE_URL);
        Enrollment webForme = new Enrollment(driver);
        webForme.setEnrollmentButton();
        Utils.waitForElementToLoad(3);
    }

    @Test(testName = "TC 3: Testing “Sing Up For Our Newsletter” section")
    public void VerifiNewsletter(){
        driver.get(Utils.BASE_URL);
        Newsletter webForme = new Newsletter(driver);
        webForme.setSubmitButton();
        Utils.waitForElementToLoad(3);
        webForme.setEnterEmailField();
        Utils.waitForElementToLoad(3);

    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
    }

