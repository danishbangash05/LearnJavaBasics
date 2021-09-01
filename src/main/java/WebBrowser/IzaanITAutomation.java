package WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IzaanITAutomation {
    public static void main(String[] args) throws InterruptedException {
        // setting a pathway for the chrome driver that we have used
        System.setProperty("webdriver.chrome.driver", "src/main/java/WebBrowser/chromedriver");

        // Creating an object for maximizing the screen
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        //creating a driver object for calling the shots
        WebDriver driver = new ChromeDriver(options);

        // asking driver to get me the following link
        driver.get("https://izaan.io/");

        //step wise doing the task using various methods such as id and xpath.
        driver.findElement(By.xpath("/html/body/app-root/app-common-layout/app-header/header")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-common-layout/app-header/header/div/div/nav/ul/li[5]/a")).click();
        driver.findElement(By.xpath("/html/body/app-root/app-common-layout/app-signin/section/div/div/div[3]/div/button")).click();
        driver.findElement(By.id("email")).sendKeys("danish.bangash05");
        driver.findElement(By.id("password")).sendKeys("Izaan@danish.bangash05@123");
        driver.findElement(By.id("btnSignIn")).click();

        //delays before closing the browser
        Thread.sleep(3000);

        //browser close.
        driver.close();
    }
}
