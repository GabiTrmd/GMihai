        /* Practice Exercise - 4

        Launch new Browser
        Open URL http://toolsqa.com/automation-practice-form/
        Type Name & Last Name (Use Name locator)
        Click on Submit button (Use ID locator) */

package com.eviltester.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PracticeExercise4 {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch the ToolsQA WebSite
        driver.get("http://toolsqa.com/Automation-practice-form/");

        // Type Name in the FirstName text box
        driver.findElement(By.name("firstname")).sendKeys("Lakshay");

        //Type LastName in the LastName text box
        driver.findElement(By.name("lastname")).sendKeys("Sharma");

        // Click on the Submit button
        driver.findElement(By.id("submit")).click();
    }
}