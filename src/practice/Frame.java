package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {


    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/iframe";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement iframe = driver.findElement(By.cssSelector("#mce_0_ifr"));
        driver.switchTo().frame(iframe);



        Thread.sleep(500);

        WebElement textAreaElement = driver.findElement(By.cssSelector("#tinymce > p"));
        textAreaElement.click();
        textAreaElement.clear();
        textAreaElement.sendKeys("coding is hard, but fun");

        Thread.sleep(1000);

        String text = textAreaElement.getText();
        System.out.println(text);

        Thread.sleep(3000);
        driver.quit();


    }
}
