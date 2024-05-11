//DO NOT CHANGE THE GIVEN TEMPLATE CODE.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.*;
public class ShopifyPageDefinition {   // DO NOT CHANGE THE CLASS NAME
    // Use the below declared variable
	public static WebDriver driver;
	//DO NOT CHANGE GIVEN SET OF CODE TO CREATE 'DRIVER'
	@Given("Start firefox browser")
	public void Start_firefox_browser() {
	    driver=DriverSetup.getDriver();
	}
	@Then("user navigate to the application home page")
    public void user_navigate_to_the_application_home_page() {
        driver.get("https://webapps.tekstac.com/Shopify/");
    }
    @When("user enters Firstname as {string}, Lastname as {string}, Username as {string}, City as {string}, Gender as {string} and Password as {string}")
    public void user_enters_Firstname_as_Lastname_as_Username_as_City_as_Gender_as_and_Password_as(String firstname, String lastname, String username, String city, String gender, String password) {
        driver.findElement(By.id("firstname")).sendKeys(firstname);
        driver.findElement(By.id("lastname")).sendKeys(lastname);
        driver.findElement(By.id("username")).sendKeys(username);
        Select select=new Select(driver.findElement(By.id("selectcity")));
        select.selectByVisibleText(city);
        driver.findElement(By.xpath("//input[@value='"+gender+"']")).click();
        driver.findElement(By.id("pass")).sendKeys(password);
    }
    @When("user click Register button")
    public void user_click_Register_button() {
        driver.findElement(By.id("reg")).click();
    }
    @Then("it should display the result get the Firstname")
    public void it_should_display_the_result_get_the_Firstname() {
        String result = driver.findElement(By.xpath("//*[@id='tbrow'][1]")).getText();
        System.out.println("Displayed Firstname: " + result);
        Assert.assertEquals("Siva Kumar SivaKumar Coimbatore", result);
    }
    @Then("close the driver")
    public void close_the_driver() {
        driver.quit();
    }
 
	/* Implement the step definition methods with an expression than links it to one or more
	   gherkin steps. */
}