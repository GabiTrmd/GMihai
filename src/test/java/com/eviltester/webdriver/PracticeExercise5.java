        /* Practice Exercise - 5

        Launch new Browser
        Open URL http://toolsqa.com/automation-practice-form/
        Click on the Link “Partial Link Test” (Use ‘patialLinkTest’ locator and search by ‘Partial’ word)
        Identify Submit button with ‘tagName’, convert it in to string and print it on the console
        Click on the Link “Link Test” (Use ‘linkTest’ locator) */

package com.eviltester.webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PracticeExercise5 {
    public static void main(String[] args) {
        // Create a new instance of the Chrome driver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Launch the Online Store WebSite
        driver.get("http://toolsqa.com/Automation-practice-form/");

        // Click on "Partial Link Text" link
        driver.findElement(By.partialLinkText("Partial")).click();
        System.out.println("Partial Link Test Pass");

        // Convert element in to a string
        String sClass = driver.findElements(By.tagName("button")).toString();
        System.out.println(sClass);

        // Click on "Link Text" link
        driver.findElement(By.linkText("Link Test")).click();
        System.out.println("Link Test Pass");
    }
}