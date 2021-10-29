package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:src\\form\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();

        WebElement fName = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(1) > td:nth-child(2) > input[type=text]"));
        WebElement lName = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(2) > td:nth-child(2) > input[type=text]"));
        WebElement sex = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(3) > td:nth-child(2) > input[type=radio]:nth-child(2)"));
        WebElement profession_checkbox = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(6) > td:nth-child(2) > span:nth-child(2) > input[type=checkbox]"));
        WebElement profile = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(7) > td:nth-child(2) > input[type=file]"));
        WebElement selenium = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(8) > td:nth-child(2) > span:nth-child(3) > input[type=checkbox]"));
        WebElement experience = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(4) > td:nth-child(2) > span:nth-child(5) > input[type=radio]"));
        WebElement date = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(5) > td:nth-child(2) > input[type=text]"));
        WebElement continent_dropdown = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > select"));
        WebElement selenium_command = driver.findElement(By.cssSelector("body > div.mui-container-fluid.content > div > div.mui-col-md-6.tutorial-content > div:nth-child(7) > div > form > table > tbody > tr:nth-child(10) > td:nth-child(2) > select > option:nth-child(1)"));



        Thread.sleep(3000);



        fName.sendKeys("Ilzat");
        lName.sendKeys("Absamat");
        sex.click();
        profession_checkbox.click();
        profile.sendKeys("C:\\Users\\nkade\\IdeaProjects\\test_automation_assignment\\src\\form\\my-image.jpg");
        selenium.click();
        experience.click();
        date.sendKeys("10/26/2018");
        Select dropdown = new Select(continent_dropdown);
        dropdown.selectByVisibleText("South America");
        selenium_command.click();



        Thread.sleep(2000);
        driver.quit();
    }

}

