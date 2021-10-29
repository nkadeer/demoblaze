package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void appLoadTest(){

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement bodyElement = driver.findElement(By.cssSelector("body"));
        boolean displayed = bodyElement.isDisplayed();

        if (displayed == true) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        driver.quit();
    }


}
