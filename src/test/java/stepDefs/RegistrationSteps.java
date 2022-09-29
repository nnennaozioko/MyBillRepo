package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationSteps {
    public static WebDriver driver = null;

    @Given("^I navigates to the website$")
    public void iNavigatesToTheWebsite() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nelly\\IdeaProjects\\MyBillAfrica\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mybillafrica-test.azurewebsites.net/");
        driver.manage().window().maximize();
    }

    @When("^I click on the register button$")
    public void iClickOnTheRegisterButton() throws InterruptedException {
        //Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/a")).click();
    }

    @And("^I click on the personal button$")
    public void iClickOnThePersonalButton() {
    }

    @And("^I select country$")
    public void iSelectCountry() {
    }

    @And("^I enter firstName$")
    public void iEnterFirstName() {
    }

    @And("^I enter lastName$")
    public void iEnterLastName() {
    }

    @And("^I click dropdown$")
    public void iClickDropdown() {
    }

    @And("^I enter contact number$")
    public void iEnterContactNumber() {
    }

    @And("^I enter email$")
    public void iEnterEmail() {
    }

    @And("^I enter PassWord$")
    public void iEnterPassWord() {
    }

    @And("^I click on the account button$")
    public void iClickOnTheAccountButton() {
    }

    @Then("^my account is successfully created$")
    public void myAccountIsSuccessfullyCreated() {
    }
}
