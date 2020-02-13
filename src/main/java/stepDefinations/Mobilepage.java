package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.runtime.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobilepage {

    WebDriver driver ;
    @Given("^User navigates to the mobile page$")
    public void userNavigateToMobilePage() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:/guru99/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://live.demoguru99.com/index.php/");
        driver.findElement(By.xpath( "//a[text()='Mobile']")).click();
    }

    @Then("^User should be able to see the correct Mobile page title$")
    public void userAbleToSeeMobilePageTitle()throws Throwable {
        Assert.assertEquals(driver.getTitle(), "Mobile");
        driver.close();
    }
}
