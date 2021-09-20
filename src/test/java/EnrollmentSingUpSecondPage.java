import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollmentSingUpSecondPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement clickEmailField;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement positiveEmailField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement clickPhoneField;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement clickPositivePhoneField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement clickCountryField;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement clickPositiveCountryField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement clickCityField;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement clickPositiveCityField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement clickPostCodeField;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement clickPositivePostCodeField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement clickSecondNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement contactCourseOptionsPage;

    public void setClickEmailField(){this.clickEmailField.click();}

    public void setPositiveEmailField(){this.positiveEmailField.sendKeys("s");}

    public void setClickPhoneField(){this.clickPhoneField.click();}

    public void setPositivePhoneField(){this.clickPositivePhoneField.sendKeys("0");}

    public void setClickCountryField(){this.clickCountryField.click();}

    public void setPositiveCountryField(){this.clickPositiveCountryField.sendKeys("RO");}

    public void setClickCityField(){this.clickCityField.click();}

    public void setPositiveCityField(){this.clickPositiveCityField.sendKeys("Bv");}

    public void setClickPostCodeField(){this.clickPostCodeField.click();}

    public void setPositivePostCodeField(){this.clickPositivePostCodeField.sendKeys("1234");}

    public void setClickSecondNextButton(){ Utils.scrollToElement(driver, this.clickSecondNextButton); this.clickSecondNextButton.click();}

    public String getSecondNextButtonText(){return this.contactCourseOptionsPage.getText();}

    public EnrollmentSingUpSecondPage(WebDriver driver) { super(driver);}
}
