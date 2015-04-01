package com.comcast.interview.taxperson;

import org.junit.Before;
import org.junit.Test;


public class SampleJunitTest {

    public CalculateTax calculateTax;

    @Before
    public void setup() throws Exception{
        calculateTax = new CalculateTax();
    }

    @Test
    public void necessaryItemTest() throws ZeroLessThanZeroException {
        System.out.println(calculateTax.calculate(100,false));
    }

    @Test
    public void luxuryItemTest() throws ZeroLessThanZeroException {
        System.out.println(calculateTax.calculate(100,true));
    }

}