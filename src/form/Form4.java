package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:src\\form\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement fName = driver.findElement(By.cssSelector("#RESULT_TextField-1"));
        WebElement lName = driver.findElement(By.cssSelector("#RESULT_TextField-2"));
        WebElement phone = driver.findElement(By.cssSelector("#RESULT_TextField-3"));
        WebElement country = driver.findElement(By.cssSelector("#RESULT_TextField-4"));
        WebElement city= driver.findElement(By.cssSelector("#RESULT_TextField-5"));
        WebElement email = driver.findElement(By.cssSelector("#RESULT_TextField-6"));
        WebElement gender = driver.findElement(By.cssSelector("#q26 > table > tbody > tr:nth-child(1) > td > label"));
        WebElement available_day = driver.findElement(By.cssSelector("#q15 > table > tbody > tr:nth-child(3) > td > label"));
        WebElement available_time = driver.findElement(By.cssSelector("#RESULT_RadioButton-9"));
        WebElement file = driver.findElement(By.cssSelector("#RESULT_FileUpload-10"));
        
    }
}
