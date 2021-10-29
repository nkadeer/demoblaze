package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/drag_and_drop";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        Thread.sleep(2000);

        WebElement boxA_source = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > a"));

        WebElement boxB_target = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > a"));

        Actions act = new Actions(driver);




        Thread.sleep(2000);
        driver.quit();


    }
}
