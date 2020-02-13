package stepDefinations;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

import static java.lang.Boolean.TRUE;


public class Homepage {

    WebDriver driver ;

    @Given("^User the user navigates to the homepage$")
    public void userNavigatesToHomepage (){
        System.setProperty("webdriver.chrome.driver","C:/guru99/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://live.demoguru99.com/index.php/");
    }

    @Then("^User should be able to see the correct title on the page$")
    public void userAbleToSeePageTitle (){

       Assert.assertEquals(driver.getTitle(),"Home page");
        driver.close();
    }

}
