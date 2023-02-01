package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class selectElementFromDropDownList {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/");
        WebElement menu = driver.findElement(By.linkText("Menu"));
        menu.click();
        sleep(1);
        WebElement elec = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
        elec.click();
        Select select = new Select(elec);
        select.selectByVisibleText("Pop");
        driver.close();

    }

    public static void  sleep(int seconds)
    {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
