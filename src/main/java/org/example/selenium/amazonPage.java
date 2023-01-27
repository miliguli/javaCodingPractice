package org.example.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.util.concurrent.TimeUnit;

public class amazonPage {
    static WebDriver driver;


    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("https://www.medpace.com/");

        WebElement aboutMenuButton = driver.findElement(By.id("menu-item-60"));
        waitForElement(driver,aboutMenuButton);
        aboutMenuButton.click();
        WebElement overviewMenuButton = driver.findElement(By.xpath("//*[@id=\"menu-item-10050\"]"));
        overviewMenuButton.click();
        WebElement ourMissionLinkText = driver.findElement(By.linkText("Our Mission"));
        ourMissionLinkText.click();
        driver.close();


    }

    public static void waitForElement(WebDriver driver, WebElement element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
