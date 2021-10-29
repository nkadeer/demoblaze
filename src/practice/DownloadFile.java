package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DownloadFile {


    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/download";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement parentElement = driver.findElement(By.cssSelector("#content > div"));
        List<WebElement> webElementList = parentElement.findElements(By.tagName("a"));

        //for each loop(Advances loop)
        for(WebElement i : webElementList){
            String text = i.getText();
            System.out.println(text);

            if(i.getText().equals("APITest.java")){
                i.click();
                break;
            }
        }

        Thread.sleep(3000);
        driver.quit();


    }
}
