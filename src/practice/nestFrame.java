package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestFrame {


    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/nested_frames";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        //How do you handle iframe with Selenium?
        //using switch to frame method first, then locate element.

        WebElement parentFrame = driver.findElement(By.cssSelector("frame[name='frame-top']"));
        driver.switchTo().frame(parentFrame);

        WebElement middleFrame = driver.findElement(By.cssSelector("html > frameset > frame:nth-child(2)"));
        driver.switchTo().frame(middleFrame);

        WebElement contentElement = driver.findElement(By.cssSelector("#content"));
        String text = contentElement.getText();
        System.out.println(text);

        driver.switchTo().defaultContent();

        driver.switchTo().frame(parentFrame);

        Thread.sleep(1000);
        WebElement rightFrame = driver.findElement(By.cssSelector("frame[name='frame-right']"));
        driver.switchTo().frame(rightFrame);

        WebElement rightFrameContent = driver.findElement(By.cssSelector("body"));
        String text1 = rightFrameContent.getText();
        System.out.println(text1);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(parentFrame);

        WebElement leftFrame = driver.findElement(By.cssSelector("frame[name='frame-left']"));
        driver.switchTo().frame(leftFrame);

        WebElement leftFrameContent = driver.findElement(By.cssSelector("body"));
        String text2 = leftFrameContent.getText();
        System.out.println(text2);


        Thread.sleep(3000);
        driver.quit();


    }
}
