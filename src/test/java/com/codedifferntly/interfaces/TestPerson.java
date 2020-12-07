package com.codedifferntly.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void constructorTest(){
        //Given
        String name = "Demarcus";
        Long id = 5555L;

        //When
       Person person = new Person(2222L, "Demarcus");
        String actualName = person.getName();
        String expectedName = "Demarcus";

        Long actualId = person.getId();
        Long expectedId = 5555L;

        //Then
        Assert.assertEquals(actualName, expectedName);
        Assert.assertEquals(actualId, expectedId);
    }

}
