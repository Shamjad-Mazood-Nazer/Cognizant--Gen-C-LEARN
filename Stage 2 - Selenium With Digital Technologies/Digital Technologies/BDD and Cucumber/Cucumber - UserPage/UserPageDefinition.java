//DO NOT CHANGE THE GIVEN TEMPLATE CODE.
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;
import java.util.concurrent.TimeUnit;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
import org.junit.*;
 
public class UserPageDefinition {   // DO NOT CHANGE THE CLASS NAME
 
    // Use the below declared variable
	public static WebDriver driver;
	//DO NOT CHANGE GIVEN SET OF CODE TO CREATE 'DRIVER'
	@Given("Start firefox browser")
	public void Start_firefox_browser() {
	    driver=DriverSetup.getDriver();
	}
	@Then("user navigate to the application home page")
	public void user_navigate_to_the_application_home_page(){
	    // Implement code to navigate to the home page 
	    driver.get("https://webapps.tekstac.com/Users/");
	    //Verify the url navigation with assert
	    Assert.assertTrue(driver.getPageSource().contains("Address"));
	}
    @When("user enters Name as {string}, Address as {string}, Mobile as {string} and Email as {string}")
    public void user_enters_name_as_address_as_mobile_as_and_email_as(String name, String address, String mobile, String email) {
        // Implement code to fill the form
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        driver.findElement(By.cssSelector("#address")).sendKeys(address);
        driver.findElement(By.cssSelector("#mobile")).sendKeys(mobile);
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
    }
    @When("user click submit button")
    public void user_click_submit_button() {
        // Implement code to click the submit button
        driver.findElement(By.cssSelector("#submit")).click();
    }
    @Then("it should display the result")
    public void it_should_display_the_result() {
        // Implement code to get the result and print it in console
        // store it in a string 'result'
        String result = driver.findElement(By.cssSelector("#result")).getText();
        //Verify the result message with assert
        Assert.assertTrue(result.contains("Rajesh"));
    }

    @Then("close the driver")
    public void close_the_driver() {
        // Implement code to close the driver
        driver.quit();
    }
}
