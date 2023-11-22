package seleniumBasics;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SeleniumConcepts {

    @Test(description = "Basic Concepts of Selenium")
    public void basicConcepts() throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://mytestingthoughts.com/Sample/home.html");
        driver.manage().window().maximize();


        //What does a driver represent ---> driver represents a browser

        //Element means a textbox, button, radio button, checkbox etc.....

//        driver.findElement() ---> In the given browser, we are finding a particular element

        //Syntax of finding an element by name:
        //driver.findElement(By.name(value));

        //.sendKeys() ---> is used to enter the data into the textbox
        driver.findElement(By.name("first_name")).sendKeys("First Name");

        driver.findElement(By.name("last_name")).sendKeys("Last Name");

        //Syntax of finding an element by id:
        //driver.findElement(By.id(value));

        //.click() is the function used to click on an element
        driver.findElement(By.id("inlineRadioMale")).click();

        driver.findElement(By.name("user_name")).sendKeys("User Name");

        driver.findElement(By.name("user_password")).sendKeys("Password");

        driver.findElement(By.name("confirm_password")).sendKeys("Password");

        driver.findElement(By.name("email")).sendKeys("abc@abc.com");

        driver.findElement(By.name("contact_no")).sendKeys("8237623623");

        driver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("Text Area");

        //Whenever the dropdown is having a <select> html tag

        Select s1=new Select(driver.findElement(By.name("department")));
        s1.selectByVisibleText("MPDC");

        Thread.sleep(3000);
        s1.selectByVisibleText("Accounting Office");

        s1=new Select(driver.findElement(By.id("exampleFormControlSelect2")));

        //Will return the list of options present under the dropdown
        List<WebElement> optionsList=s1.getOptions();

        //Picking a random number from 0 to optionsList.size()-1
        int number= ThreadLocalRandom.current().nextInt(optionsList.size()-1);

        //.getText() ---> Get The Text from The HTML PAGE or from the web element
        s1.selectByVisibleText(optionsList.get(number).getText());

        //(TakesScreenshot) ---> Captures the screenshot
        //((TakesScreenshot)driver) ---> Captures the screenshot of the driver
        //((TakesScreenshot)driver).getScreenshotAs ---> How do u want to store the screenshot

        //Capturing the screenshot and storing it in the form of a .png file
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        new File(System.getProperty("user.dir")+"\\Screenshots").mkdirs();

        File dest=new File(System.getProperty("user.dir")+"\\Screenshots\\Image01.png");

        //Copying the file from the source folder to the destination folder
        Files.copy(src,dest);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.cricbuzz.com");

        //Below concept can be used if the text is present between <a> </a>.
        //Syntax of finding an element on the basis of linktext:
        //driver.findElement(By.linkText(value));

        driver.findElement(By.linkText("Schedule")).click();

        driver.findElement(By.linkText("Teams")).click();

        driver.findElement(By.linkText("Domestic")).click();

    }
}
