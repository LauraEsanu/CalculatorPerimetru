package com.itfactory;

import com.itfactory.Figuri.Paralelogram;
import com.itfactory.Figuri.Patrat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParalelogramTest {

    @Test
    public void testPerimetruParalelogram() {
        Paralelogram paralelogram = new Paralelogram(4, 5);
        double expected = 18.0;
        double actual = paralelogram.perimetrul();
        assertEquals(expected, actual, 0.0);
    }
}
