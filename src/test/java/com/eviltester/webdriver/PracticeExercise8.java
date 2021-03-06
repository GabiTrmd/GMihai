        /* Practice Exercise - 8

        Launch new Browser
        Open URL “http://toolsqa.com/automation-practice-table/”
        Get the value from cell ‘Dubai’ and print it on the console
        Click on the link ‘Detail’ of the first row and last column */

package com.eviltester.webdriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PracticeExercise8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/automation-practice-table");

        //Here we are storing the value from the cell in to the string variable
        String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(sCellValue);

        // Here we are clicking on the link of first row and the last column
        driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();
        System.out.println("Link has been clicked otherwise an exception would have thrown");
        driver.close();
    }
}