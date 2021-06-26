import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enrollment extends PageObject {
    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement enrollmentButton;
    public void setEnrollmentButton(){
        this.enrollmentButton.click();
    }
    public Enrollment (WebDriver driver) {
        super(driver);
    }

}
