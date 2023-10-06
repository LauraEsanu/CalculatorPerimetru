package com.itfactory;


import com.itfactory.Figuri.Triunghi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriunghiTest {

    @Test
    public void testPerimetruTriunghi() {
        Triunghi triunghi = new Triunghi(5, 5, 5);
        double expected = 15.0;
        double actual = triunghi.perimetrul();
        assertEquals(expected, actual, 0.0);
    }
}
