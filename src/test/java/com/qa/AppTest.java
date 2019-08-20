package com.qa;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void divisibleTest(){
        App app = new App();
        assertTrue("Expected: True", app.divisible(5,10));
    }
}