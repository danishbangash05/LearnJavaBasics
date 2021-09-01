package WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static String url = "http://the-internet.herokuapp.com/";

    public static void main(String[] args) {
        WebDriver driver = setUp();
        uploadingFile(driver);
    }
    public static void uploadingFile(WebDriver driver){
        WebElement uploadFile = driver.findElement(By.linkText("File Upload"));
        uploadFile.click();
        WebElement addFile = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/input[1]"));
        addFile.sendKeys("src/main/java/WebBrowser/style-skins.jpg");
//        addFile.sendKeys("/Users/neeraj.kumar/Desktop/c1.jpeg");
//        WebElement chooseFile = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/input[1]"));
//        uploadFile.sendKeys("src/main/java/WebBrowser/style-skins.jpg");
//        WebElement submit = driver.findElement(By.id("file-submit"));
//        submit.click();
        driver.close();
    }
    public static WebDriver setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/WebBrowser/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }
}
