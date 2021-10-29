package homework_10_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DemoBlaze {


    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        Actions actions = new Actions(driver);
        WebElement loginButton_Link = driver.findElement(By.cssSelector("#login2"));
        loginButton_Link.click();

        WebElement username_TextField = driver.findElement(By.cssSelector("#loginusername"));
        username_TextField.sendKeys("Moaz");

        WebElement password_TextField = driver.findElement(By.cssSelector("#loginpassword"));
        password_TextField.sendKeys("123456");

        WebElement login_Button = driver.findElement(By.cssSelector("button[onclick='logIn()']"));
        login_Button.click();


        WebElement phoneButton = driver.findElement(By.cssSelector("a[onclick=\"byCat('phone')\"]"));
        phoneButton.click();

        WebElement computerButton = driver.findElement(By.cssSelector("a[onclick=\"byCat('notebook')\"]"));
        computerButton.click();

        WebElement desktopButton = driver.findElement(By.cssSelector("a[onclick=\"byCat('monitor')\"]"));
        desktopButton.click();

        WebElement shoppingCart = driver.findElement(By.cssSelector("a[id=\"cartur\"]"));
        shoppingCart.click();

        WebElement placeOrder_Button = driver.findElement(By.cssSelector("button[class='btn btn-success']"));
        placeOrder_Button.click();


        Thread.sleep(1000);


        driver.switchTo().alert().accept();


        Thread.sleep(3000);
        driver.quit();


    }
}
