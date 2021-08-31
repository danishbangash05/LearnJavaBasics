package WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VATLogout {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "src/main/java/WebBrowser/chromedriver");

            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");

            WebDriver driver = new ChromeDriver(options);

            driver.get("http://54.172.98.170:443/");

            driver.findElement(By.id("exampleInputEmail")).sendKeys("admin");
            driver.findElement(By.id("exampleInputPassword")).sendKeys("123456");
            driver.findElement(By.cssSelector("body > div > div > div > div > div > div > div > div > form > button")).click();
            driver.findElement(By.id("userDropdown")).click();
            driver.findElement(By.xpath("/html/body/nav/ul/li/div/a[2]/span")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/form/button[2]")).click();
            driver.close();
        }
    }

