package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Context {


    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/context_menu";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement box = driver.findElement(By.cssSelector("#hot-spot"));
        Actions actions = new  Actions(driver);
        actions.contextClick(box).perform();

        Thread.sleep(3000);

        driver.switchTo().alert().accept();

        Thread.sleep(3000);
        driver.quit();


    }
}
