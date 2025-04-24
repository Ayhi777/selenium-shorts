package com.cydeo.test.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_cssSelector {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        WebElement cssSelector = driver.findElement(By.cssSelector("a[class='nav-link']"));

        if (cssSelector.getText().equals("Home")){
            System.out.println("Text Home link passed");
        }else
            System.out.println("Text is failed");

    }
}
