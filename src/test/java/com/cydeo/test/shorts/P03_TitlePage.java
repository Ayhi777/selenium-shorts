package com.cydeo.test.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_TitlePage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cydeo.com");

        System.out.println(driver.getTitle());

        if (driver.getTitle().equals("Cydeo")){
            System.out.println("Title is passed");
        }else{
            System.out.println("Title is failed");
        }

    }
}
