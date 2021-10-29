package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AddRemove {
    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/add_remove_elements/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement addBtn = driver.findElement(By.cssSelector("#content > div > button"));
        for(int i = 0; i < 5; i++){
            addBtn.click();
        }

        WebElement removeBtn = driver.findElement(By.cssSelector("#elements"));
        List<WebElement> button = removeBtn.findElements(By.tagName("button"));


        Thread.sleep(3000);
        driver.quit();

    }
}
