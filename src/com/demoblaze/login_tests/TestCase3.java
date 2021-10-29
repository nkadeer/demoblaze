package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void loginModalWindowDisplayedTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement loginButton = driver.findElement(By.cssSelector("#login2"));
        loginButton.click();
        Thread.sleep(2000);

        WebElement modalWindow = driver.findElement(By.cssSelector("#logInModal > div > div"));
        boolean displayed = modalWindow.isDisplayed();

        if (displayed == true) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        driver.quit();
    }
}
