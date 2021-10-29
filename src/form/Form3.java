package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:src\\form\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
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



        fName.sendKeys("Nijiat");
        lName.sendKeys("Kader");
        phone.sendKeys("1234567");
        country.sendKeys("USA");
        city.sendKeys("Cincinnati");
        email.sendKeys("mk@gamil.com");
        gender.click();
        available_day.click();
        Select dropdown = new Select(available_time);
        dropdown.selectByVisibleText("Morning");
        file.sendKeys("C:\\Users\\nkade\\IdeaProjects\\test_automation_assignment\\src\\form\\my-image.jpg");


        Thread.sleep(5000);
        driver.quit();


    }
}
