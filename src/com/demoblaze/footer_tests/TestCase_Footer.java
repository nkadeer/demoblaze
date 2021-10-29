package com.demoblaze.footer_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_Footer {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void footerVerificationTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement footerElement = driver.findElement(By.cssSelector("div[id=\"fotcont\"]"));
        boolean displayed = footerElement.isDisplayed();
        System.out.println(displayed);
        Thread.sleep(1000);

        if(displayed == true){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


        Thread.sleep(500);




        driver.quit();
    }
}
