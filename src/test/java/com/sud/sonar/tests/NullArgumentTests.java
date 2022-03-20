package com.sud.sonar.tests;

import com.sud.sonar.NullArgument;
import com.sud.sonar.model.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NullArgumentTests {

    @Test
    public void personTest(){
        Person person = new Person("Sud", "23");
        boolean isTrue = new NullArgument().containsString(person, "sud");
        Assert.assertTrue(isTrue, "Should be matching the value 'sud'.");
    }


}
