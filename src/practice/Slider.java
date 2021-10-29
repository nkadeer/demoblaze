package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {


    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/horizontal_slider";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement slider = driver.findElement(By.cssSelector("#content > div > div > input[type=range]"));
        slider.click();

        //using action class.
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, 30,0);

        //verification point.
        Thread.sleep(500);
        WebElement slideLevel = driver.findElement(By.cssSelector("#range"));
        String text = slideLevel.getText();

        System.out.println(text);
        if(!text.equals("0")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        Thread.sleep(3000);
        driver.quit();


    }
}
