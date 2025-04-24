package com.cydeo.test.shorts;

import com.cydeo.test.utilites.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P14_CheckBox {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.id("box1"));
        System.out.println("Box1.isSelected() = " + checkBox1.isSelected());

        checkBox1.click();
        System.out.println("After click Box1.isSelected() = " + checkBox1.isSelected());

        System.out.println("checkBox1 is enable = " + checkBox1.isEnabled());

    }

}
