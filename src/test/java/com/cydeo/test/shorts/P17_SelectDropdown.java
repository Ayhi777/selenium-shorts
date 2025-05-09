package com.cydeo.test.shorts;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P17_SelectDropdown {
    WebDriver driver;

@BeforeMethod
    public void setUpMethotd(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@Test
    public void selectDropdownTest(){
    driver.get("https://practice.cydeo.com/dropdown");

    Select sippleSelect = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

    sippleSelect.selectByVisibleText("Option 2");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

}
