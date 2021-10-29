package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlerts {


    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/javascript_alerts";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement jsAlertButton1 = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button"));
        jsAlertButton1.click();
        Thread.sleep(500);

        //this line od code will take care of pop up ok icon
        driver.switchTo().alert().accept();

        WebElement jsAlertButton2 = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button"));
        jsAlertButton2.click();
        Thread.sleep(500);

        driver.switchTo().alert().dismiss();

        WebElement jsAlertButton3 = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button"));
        jsAlertButton3.click();
        Thread.sleep(500);

        driver.switchTo().alert().sendKeys("hello world");
        driver.switchTo().alert().accept();




        Thread.sleep(3000);
        driver.quit();


    }
}
