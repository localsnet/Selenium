package com.gmail.email;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {
    private static ChromeDriver driver;
    WebElement element;

    @BeforeClass
    public static void openBrowser(){

        ChromeOptions ChromeOptions = new ChromeOptions();
        ChromeOptions.addArguments("--headless", "window-size=1024,768", "--no-sandbox");
        driver = new ChromeDriver(ChromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test // Marking this method as part of the test
    public void gotoHelloWorldPage() {
        // Go to the Hello World home page
        driver.get("http://172.26.24.141:48080/helloworld/");

        // Get text from heading of the Hello World page
        String header = driver.findElement(By.tagName("h2")).getText();
        // Verify that header equals "Hello World!"
        Assert.assertEquals(header, "Hello World!");

    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }
}