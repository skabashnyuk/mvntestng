package org.test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Unit test for simple TestngListener.
 */
@Listeners(TestngListener.class)
public class ThirdTest

{


    @Test
    public void testThirdApp()
    {
       System.out.println("testThirdApp");
    }

    @Test
    public void testApp3()
    {
        System.out.println("testApp3");
    }
}
