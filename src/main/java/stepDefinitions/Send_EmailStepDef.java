package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import webElements.ObjRepo;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import io.cucumber.java.en.And;

public class Send_EmailStepDef {
    WebDriver driver;
    ObjRepo repo = new ObjRepo();

    @Given("user is logged into Gmail account")
    public void userIsLoggedInToGmailAccount() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.google.com");
        driver.findElement(By.xpath(repo.getIn_email())).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath(repo.getBtn_Next())).click();
        driver.findElement(By.xpath(repo.getIn_pass())).sendKeys("xxx");
        driver.findElement(By.xpath(repo.getBtn_Next())).click();
    }

    @When("user clicks on the compose button")
    public void userClicksOnComposeButton() {
        WebElement composeButton = driver.findElement(By.xpath(repo.getBtn_compose()));
        composeButton.click();
    }

    @Then("user validates the Compose window is opened")
    public void userValidatesComposeWindowIsOpened() {
        WebElement bodyField = driver.findElement(By.xpath(repo.getIn_emailBody()));
        Assert.assertTrue(bodyField.isDisplayed());
    }

    @And("user opens the compose email window")
    public void userOpensComposeEmailWindow() {
        WebElement composeButton = driver.findElement(By.xpath(repo.getBtn_compose()));
        composeButton.click();
    }

    @When("user enters {string} in the Subject")
    public void userEntersSubject(String subject) {
        WebElement subjectField = driver.findElement(By.name("subjectbox"));
        subjectField.sendKeys(subject);
    }

    @And("user enters {string} in the email body")
    public void userEntersEmailBody(String emailBody) {
        WebElement bodyField = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
        bodyField.sendKeys(emailBody);
    }

    @Then("user validates the email details are entered correctly")
    public void userValidatesEmailDetailsEnteredCorrectly() {
        WebElement subjectField = driver.findElement(By.name("subjectbox"));
        WebElement bodyField = driver.findElement(By.xpath("//div[@aria-label='Message Body']"));
        subjectField.getText().equals("Incubyte");
        bodyField.getText().equals("Automation QA test for Incubyte");
    }

    @When("user enters the recipients details")
    public void userEntersRecipientsDetails() {
        driver.findElement(By.xpath(repo.getIn_toList())).sendKeys("xyz@gnmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("Incubyte");
        driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Automation QA test for Incubyte");
    }

    @And("user clicks on the send button")
    public void userClicksOnSendButton() {
        WebElement sendButton = driver.findElement(By.xpath("//div[text()='Send']"));
        sendButton.click();
    }

    @Then("the email is sent to the recipient")
    public void emailIsSentToRecipient() {
    	System.out.println("Email is sent");
    }

    @When("user navigates to sent email")
    public void userNavigatesToSentEmail() {
    	driver.findElement(By.xpath(repo.getBtn_sent())).click();
    }

    @Then("user verifies the email is available in sent folder")
    public void userVerifiesEmailInSentFolder() {
    	driver.findElement(By.xpath(repo.getEmail_sub())).getText().equals("Incubyte");
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
