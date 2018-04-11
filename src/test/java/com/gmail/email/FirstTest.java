package com.gmail.email;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class FirstTest {
    private static RemoteWebDriver driver;

    @BeforeClass
    public static void openBrowser() throws MalformedURLException {

        driver = new RemoteWebDriver(
                new URL(System.getProperty("browser_host")),
                DesiredCapabilities.firefox());
    }

    @Test // Marking this method as part of the test
    public void gotoHelloWorldPage() {
        // Go to the Hello World home page
        driver.get(System.getProperty("app_host"));

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
