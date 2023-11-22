package seleniumBasics;

import framework.PropertiesUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class TestNGAnnotationsExample {

    WebDriver driver;

    @BeforeSuite
    public void killBrowsers() {
        try {
            //Runtime.getRuntime() ---> Imitate the Run Command Actions

            //Killing all the existing chrome browsers and drivers
            Runtime.getRuntime().exec("TASKKILL -f -im chrome.exe");
            Runtime.getRuntime().exec("TASKKILL -f -im chromedriver.exe");

            Runtime.getRuntime().exec("TASKKILL -f -im firefox.exe");
            Runtime.getRuntime().exec("TASKKILL -f -im geckodriver.exe");
        } catch (Exception e2) {

        }
    }

    @BeforeClass
    public void initializeDrivers() {
        String browser = new PropertiesUtil().getBrowser();

        if (browser.equalsIgnoreCase("Chrome"))
            driver = new ChromeDriver();

        else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Implicit Wait ---> It is used to wait for 10 seconds if the element is not found immediately
        //If the element is found after 10 seconds, then it will throw TimeOutException
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void launchApplication() {
        if (!driver.getCurrentUrl().contains("amazon"))
            driver.get(new PropertiesUtil().getURL());
    }

    @Test(description = "Searching for the Product", priority = 1)
    public void searchForProducts() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Jewellery");

        //Keys is the library used to imitiate/mimick the keyboard actions
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
    }

    @Test(description = "Apply the Filters", priority = 2)
    public void applyFilters() throws InterruptedException {
        //Syntax of finding an element on the basis of class name:
        //driver.findElement(By.className(value));

        if(new PropertiesUtil().getBrowser().equalsIgnoreCase("Firefox"))
        Thread.sleep(8000);

        driver.findElement(By.className("a-dropdown-label")).click();

        driver.findElement(By.linkText("Newest Arrivals")).click();

        driver.findElement(By.className("a-dropdown-label")).click();

        //Syntax of finding an element on the basis of partial link text:
        //driver.findElement(By.partialLinkText(value));

        if(new PropertiesUtil().getBrowser().equalsIgnoreCase("Firefox"))
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("Low to High")).click();

        //XPATH is one of the most powerful locators in Selenium:
        //Syntax of an xpath:

        //htmlTag[@attribute='value']
        //section[@aria-label='4 Stars & Up']

        //Syntax of writing an xpath on the basis of child:
        //htmlTag[@attribute='value']/anotherHTMLTag
        //section[@aria-label='4 Stars & Up']/i

        //Syntax of finding an elemnet on the basis of xpath:
        //driver.findElement(By.xpath(value));

        Thread.sleep(4000);
        driver.findElement(By.xpath("//section[@aria-label='4 Stars & Up']/i")).click();

        //Syntax of writing an xpath on the basis of text:
        //htmlTag[text()='value']
        //span[text()='Shining Diva Fashion']

        //Syntax of writing an xpath using descendant:
        //htmlTag[@attribute='value']/descendant::anotherHTMLTag
        //span[@class='a-list-item']/descendant::span[text()='Shining Diva Fashion']

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='a-list-item']/descendant::span[text()='Shining Diva Fashion']")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("low-price")).sendKeys("200");

        Thread.sleep(2000);
        driver.findElement(By.id("high-price")).sendKeys("1000");

        Thread.sleep(2000);
        driver.findElement(By.id("high-price")).sendKeys(Keys.ENTER);
    }


    @Test(description = "Selecting the Product", priority = 3)
    public void selectProduct() {
        //driver.findElements will store the WebElements in the form of a list
        //driver.findElements ---> Will Collect all the elements that are present using the same locator
        List<WebElement> elements = driver.findElements(By.xpath("//span[@data-component-type='s-product-image']/descendant::img"));

        //Picks a random number from 0 to elements.size()-1
        int number = ThreadLocalRandom.current().nextInt(elements.size() - 1);

        elements.get(number).click();

        //Switches to the latest window
        Set<String> handles = driver.getWindowHandles();

        for (String s : handles) {
            driver.switchTo().window(s);
        }

        driver.findElement(By.id("submit.add-to-cart")).click();
    }

}
