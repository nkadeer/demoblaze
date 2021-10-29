package com.demoblaze.shopping_carttests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCase_ShoppingCartColumns {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void shoppingCartColumnsTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement cartLink = driver.findElement(By.cssSelector("#cartur"));
        cartLink.click();

        Thread.sleep(2000);

        List<WebElement> columns = driver.findElements(By.cssSelector("tr > th"));

        String column1 = columns.get(0).getText();
        String column2 = columns.get(1).getText();
        String column3 = columns.get(2).getText();
        String column4 = columns.get(3).getText();

        if (column1.equals("Pic") && column2.equals("Title") && column3.equals("Price") && column4.equals("x")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        driver.quit();















        driver.quit();
    }
}
