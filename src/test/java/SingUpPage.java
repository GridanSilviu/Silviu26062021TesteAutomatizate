import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingUpPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement clickFirstNameField;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement positiveFirstNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement clickLastNameField;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement clickPositiveLastNameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement clickUsernameField;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement clickPositiveUsernameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement clickPasswordField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement clickPositivePasswordField;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement clickConfirmPasswordField;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement clickPositiveConfirmPasswordField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationPage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement clickNextButtonNegative;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformationPage;


    public void setClickFirstNameField(){this.clickFirstNameField.click();}

    public void setPositiveFirstNameField(){this.positiveFirstNameField.sendKeys("s");}

    public void setClickLastNameField(){this.clickLastNameField.click();}

    public void setPositiveLastNameField(){this.clickPositiveLastNameField.sendKeys("s");}

    public void setClickUsernameField(){this.clickUsernameField.click();}

    public void setPositiveUsernameField(){this.clickUsernameField.sendKeys("s");}

    public void setClickPasswordField(){this.clickPasswordField.click();}

    public void setClickPositivePasswordField(){this.clickPositivePasswordField.sendKeys("s");}

    public void setClickConfirmPasswordField(){this.clickConfirmPasswordField.click();}

    public void setClickPositiveConfirmPasswordField(){this.clickPositiveConfirmPasswordField.sendKeys("s");}

    public void setClickNextButton(){ Utils.scrollToElement(driver, this.clickNextButton); this.clickNextButton.click();}

    public String getNextButtonText(){return this.contactInformationPage.getText();}

    public String getNextButtonNegativeText(){return this.personalInformationPage.getText();}

    public SingUpPage(WebDriver driver) { super(driver); }
}
