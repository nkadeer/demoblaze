package com.demoblaze.caruosal_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class TestCase5 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void rightArrowTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement activeImage1 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src1 = activeImage1.getAttribute("src");
        System.out.println(src1);

        WebElement rightArrowLink = driver.findElement(By.cssSelector("a.carousel-control-next"));
        rightArrowLink.click();
        Thread.sleep(1000);

        WebElement activeImage2 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src2 = activeImage2.getAttribute("src");
        System.out.println(src2);
        Thread.sleep(1000);

        WebElement leftArrowLink = driver.findElement(By.cssSelector("a.carousel-control-prev"));
        leftArrowLink.click();
        Thread.sleep(1000);

        WebElement activeImage3 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src3 = activeImage3.getAttribute("src");
        System.out.println(src3);
        Thread.sleep(1000);

        if (!Objects.equals(src1, src2) && Objects.equals(src1, src3)) {
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }







        driver.quit();
    }
}
