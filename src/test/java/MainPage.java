import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{
    public MainPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]")
    private WebElement clickLearnNavLink;
    public void LearnSection(){
        this.clickLearnNavLink.click();
    }

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]")
    private WebElement QuestionsNavLink;
    public void QuestionSection(){
        this.QuestionsNavLink.click();
    }

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]")
    private WebElement InstructorsNavLink;
    public void InstructorsSection(){
        this.InstructorsNavLink.click();
    }

    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement SoftwareTestingCoursNavLink;
    public void SoftwareTestingCoursNavLink(){
        this.SoftwareTestingCoursNavLink.click();
    }
}
