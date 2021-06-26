import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navbar extends PageObject {

    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement navbarSoftwareTestingCourse;
    public void setNavbarSoftwareTestingCourse(){
        this.navbarSoftwareTestingCourse.click();
    }

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]")
    private WebElement clickLearnLink;
    public void setClickLearnLink(){
        this.clickLearnLink.click();
    }

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]")
    private WebElement clickQuestionsLink;
    public void setClickQuestionsLink(){
        this.clickQuestionsLink.click();
    }

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]")
    private WebElement clickInstructorsLink;
    public void setClickInstructorsLink(){
        this.clickInstructorsLink.click();
    }

    public Navbar (WebDriver driver){
        super(driver);
    }


}
