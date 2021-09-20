import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollmentSingUpThirdPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement clickManualTester;

    @FindBy(xpath = "//*[@id=\"flexRadioButton2\"]")
    private WebElement clickAutomationTester;

    @FindBy(xpath = "//*[@id=\"flexRadioButton3\"]")
    private WebElement clickAutomationAndManualTester;

    @FindBy(xpath = "//*[@id=\"flexRadioButton4\"]")
    private WebElement clickSecurityTester;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement clickNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformation;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[1]")
    private WebElement clickPrevButton;

    public void setClickManualTester(){this.clickManualTester.click();}

    public void setClickAutomationTester(){this.clickAutomationTester.click();}

    public void setClickAutomationAndManualTester(){this.clickAutomationAndManualTester.click();}

    public void setSecurityTester(){this.clickSecurityTester.click();}

    public void setNextButton(){this.clickNextButton.click();}

    public String getPaymentInformation(){return this.paymentInformation.getText();}

    public void setPrevButton(){this.clickPrevButton.click();}

    public EnrollmentSingUpThirdPage(WebDriver driver) { super(driver);}

}
