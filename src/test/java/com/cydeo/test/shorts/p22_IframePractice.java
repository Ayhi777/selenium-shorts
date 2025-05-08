package com.cydeo.test.shorts;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class p22_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethotd() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void iframeTest(){
        driver.get("https://practice.cydeo.com/iframe");

        //using index number iframe from HTML "Inspect" Using "CTRL+F" and type "//ifrime"
        driver.switchTo().frame(0);

        WebElement textArea = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(textArea.isDisplayed());

    }

}
