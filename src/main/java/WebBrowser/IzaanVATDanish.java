package WebBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IzaanVATDanish {

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
            driver.findElement(By.cssSelector("#accordionSidebar_PIMS > a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/ul/li[2]/div[2]/a")).click();
            driver.findElement(By.id("employeeCode")).sendKeys("emp-003");
            driver.findElement(By.id("employeeType")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[2]/div[1]/div[3]/div/select/option[4]")).click();
            driver.findElement(By.id("nameEnglish")).sendKeys("Danish Fida Bangash");
            driver.findElement(By.id("motherNameEnglish")).sendKeys("------------");
            driver.findElement(By.id("fatherNameEnglish")).sendKeys("*************");
            driver.findElement(By.id("nationality")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[6]/div[1]/div/div/select/option[1]")).click();
            driver.findElement(By.id("dateOfBirth")).sendKeys("10-15-1995");
            driver.findElement(By.id("birthPlace")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[8]/div[1]/div/div/select/option[15]")).click();
            driver.findElement(By.id("religion")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[9]/div[1]/div/div/select/option[2]")).click();
            driver.findElement(By.id("gender")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[9]/div[2]/div/div/select/option[2]")).click();
            driver.findElement(By.id("emailAddress")).sendKeys("danish.bangash05@gmail.com");
            driver.findElement(By.id("emailAddressPersonal")).sendKeys("danish.bangash05@gmail.com");
            driver.findElement(By.id("mobileNumberOffice")).sendKeys("+13479725424");
            driver.findElement(By.id("mobileNumberPersonal")).sendKeys("+13479725424");
            driver.findElement(By.id("joiningDateGovtService")).sendKeys("08-31-2021");
            driver.findElement(By.id("designation")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/div[19]/div[2]/div/div/select/option[6]")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div/form/button")).click();
            Thread.sleep(5000);
            driver.close();

        }
    }
