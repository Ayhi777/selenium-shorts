package com.cydeo.test.shorts;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class P25_JavaFaker {

    @Test
    public void javaFakerTest(){

        Faker faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

    }



}
