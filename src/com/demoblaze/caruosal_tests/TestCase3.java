package com.demoblaze.caruosal_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class TestCase3 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void carouselImage_Test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement activeImage1 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src1 = activeImage1.getAttribute("src");
        System.out.println(src1);
        Thread.sleep(5000);

        WebElement activeImage2 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src2 = activeImage2.getAttribute("src");
        System.out.println(src2);
        Thread.sleep(5000);

        WebElement activeImage3 = driver.findElement(By.cssSelector("div.carousel-item.active>img"));
        String src3 = activeImage3.getAttribute("src");
        System.out.println(src3);
        Thread.sleep(5000);

        if(!Objects.equals(src1, src2) && !Objects.equals(src2, src3) && !Objects.equals(src1, src3)){
            System.out.println("test passed");

        }else{
            System.out.println("test failed");
        }



        driver.quit();
    }
}
