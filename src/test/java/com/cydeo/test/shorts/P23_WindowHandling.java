package com.cydeo.test.shorts;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P23_WindowHandling {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethotd() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void windowHandlingTest(){
        driver.get("https://practice.cydeo.com/windows");
        String currentWindow = driver.getWindowHandle();
        System.out.println("currentWindow = " + currentWindow);

        driver.findElement(By.linkText("Click Here")).click();

    }

}