package com.eviltester.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteFromInventory {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://stage.thefoodexchangealpha.appspot.com/clip/index.html#/home");
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@class='menuItem basketItem']")).click();
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/md-toolbar/div/div/div[2]/div[2]/form/input[1]")).sendKeys("gabivendor1@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/md-toolbar/div/div/div[2]/div[2]/form/input[2]")).sendKeys("Password1!");
        driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/md-toolbar/div/div/div[2]/div[2]/form/input[6]")).click();
        driver.navigate().to("http://stage.thefoodexchangealpha.appspot.com/clip/index.html#/vendor/manage-inventory");
        Thread.sleep(2000);
        for(int i=0; i<999; i++) {
            driver.findElement(By.xpath("//*[@class='md-container'][1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@md-font-set='ss-icon ss-trash']")).click();
            Thread.sleep(2000);
        }
        // driver.close();
    }
}