package com.cydeo.test.shorts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P19_SoftAssertionVsHardAssertion {

    @Test
    public void hardAssertionTest(){
        System.out.println("This is hard assertion");
        Assert.assertEquals("apple", "app");
        System.out.println("after HARD assertion");

    }

    @Test
    public void softAssertionTest(){
        System.out.println("This is soft assertion");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple", "app");
        System.out.println("After SOFT assertion");

    }
}
