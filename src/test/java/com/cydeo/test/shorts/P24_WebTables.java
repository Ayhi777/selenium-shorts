package com.cydeo.test.shorts;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P24_WebTables {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethotd() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void webTableTest(){
        driver.get("https://practice.cydeo.com/tables");

        WebElement Jason = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("Jason.getText() = " + Jason.getText());
    }

}
