package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase9 {
    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void loginCredentials() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement loginButton_Element = driver.findElement(By.tagName("#login2"));
        loginButton_Element.click();
        Thread.sleep(1000);

        WebElement username_TextField = driver.findElement(By.cssSelector("#loginusername"));
        username_TextField.sendKeys("Moaz");

        WebElement password_TextField = driver.findElement(By.cssSelector("#loginpassword"));
        password_TextField.sendKeys("123456");

        WebElement login_Button = driver.findElement(By.cssSelector("button[onclick='logIn()']"));
        login_Button.click();

        WebElement welcomeElement = driver.findElement(By.cssSelector("#content > div > h4"));
        String text = welcomeElement.getText();

        driver.switchTo().alert().accept();


        if(text.contains("Welcome")){
            System.out.println("the login test passed");
        }else{
            System.out.println("the login test failed");
        }
        Thread.sleep(1000);




    }

}


