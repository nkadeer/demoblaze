package com.demoblaze.shopping_carttests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_ShoppingCartPlaceOrder {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void placeOrderTest() throws InterruptedException {

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

        WebElement placeOrderButton = driver.findElement(By.cssSelector("button[class=\"btn btn-success\"]"));
        placeOrderButton.click();

        WebElement name_Field = driver.findElement(By.cssSelector("#name"));
        name_Field.sendKeys("Asim");

        WebElement countryName_Field = driver.findElement(By.cssSelector("#country"));
        countryName_Field.sendKeys("USA");

        WebElement cityName_Field = driver.findElement(By.cssSelector("#city"));
        cityName_Field.sendKeys("Cincinnati");

        WebElement creditCart_Field = driver.findElement(By.cssSelector("#card"));
        creditCart_Field.sendKeys("123456");

        WebElement cardExpriation_Field = driver.findElement(By.cssSelector("#month"));
        cardExpriation_Field.sendKeys("October");

        WebElement cardYear_Field = driver.findElement(By.cssSelector("#year"));
        cardYear_Field.sendKeys("2021");

        WebElement purchase_Button = driver.findElement(By.cssSelector("button[onclick='purchaseOrder()']"));
        purchase_Button.click();


        driver.quit();









        driver.quit();
    }
}
