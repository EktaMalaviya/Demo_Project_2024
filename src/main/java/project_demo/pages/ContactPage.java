package project_demo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import project_demo.utility.Utility;


public class ContactPage extends Utility {
    private static final Logger log = LogManager.getLogger(ContactPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div[1]/button/span")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"menu-primary-menu-1\"]/li[7]/a")
    WebElement Contact;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Contact Version 1']")
    WebElement ContactVersion1;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Talk to us']")
    WebElement Text;

    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname-5f8095c5-a611-4167-b63b-ec979392794f']")
    WebElement FName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname-5f8095c5-a611-4167-b63b-ec979392794f']")
    WebElement LName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='company-5f8095c5-a611-4167-b63b-ec979392794f']")
    WebElement ComName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email-5f8095c5-a611-4167-b63b-ec979392794f']")
    WebElement CompEmail;


    @CacheLookup
    @FindBy(xpath = "//input[@id='jobtitle-5f8095c5-a611-4167-b63b-ec979392794f']")
    WebElement Title;

    @CacheLookup
    @FindBy(xpath = "//select[@id='2-118327477/it_service_area-5f8095c5-a611-4167-b63b-ec979392794f']")
    WebElement Intrested;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Submit']")
    WebElement SubmitButton;


    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Please complete all required fields.']")
    WebElement ErrorMessage;


    public void clickOnAcceptCookies() {
        log.info("Click on cookies" + acceptCookies.toString());
        clickOnElement(acceptCookies);
    }

    public void clickOnContact() {
        clickOnElement(Contact);
    }

    public void clickONContactVersion1button() {
        clickOnElement(ContactVersion1);
    }

    public String verifyText() {
        return getTextFromElement(Text);
    }

    public void EnterFirstName(String FirstName) {
        sendTextToElement(FName, FirstName);
    }
    public void EnterLastName(String LastName) {
        sendTextToElement(LName, LastName);
    }
    public void EnterComName(String CompanyName) {
        sendTextToElement(ComName, CompanyName);
    }
    public void EnterComEmail(String CompanyEmail) {
        sendTextToElement(CompEmail, CompanyEmail);
    }
    public void EnterJobTitle(String JobTitle) {
        sendTextToElement(Title, JobTitle);
    }

    public void EnterIamInterestedIn(String IntrestedIn) {
        sendTextToElement(Intrested, IntrestedIn);
    }
    public void ClickOnSubmitButton(){
        clickOnElement(SubmitButton);
    }
    public String VerifyErrorMessage(){
        return getTextFromElement(ErrorMessage);

    }

}



