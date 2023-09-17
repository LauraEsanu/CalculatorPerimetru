package com.itfactory;

import com.itfactory.Figuri.Patrat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PatratTest {


    @Test
    public void testPerimetruPatrat() {
        Patrat patrat = new Patrat(5.0);
        double expected = 20.0;
        double actual = patrat.perimetrul();
        assertEquals(expected,actual,0.0);


    }
}
