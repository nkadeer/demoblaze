package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Hovers {


    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/hovers";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        Thread.sleep(2000);

        WebElement parent = driver.findElement(By.cssSelector("#content > div"));
        List<WebElement> children = parent.findElements(By.tagName("img"));

        Actions actions = new Actions(driver);

        //using for each loop find each child element, advance loop taking cara of the index,
        //regular for loop you have to give size of index

        for (WebElement img : children) {
            actions.moveToElement(img).build().perform();
            Thread.sleep(500);
        }

        for (int i = children.size() - 1; i >= 0; i--) {
            actions.moveToElement(children.get(i)).build().perform();
            Thread.sleep(500);
        }

        Thread.sleep(3000);
        driver.quit();


    }
}
