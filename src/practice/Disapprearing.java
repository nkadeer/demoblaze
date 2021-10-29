package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disapprearing {
    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/disappearing_elements";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        Thread.sleep(2000);

        WebElement home = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > a"));
        home.click();
        driver.navigate().back();

        WebElement about = driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > a"));
        about.click();
        driver.navigate().forward();

        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.quit();


    }
}
