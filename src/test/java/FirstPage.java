import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]")
    private WebElement clickLearnNavLink;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]")
    private WebElement QuestionsNavLink;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]")
    private WebElement InstructorsNavLink;

    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement SoftwareTestingCourseNavLink;

    @FindBy(xpath = "/html/body/nav/div/a")
    private WebElement navbarSoftwareTestingCourse;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[1]")
    private WebElement clickLearnLink;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[2]")
    private WebElement clickQuestionsLink;

    @FindBy(xpath = "//*[@id=\"navmenu\"]/ul/li[3]")
    private WebElement clickInstructorsLink;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/a")
    private WebElement clickEnrollmentButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement enterEmailField;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement enrollmentFieldPositive;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement enrollmentFieldNegative;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement submitButton;

    @FindBy(xpath = "/html/body/section[2]/div/div/h3")
    private WebElement newsletterSection;

    @FindBy(xpath = "/html/body/section[1]/div/div/div/h1/span")
    private WebElement firstPageHeader;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div")
    private WebElement learnSection;

    @FindBy(xpath = "//*[@id='questions']/div/h2")
    private WebElement questionsSection;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement instructorsSection;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement singUpPage;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement clickReadMoreVirtualButton;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualOption;

    @FindBy(xpath = "/html/body/h1")
    private WebElement virtualPage;

    @FindBy(xpath = "/html/body/a")
    private WebElement clickReturnVirtualButton;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreFundamentalButton;

    @FindBy(xpath = "/html/body/h1")
    private WebElement fundamentalPage;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[1]/h3/button")
    private WebElement extendAccordionButton;

    public void setNavbarSoftwareTestingCourse(){this.navbarSoftwareTestingCourse.click();}

    public void setClickLearnLink(){ this.clickLearnLink.click(); }

    public void setClickQuestionsLink(){ this.clickQuestionsLink.click(); }

    public void setClickInstructorsLink(){ this.clickInstructorsLink.click(); }

    public void setClickEnrollmentButton(){this.clickEnrollmentButton.click();}

    public void setEnterEmailField(){ this.enterEmailField.click();}

    public void setSubmitButton(){ this.submitButton.click(); }

    public void setEnrollmentFieldPositive(){ this.enrollmentFieldPositive.sendKeys("email@yahoo.com"); }

    public void setEnrollmentFieldNegative(){this.enrollmentFieldNegative.sendKeys("@");}

    public void setVirtualOption(){ Utils.scrollToElement(driver,this.virtualOption); }

    public void setClickReadMoreVirtualButton(){ this.clickReadMoreVirtualButton.click(); }

    public void setClickReturnVirtualButton(){ this.clickReturnVirtualButton.click(); }

    public void setReadMoreFundamentalButton(){ this.readMoreFundamentalButton.click(); }

    public void setExtendAccordionButton(){this.extendAccordionButton.click();}

    public String getNewsletterSectionText() { return this.newsletterSection.getText(); }

    public String getHeaderText() { return this.firstPageHeader.getText(); }

    public String getLearnText(){return this.learnSection.getText();}

    public String getQuestionText(){return this.questionsSection.getText();}

    public String getInstructorsText(){return this.instructorsSection.getText();}

    public String getEnrollmentButtonText(){return  this.singUpPage.getText();}

    public String getVirtualPage() { return this.virtualPage.getText(); }

    public String getFundamentalPage() { return this.fundamentalPage.getText(); }

    public String getExtendAccordionButton() {return this.clickEnrollmentButton.getText();}

    public void dismissPopup() { driver.switchTo().alert().dismiss(); }

    public FirstPage(WebDriver driver){
        super(driver);
    }

}

