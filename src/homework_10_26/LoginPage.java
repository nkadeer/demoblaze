package homework_10_26;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement userName_textField = driver.findElement(By.cssSelector("#username"));
        WebElement password_textField = driver.findElement(By.cssSelector("#password"));
        WebElement login_Button = driver.findElement(By.cssSelector("#login > button > i"));

        userName_textField.sendKeys("tomsmith");
        password_textField.sendKeys("SuperSecretPassword!");
        login_Button.click();

        WebElement headElement = driver.findElement(By.cssSelector("#content > div > h4"));
        String text1 = headElement.getText();
        System.out.println(text1);

        if(text1.contains("Welcome")){
            System.out.println("the login test passed");
        }else{
            System.out.println("the login test failed");
        }
        Thread.sleep(1000);

        WebElement logout_Button = driver.findElement(By.cssSelector("#content > div > a > i"));
        logout_Button.click();

        Thread.sleep(500);

        WebElement logout_Massage = driver.findElement(By.cssSelector("#flash"));
        String text2 = logout_Massage.getText();
        System.out.println(text2);

        if(text2.contains("secure")){
            System.out.println("the logout test passed");
        }else{
            System.out.println("the logout test failed");
        }


        Thread.sleep(2000);
        driver.quit();


    }
}
