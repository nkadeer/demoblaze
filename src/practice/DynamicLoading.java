package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLoading {
    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/dynamic_loading";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement loading = driver.findElement(By.cssSelector("#content > div > a:nth-child(5)"));
        loading.click();
        Thread.sleep(3000);

        WebElement start = driver.findElement(By.cssSelector("#start > button"));
        start.click();
        Thread.sleep(5000);
        WebElement h1Tag = driver.findElement(By.cssSelector("#finish > h4"));
        boolean displayed = start.isDisplayed();


        System.out.println("dynamic Loading Test1");
        if(displayed== true){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }

        System.out.println("===========================");


        WebElement  loading1 = driver.findElement(By.cssSelector("#content > div > a:nth-child(8)"));
        loading.click();
        Thread.sleep(3000);

        WebElement start1 = driver.findElement(By.cssSelector("#start > button"));
        start1.click();
        Thread.sleep(8000);

        WebElement h1Tag1 = driver.findElement(By.cssSelector("#finish > h4"));
        boolean displayed1= start1.isDisplayed();

        System.out.println("Dynamic Loading Test2");
        if(displayed1 == true){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }

        Thread.sleep(2000);
        driver.quit();


    }
}
