import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnrollmentSingUpFourthPage extends PageObject {

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement clickCardHolderNameField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement positiveCardHolderNameField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement clickCardNumberField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement positiveCardNumberField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement clickCardCvcField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement positiveCardCvcField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement clickNextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement successInformationPage;

    public void setClickCardHolderNameField(){this.clickCardHolderNameField.click();}

    public void setPositiveCardHolderNameField(){this.positiveCardHolderNameField.sendKeys("s");}

    public void setClickCardNumberField(){this.clickCardNumberField.click();}

    public void setPositiveCardNumberField(){this.positiveCardNumberField.sendKeys("1");}

    public void setClickCardCvcField(){this.clickCardCvcField.click();}

    public void setPositiveCardCvcField(){this.positiveCardCvcField.sendKeys("2");}

    public void setClickNextButton(){ Utils.scrollToElement(driver, this.clickNextButton); this.clickNextButton.click();}

    public String getNextButtonText(){return this.successInformationPage.getText();}

    public EnrollmentSingUpFourthPage(WebDriver driver) { super(driver); }
}
