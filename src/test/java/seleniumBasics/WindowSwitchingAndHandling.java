package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowSwitchingAndHandling {

    @Test(description = "Handling Different Tabs and Windows")
    public void handleDifferentTabsAndWindows() throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        //Syntax for maximizing the browser window
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //Opening a new Tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.in");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.redbus.in");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.myntra.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.flipkart.com");

        //For every tab or window that we have launched it contains a unique reference number
        String flipkartHandle=driver.getWindowHandle(); //Helps us in fetching that unique reference number
        System.out.println(flipkartHandle);

        //Opening a new Window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.facebook.com");

        String facebookHandle=driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.instagram.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.gmail.com");

        //Thread.sleep ---> It is used to hold the executions for a stipulated amount of time
        //Here we mention the time in milli seconds
        //1 sec = 1000 ms
        Thread.sleep(3000);

        //Switching to Flipkart Tab using the window handle
        driver.switchTo().window(flipkartHandle);

        Thread.sleep(3000);

        //Switching to Facebook Tab using the window handle
        driver.switchTo().window(facebookHandle);

        //Returns a set of all the unique reference numbers for all the tabs or windows launched
        Set<String> handles=driver.getWindowHandles();

        for(String s:handles)
        {
            Thread.sleep(1000);
            driver.switchTo().window(s);

            //Prints the title of the tab or window that is launched
            System.out.println(driver.getTitle());

            //Prints the URL of the application launched
            System.out.println(driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("redbus"))
            {
                //driver.quit() and driver.close() will work the same when there is only tab in that window
                //Closes that particular tab or window
                driver.close();
                break;
            }
        }

        Thread.sleep(10000);
        //Closes the browser completely
        driver.quit();

        //TASK : Launch 5 different applications in 5 different windows
    }
}
