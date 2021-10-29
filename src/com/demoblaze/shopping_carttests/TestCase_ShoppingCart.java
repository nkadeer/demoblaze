package com.demoblaze.shopping_carttests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_ShoppingCart {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void shoppingCartTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement cartLink = driver.findElement(By.cssSelector("#cartur"));
        cartLink.click();

        Thread.sleep(2000);

        WebElement h2Element = driver.findElement(By.cssSelector("#page-wrapper > div > div.col-lg-8 > h2"));
        String text = h2Element.getText();

        if (text.equals("Products")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }


        driver.quit();









        driver.quit();
    }
}
