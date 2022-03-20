package com.sud.sonar.tests;

import com.sud.sonar.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        Integer sum = calculator.add(1,2);
        Assert.assertEquals(sum, 3, "Sum of 1 and 2");
    }
}
