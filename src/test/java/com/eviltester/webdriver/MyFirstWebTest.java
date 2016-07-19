package com.eviltester.webdriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebTest {

    @Test
    public void startWebDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://seleniumsimplified.com");
        Thread.sleep(5000);
        driver.navigate().to("http://seleniumsimplified.com/training/");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().back();
        Assert.assertTrue("title Should start with Selenium Simplified",
                driver.getTitle().startsWith("Selenium Simplified"));
        driver.close();
        driver.quit();

    }
}
