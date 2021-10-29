package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/checkboxes";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement checkBtn = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
        checkBtn.click();

        checkBtn.click();

        Thread.sleep(3000);
        driver.quit();
    }
}
