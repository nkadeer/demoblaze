package com.demoblaze.shopping_carttests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestCase_ShoppingCartAdds {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void shoppingCartAddItemTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        Thread.sleep(2000);


        WebElement addedItem = driver.findElement(By.cssSelector("#tbodyid > div:nth-child(1) > div > a > img"));
        addedItem.click();
        Thread.sleep(1000);

        WebElement addCartButton = driver.findElement(By.cssSelector("a[class='btn btn-success btn-lg']"));
        addCartButton.click();

        driver.switchTo().alert().accept();

        WebElement cartLink = driver.findElement(By.cssSelector("#cartur"));
        cartLink.click();

        WebElement addedItemElement = driver.findElement(By.cssSelector("tr[class='success']"));
        boolean displayed = addedItemElement.isDisplayed();

        if(displayed){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


        driver.quit();















        driver.quit();
    }
}
