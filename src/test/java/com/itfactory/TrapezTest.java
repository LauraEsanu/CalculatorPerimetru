package com.itfactory;

import com.itfactory.Figuri.Trapez;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrapezTest {

    @Test
    public void testPerimetruTrapez() {
        Trapez trapez = new Trapez(4, 3, 2, 2);
        double expected = 11.0;
        double actual = trapez.perimetrul();
        assertEquals(expected, actual, 0.0);
    }
}
