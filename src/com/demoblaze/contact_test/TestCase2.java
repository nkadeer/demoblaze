package com.demoblaze.contact_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    static String chromeDriver_path = "C:src\\com\\demoblaze\\driver\\chromedriver.exe";
    static final String URL = "https://www.demoblaze.com/";

    public static void contactTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", chromeDriver_path);
        WebDriver driver = new ChromeDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement contactElement = driver.findElement(By.cssSelector("a[data-target='#exampleModal']"));
        contactElement.click();
        Thread.sleep(500);

        WebElement emailTextField = driver.findElement(By.cssSelector("#recipient-email"));
        emailTextField.sendKeys("nk@gamail.com");

        WebElement contactNameTextField = driver.findElement(By.cssSelector("#recipient-name"));
        contactNameTextField.sendKeys("Moaz");

        WebElement massageTextField = driver.findElement(By.cssSelector("#message-text"));
        massageTextField.sendKeys("Hallo Hallo");

        WebElement sendMassageElement = driver.findElement(By.cssSelector("button[onclick='send()']"));
        sendMassageElement.click();

        Thread.sleep(1000);

        String text = driver.switchTo().alert().getText();
        if(text.equals("Thanks for the message!!")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }


        driver.quit();
    }
}
