package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void loginModalWindowDisappearsTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement modalWindow = driver.findElement(By.cssSelector("#logInModal > div > div"));
        boolean displayed = modalWindow.isDisplayed();

        if (displayed == true) {
            System.out.println("pop is displayed");
        } else {
            System.out.println("pop is not displayed");
        }

        WebElement randomElement = driver.findElement(By.cssSelector("div[aria-labelledby='logInModalLabel']"));
        randomElement.click();

        Thread.sleep(500);
        WebElement modalWindowAfterDisappear = driver.findElement(By.cssSelector("#logInModal > div > div"));
        boolean displayed1 = modalWindowAfterDisappear.isDisplayed();

        if (displayed1 == false) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }

        driver.quit();
    }
}

