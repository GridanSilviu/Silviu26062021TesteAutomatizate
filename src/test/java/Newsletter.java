import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Newsletter extends PageObject{
    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement enterEmailField;
    public void setEnterEmailField(){
        this.enterEmailField.click();
    }
    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;
    public void setSubmitButton(){
        this.submitButton.click();
    }
    public Newsletter(WebDriver driver){
        super(driver);
    }


}
