package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase7 {
    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void loginWindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement loginButton_Element = driver.findElement(By.tagName("#login2"));
        loginButton_Element.click();
        Thread.sleep(1000);

        WebElement loginDisplayed = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-body"));
        boolean displayed = loginDisplayed.isDisplayed();

        if(displayed == true){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }

        WebElement closeButton = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-secondary"));
        closeButton.click();
        Thread.sleep(1000);

         boolean displayed1 = loginDisplayed.isDisplayed();
         if(displayed1 == false){
             System.out.println("test passed");
         }else{
             System.out.println("test failed");
         }


        Thread.sleep(1000);
        driver.quit();


    }

}
