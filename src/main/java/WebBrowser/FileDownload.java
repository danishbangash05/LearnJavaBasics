package WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {
    //public static String chromedDriver = ("webdriver.chrome.driver", "src/main/java/WebBrowser/chromedriver");
    public static String url = "http://the-internet.herokuapp.com/";
    public static WebDriver setUp(){
                System.setProperty("webdriver.chrome.driver", "src/main/java/WebBrowser/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get(url);
                return driver;
    }
    public static void downloadFile (WebDriver driver) throws InterruptedException {
        WebElement downloadingFile = driver.findElement(By.linkText("File Download"));
        downloadingFile.click();
        Thread.sleep(3000);
        WebElement sampletext = driver.findElement(By.linkText("sample.txt"));
        sampletext.click();
        Thread.sleep(3000);
        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = setUp();
       downloadFile(driver);

    }
}
