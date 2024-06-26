
//Add required imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLocator // DO NOT Change the class Name
{

    public WebDriver createDriver() // DO NOT change the method signature
    {
        // Invoke getWebDriver method from DriverSetup and return it
        return DriverSetup.getWebDriver();
    }

    public WebElement getPageLocator(WebDriver driver) // DO NOT change the method signature
    {
        /*
         * Replace this comment by the code statement to get the WebElement of
         * 'Lastname'
         */
        /* Find the element by id */
        return driver.findElement(By.id("lastname"));

    }

    public String getName(WebElement element) // DO NOT change the method signature
    {
        // Get the attribute value from the element and return it
        return element.getAttribute("placeholder");
    }

    public static void main(String[] args) {
        PageLocator pl = new PageLocator();
        // Add required code

        WebDriver driver = pl.createDriver();
        WebElement lastNameTextbox = pl.getPageLocator(driver);
        String placeholderText = pl.getName(lastNameTextbox);
        System.out.println("Placeholder Text for Lastname textbox: " + placeholderText);

    }

}
