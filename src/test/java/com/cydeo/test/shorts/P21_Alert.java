package com.cydeo.test.shorts;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P21_Alert {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void jsAlertTest() throws InterruptedException {
        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement jsAlertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        jsAlertBtn.click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();

        alert.accept();
    }

}