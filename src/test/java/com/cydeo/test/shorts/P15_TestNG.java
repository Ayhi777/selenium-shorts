package com.cydeo.test.shorts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class P15_TestNG {

    @Test
    public void twoPlusFive(){
        Assert.assertEquals(2+5, 7);

    }

    @Test
    public void testApple(){
        Assert.assertEquals("apple", "apple");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before M. is runing");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After M runing");
    }

}
