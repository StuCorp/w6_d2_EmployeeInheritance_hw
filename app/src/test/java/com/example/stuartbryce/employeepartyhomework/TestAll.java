package com.example.stuartbryce.employeepartyhomework;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * Created by stuartbryce on 2017-06-20.
 */

public class TestAll {

    Engineer engineer;

    @Before
    public void before(){
        engineer = new Engineer(5, "steve", "whatever", 30000.00);
    }

    @Test
    public void testGetName(){
        assertEquals("steve", engineer.getName());
    }

    @Test
    public void testSetName(){
        engineer.setName("pete");
        assertEquals("pete", engineer.getName());
    }

    @Test
    public void testNameGuard(){
        engineer.setName("");
        assertEquals("steve", engineer.getName());
        engineer.setName(null);
        assertEquals("steve", engineer.getName());
    }

    @Test
    public void testSalaryIncrease(){
        engineer.raiseSalary(500);
        assertEquals(30500.00, engineer.getSalary(), 0.01);
    }

    @Test
    public void testSalaryGuard(){
        engineer.raiseSalary(-500);
        assertEquals(30000.00, engineer.getSalary(), 0.01);

    }


}
