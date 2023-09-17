package com.itfactory;

import com.itfactory.Figuri.Dreptunghi;
import com.itfactory.Figuri.Patrat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DreptunghiTest {

    @Test
    public void testPerimetruDreptunghi() {
        Dreptunghi dreptunghi = new Dreptunghi(4, 3);
        double expected = 14.0;
        double actual = dreptunghi.perimetrul();
        assertEquals(expected, actual, 0.0);
    }
}
