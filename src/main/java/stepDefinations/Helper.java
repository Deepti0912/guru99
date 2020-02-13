package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper {
    WebDriver driver ;
    public WebDriver initialiseDriver(){
        System.setProperty("webdriver.chrome.driver","C:/guru99/driver/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
}
