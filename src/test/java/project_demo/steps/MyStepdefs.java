package project_demo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import project_demo.pages.ContactPage;

import static project_demo.browserfactory.ManageBrowser.driver;

public class MyStepdefs  {
//(Automatically link from feature file)
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }
    @When("I click on accept cookies")
    public void iClickOnAcceptCookies() {
        new ContactPage().clickOnAcceptCookies();

    }
    @And("I click on Contact")
    public void iClickOnContact() {
        new ContactPage().clickOnContact();

    }


    @Then("User should be able to navigate to URL {string}")
    public void userShouldBeAbleToNavigateToURL(String URL) {
        String URL1 = driver.getCurrentUrl();
        Assert.assertEquals(URL,URL1);
    }
    @And("I click on ContactVersionone button")
    public void iClickOnContactVersiononeButton() {
        new ContactPage().clickONContactVersion1button();
    }

    @Then("User should be able to see form {string}")
    public void userShouldBeAbleToSeeForm(String Text2) {
      String text =new ContactPage().verifyText();
        Assert.assertEquals(text,Text2);
    }


    @And("Enter {string},{string},{string},{string},{string},{string}")
    public void enter(String FirstName, String LastName, String CompanyName, String CompanyEmail, String JobTitle, String IntrestedIn) {
        new ContactPage().EnterFirstName(FirstName);
        new ContactPage().EnterLastName(LastName);
        new ContactPage().EnterComName(CompanyName);
        new ContactPage().EnterComEmail(CompanyEmail);
        new ContactPage().EnterJobTitle(JobTitle);
        new ContactPage().EnterIamInterestedIn(IntrestedIn);
    }

    @And("Click on Submit button")
    public void clickOnSubmitButton() {
        new ContactPage().ClickOnSubmitButton();
    }

    @Then("user should be able to see error message {string}")
    public void userShouldBeAbleToSeeErrorMessage(String str1) {
        String str2=new ContactPage().VerifyErrorMessage();
        Assert.assertEquals(str1,str2);
    }
}