package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicControl {
    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/drag_and_drop";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement remove = driver.findElement(By.cssSelector("#checkbox-example > button"));
        remove.click();
        Thread.sleep(3000);

        WebElement p_tag = driver.findElement(By.cssSelector("#message"));
        String text = p_tag.getText();

        System.out.println("Add and remove Test");
        if(text.isEmpty()){
            System.out.println("Test Failed");
        }else{
            System.out.println("Test Pass");
        }

        System.out.println("===========================");


        WebElement  enable = driver.findElement(By.cssSelector("#input-example > button"));
        enable.click();
        Thread.sleep(3000);

        WebElement textField = driver.findElement(By.cssSelector(""));
        boolean result = textField.isEnabled();

        System.out.println("Enable Test");
        if(result== true){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }

        Thread.sleep(2000);
        driver.quit();


    }
}
