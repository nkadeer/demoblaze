package com.demoblaze.login_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void headerLinksDisplayedTest(){

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement headerlinksParent = driver.findElement(By.cssSelector("ul.navbar-nav.ml-auto"));
        boolean displayed = headerlinksParent.isDisplayed();

        if (displayed == true) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
        driver.quit();
    }
}
