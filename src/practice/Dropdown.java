package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/dropdown";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        Thread.sleep(2000);

        WebElement dropdown = driver.findElement(By.cssSelector("#dropdown"));

        Select drop = new Select(dropdown);
        drop.selectByValue("1");

        Thread.sleep(2000);
        driver.quit();
    }
}
