package org.test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Unit test for simple TestngListener.
 */
@Listeners(TestngListener.class)
public class AppTest 

{


    @Test
    public void testApp()
    {
       System.out.println("testApp");
    }

    @Test
    public void testApp2()
    {
        System.out.println("testApp2");
    }
}
