package homework_10_26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {


    static String chromeDriver_path = "C:src\\form\\chromedriver.exe";
    static final String URL = "https://testsheepnz.github.io/BasicCalculator.html";


    public static void main(String[] args) throws InterruptedException {

        addTest();
        subtractTest();
        multiTest();
        divideTest();
        concatenateTest();
    }

    public static void addTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement fNumber = driver.findElement(By.cssSelector("#number1Field"));
        WebElement sNumber = driver.findElement(By.cssSelector("#number2Field"));
        WebElement calcBtn = driver.findElement(By.cssSelector("#calculateButton"));

        WebElement clearBtn = driver.findElement(By.cssSelector("#clearButton"));

        fNumber.sendKeys("10");
        sNumber.sendKeys("20");
        calcBtn.click();

        Thread.sleep(2000);

        WebElement answer_textField = driver.findElement(By.cssSelector("#numberAnswerField"));
        String value = answer_textField.getAttribute("value");

        if (value.equals("30")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        Thread.sleep(3000);
        driver.quit();
    }

    public static void subtractTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement fNumber = driver.findElement(By.cssSelector("#number1Field"));
        WebElement sNumber = driver.findElement(By.cssSelector("#number2Field"));
        WebElement operation = driver.findElement(By.cssSelector("#selectOperationDropdown > option:nth-child(2)"));
        WebElement cul_result = driver.findElement(By.cssSelector("#calculateButton"));


        fNumber.sendKeys("10");
        sNumber.sendKeys("20");
        operation.click();
        cul_result.click();

        Thread.sleep(2000);
        WebElement answer_textField = driver.findElement(By.cssSelector("#numberAnswerField"));
        String value = answer_textField.getAttribute("value");

        if (value.equals("-10")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }


        Thread.sleep(3000);
        driver.quit();
    }

    public static void multiTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement fNumber = driver.findElement(By.cssSelector("#number1Field"));
        WebElement sNumber = driver.findElement(By.cssSelector("#number2Field"));
        WebElement operation = driver.findElement(By.cssSelector("#selectOperationDropdown > option:nth-child(3)"));
        WebElement cul_result = driver.findElement(By.cssSelector("#calculateButton"));


        fNumber.sendKeys("10");
        sNumber.sendKeys("20");
        operation.click();
        cul_result.click();

        Thread.sleep(2000);

        WebElement answer_textField = driver.findElement(By.cssSelector("#numberAnswerField"));
        String value = answer_textField.getAttribute("value");

        if (value.equals("200")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        Thread.sleep(3000);
        driver.quit();

    }

    public static void divideTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement fNumber = driver.findElement(By.cssSelector("#number1Field"));
        WebElement sNumber = driver.findElement(By.cssSelector("#number2Field"));
        WebElement operation = driver.findElement(By.cssSelector("#selectOperationDropdown > option:nth-child(4)"));
        WebElement cul_result = driver.findElement(By.cssSelector("#calculateButton"));


        fNumber.sendKeys("10");
        sNumber.sendKeys("20");
        operation.click();
        cul_result.click();

        Thread.sleep(2000);

        WebElement answer_textField = driver.findElement(By.cssSelector("#numberAnswerField"));
        String value = answer_textField.getAttribute("value");

        if (value.equals(".5")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        Thread.sleep(3000);
        driver.quit();


    }

    public static void concatenateTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        WebElement fNumber = driver.findElement(By.cssSelector("#number1Field"));
        WebElement sNumber = driver.findElement(By.cssSelector("#number2Field"));
        WebElement operation = driver.findElement(By.cssSelector("#selectOperationDropdown > option:nth-child(5)"));
        WebElement cul_result = driver.findElement(By.cssSelector("#calculateButton"));

        fNumber.sendKeys("10");
        sNumber.sendKeys("20");
        operation.click();
        cul_result.click();

        Thread.sleep(2000);

        WebElement answer_textField = driver.findElement(By.cssSelector("#numberAnswerField"));
        String value = answer_textField.getAttribute("value");

        if (value.equals("1020")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        Thread.sleep(3000);
        driver.quit();


    }


}
