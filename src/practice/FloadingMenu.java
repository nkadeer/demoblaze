package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FloadingMenu {


    static String chromeDriver_path= "C:src\\form\\chromedriver.exe";
    static final String URL = "https://the-internet.herokuapp.com/floating_menu";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        Thread.sleep(2000);
        //Selenium doesn't have scrolling functionality, but selenium has the functionality to execute javascript code.

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for(int i = 0; i<10; i++)
            Thread.sleep(500);
        js.executeScript("window.scrollBy(0,350)", "");

        //verify floating menu.
        WebElement contactMenu = driver.findElement(By.cssSelector(""));
        boolean displayed = contactMenu.isDisplayed();
        if(displayed == true){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


        //using for loop slowly scrolling down browser page.

        for(int i = 10; i< 0; i--) {
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0,-350)", "");
        }

        //where do you use JS? using for highlight and scrolling page vertically or horizontally.

        Thread.sleep(5000);
        driver.quit();


    }
}
