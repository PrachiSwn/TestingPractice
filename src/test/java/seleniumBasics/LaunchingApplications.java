package seleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchingApplications {


    //We can have multiple @Test annotations in a single file
    // whereas we can have only one main method per file
    @Test //It Indicates that it is a test case
    public void launchApplications()
    {
        //First Way of launching the application
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//Drivers//chromedriver.exe");

        //Creating a driver object which should launch a chrome browser
        WebDriver driver=new ChromeDriver();

        //Launching Google Application/website
        driver.get("https://www.google.com");

        //Second Way:

        //It will download the firefox driver by itself and sets the path of it
        WebDriverManager.firefoxdriver().setup();

        driver=new FirefoxDriver();
        driver.get("https://www.redbus.in");

        //Third Way:

        //Whenever we use .create() function, the browser will launch and finish the
        //set of actions required, then it will close the browser by itself automatically
        driver=WebDriverManager.edgedriver().create();
        driver.get("https://www.amazon.com");

        //Fourth Way:

        System.clearProperty("webdriver.chrome.driver");

        //Chrome Driver will be automatically downloaded in your cache folder with the help
        //of selenium manager
        driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
    }
}
