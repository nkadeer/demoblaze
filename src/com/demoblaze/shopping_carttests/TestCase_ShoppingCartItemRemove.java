package com.demoblaze.shopping_carttests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_ShoppingCartItemRemove {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void removeItemTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement item = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > a > img"));
        item.click();

        Thread.sleep(2000);

        WebElement addToCartButton = driver.findElement(By.cssSelector("#tbodyid > div.row > div > a"));
        addToCartButton.click();

        Thread.sleep(500);

        driver.switchTo().alert().accept();

        WebElement cartLink = driver.findElement(By.cssSelector("#cartur"));
        cartLink.click();
        Thread.sleep(2000);

        WebElement deleteButton = driver.findElement(By.cssSelector("#tbodyid > tr > td:nth-child(4) > a"));
        deleteButton.click();
        Thread.sleep(2000);

        try {
            driver.findElement(By.cssSelector("tbody>tr"));
        } catch (Exception e) {
            System.out.println("test passed");
        } finally {
            driver.quit();
        }

        driver.quit();









        driver.quit();
    }
}
