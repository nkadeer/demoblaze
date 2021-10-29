package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:src\\form\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();


        WebElement fName = driver.findElement(By.cssSelector("#post-body-3077692503353518311 > div:nth-child(1) > div > div:nth-child(3) > input[type=text]"));
        WebElement lName = driver.findElement(By.cssSelector("#post-body-3077692503353518311 > div:nth-child(1) > div > div:nth-child(6) > input[type=text]"));
        WebElement male = driver.findElement(By.cssSelector("#sex-0"));
        WebElement Year_of_experience = driver.findElement(By.cssSelector("#exp-4"));
        WebElement profession = driver.findElement(By.cssSelector("#profession-0"));
        WebElement Automation_tools = driver.findElement(By.cssSelector("#tool-2"));
        WebElement continent_dropdown = driver.findElement(By.cssSelector("#continents"));
        WebElement selenium_command = driver.findElement(By.cssSelector("#selenium_commands"));
        WebElement image_upload = driver.findElement(By.cssSelector("#photo"));

        WebElement ok_btn = driver.findElement(By.cssSelector("#submit"));



        fName.sendKeys("Moaz");
        lName.sendKeys("Asim");
        male.click();
        Year_of_experience.click();
        profession.click();
        Automation_tools.click();

        Select dropdown = new Select(continent_dropdown);
        dropdown.selectByVisibleText("Europe");

        Select dropdown1 = new Select(selenium_command);
        dropdown1.selectByVisibleText("Browser Commands");
        image_upload.sendKeys("C:\\Users\\nkade\\IdeaProjects\\test_automation_assignment\\src\\form\\my-image.jpg");


        Thread.sleep(5000);

        WebElement h1_header = driver.findElement(By.cssSelector("#Header1 > div > div > h1"));
        String text = h1_header.getText();

        System.out.println(text);

        if (text.equals("\n" + "Techlistic"))
            System.out.println("Test passed");
        else {
            System.out.println("Test failed");
        }

        driver.quit();




    }
}
