package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase6 {
    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void signuppopupDisplayed() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement signUpButton = driver.findElement(By.tagName("#signin2"));
        signUpButton.click();
        Thread.sleep(1000);

        WebElement signInDisplayed = driver.findElement(By.cssSelector("#signInModal > div > div"));
        boolean displayed = signInDisplayed.isDisplayed();

        if(displayed == true){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        WebElement randomPlaceElement = driver.findElement(By.cssSelector("#logInModal"));
        randomPlaceElement.click();
        Thread.sleep(1000);

         boolean displayed1 = signInDisplayed.isDisplayed();
         if(displayed1 == false){
             System.out.println("test passed");
         }else{
             System.out.println("test failed");
         }


        Thread.sleep(1000);
        driver.quit();


    }

}
