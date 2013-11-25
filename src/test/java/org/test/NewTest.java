package org.test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Unit test for simple TestngListener.
 */
@Listeners(TestngListener.class)
public class NewTest

{


    @Test
    public void newTest1()
    {
       System.out.println("newTest1");
    }

    @Test
    public void newTest2()
    {
        System.out.println("newTest2");
    }
}
