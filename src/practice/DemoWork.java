package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoWork {

       //instantiate chrome driver directory and browser URL

        static String chromedriver = "C:src\\form\\chromedriver.exe";
        static final String URL = "https://testsheepnz.github.io/BasicCalculator.html";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", chromedriver);
            ChromeDriver driver = new ChromeDriver();

            driver.get(URL);
            driver.manage().window().maximize();

            WebElement firstNum = driver.findElement(By.cssSelector("#number1Field"));
            WebElement secondNum = driver.findElement(By.cssSelector("#number2Field"));
            WebElement calculateButton = driver.findElement(By.cssSelector("#calculateButton"));

            firstNum.sendKeys("100");
            secondNum.sendKeys("30");

            WebElement parent = driver.findElement(By.cssSelector("#selectOperationDropdown"));
            List<WebElement> childs = parent.findElements(By.tagName("option"));

            for (WebElement i : childs) {
                i.click();
                Thread.sleep(1000);
                calculateButton.click();
                Thread.sleep(2000);
            }

            driver.quit();
        }

    }





