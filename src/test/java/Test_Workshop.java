import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Workshop {

    @Test
    public void Test1() throws InterruptedException {
        // Create Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        // Wait
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(15));

        // Go to Apple website
        webDriver.get("https://www.apple.com/");

        // Assign locator
        By iphoneLinkLocator = By.className("ac-gn-link-iphone");

        // Wait iphoneLink to present
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.className("ac-gn-link-iphone")));

        // Find iphoneLink
        WebElement iphoneLink = webDriver.findElement(By.className("ac-gn-link-iphone"));

        // Click iphoneLink
        iphoneLink.click();

        // Find iphone14ProLink
        WebElement iphone14ProLink = webDriver.findElement(By.className("chapternav-item-iphone-14-pro"));

        // Click iphone14ProLink
        iphone14ProLink.click();

        // Find iphone14ProLink
        WebElement iphone14ProOrderButton = webDriver.findElement(By.className("ac-ln-action-button"));

        // Click iphone14ProOrderButton
        iphone14ProOrderButton.click();

        // sleep 5 sec
        Thread.sleep(5000);

        // Quit Chrome
        //       webDriver.quit();

    }
}
