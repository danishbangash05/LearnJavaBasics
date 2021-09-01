package WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendText_EmailFromVAT {
    public static void main(String[] args) throws InterruptedException {

        // setting a pathway for the chrome driver that we have used
        System.setProperty("webdriver.chrome.driver", "src/main/java/WebBrowser/chromedriver");

        // Creating an object for maximizing the screen
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        //creating a driver to navigate
        WebDriver driver = new ChromeDriver(options);

        //asking driver to connect to our url
        driver.get("http://54.172.98.170:443/");

        //step by step navigation of our task
        driver.findElement(By.id("exampleInputEmail")).sendKeys("admin");
        driver.findElement(By.id("exampleInputPassword")).sendKeys("123456");
        driver.findElement(By.cssSelector("body > div > div > div > div > div > div > div > div > form > button")).click();
        driver.findElement(By.id("Setting_Settings")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/ul/li[15]/div[3]/a")).click();
//        driver.findElement(By.id("mem-6")).click();
//        driver.findElement(By.id("mem-6")).click();
        driver.findElement(By.id("myInput")).click();
        driver.findElement(By.id("myInput")).sendKeys("emp-003");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[3]/table/tbody/tr[7]/td/div")).click();
        driver.findElement(By.id("mem-6")).click();
        driver.findElement(By.id("subject")).click();
        driver.findElement(By.id("subject")).sendKeys("Testing an Automated Email");
        //driver.findElement(By.id("description")).click();
        driver.findElement(By.id("description")).sendKeys("Hi this is Danish testing an automated way to send email");
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div/form/div[5]/div[2]/div[2]/div")).click();
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div/form/div[5]/div[3]/input")).click();
/**
 *
 * This is not done yet
 *
 */
//        Thread.sleep(2000);
//        driver.close();
    }
}
