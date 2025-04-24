package com.cydeo.test.shorts;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P13_RadioButtons {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadio = driver.findElement(By.xpath("//input[@id='blue']"));
        System.out.println("blueRadio.isSelected() = " + blueRadio.isSelected());

        WebElement redRadio = driver.findElement(By.xpath("//input[@id='red']"));
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        redRadio.click();


    }
}
