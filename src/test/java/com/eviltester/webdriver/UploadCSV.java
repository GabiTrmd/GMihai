package com.eviltester.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class UploadCSV {
    public static void main(String[] args) throws InterruptedException, IOException {
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
        driver.findElement(By.xpath("//*[@href=''][text()='Import Multiple']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@href=''][text()='or click here']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='upload']")).sendKeys("C:\\Users\\gmihai\\Desktop\\csv.csv");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='fileSubmit']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//MD-ICON[@aria-label='Close dialog']")).click();
        // driver.close();
    }
}