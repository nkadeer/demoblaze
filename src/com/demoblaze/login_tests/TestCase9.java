package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase9 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void loginWithValidCredential() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement loginLink = driver.findElement(By.cssSelector(""));
        loginLink.click();
        Thread.sleep(1000);

        WebElement userName_textField = driver.findElement(By.cssSelector("#loginusername"));
        WebElement password_textField = driver.findElement(By.cssSelector("#loginpassword"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[onclick='logIn()']"));

        userName_textField.sendKeys("lalala");
        password_textField.sendKeys("loginpassword");
        loginButton.click();

        WebElement productElement = driver.findElement(By.cssSelector("a[class='navbar-brand']"));
        String text = productElement.getText();
        System.out.println(text);

        //verifying test
        if(text.contains("PRODUCT STORE")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }



        driver.quit();
    }
}
