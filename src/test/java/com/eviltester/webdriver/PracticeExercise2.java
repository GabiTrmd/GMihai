        /* Practice Exercise – 2

        Launch a new Chrome browser.
        Open http://demoqa.com/frames-and-windows/
        Use this statement to click on a New Window button “driver.findElement(By.xpath(“.//*[@id=’tabs-1′]/div/p/a”)).click();”
        Close the browser using close() command
        You will notice that only one window will close. Next time use quit() command instead of close().
        At that time selenium will close both the windows. */

package com.eviltester.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeExercise2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demoqa.com/frames-and-windows/");
        driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
        driver.close();
    }
}