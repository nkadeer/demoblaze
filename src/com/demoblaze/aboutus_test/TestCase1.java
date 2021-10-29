package com.demoblaze.aboutus_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void aboutUsTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement aboutUsElement = driver.findElement(By.cssSelector("a[data-target='#videoModal']"));
        aboutUsElement.click();
        Thread.sleep(500);

        WebElement playButtonTest = driver.findElement(By.cssSelector("button[title='Play Video']"));
        playButtonTest.click();
        Thread.sleep(1000);

        WebElement videoElement = driver.findElement(By.cssSelector("#videoModal > div > div"));
        boolean displayed = videoElement.isDisplayed();
        if(displayed==true){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


        driver.quit();
    }
}
