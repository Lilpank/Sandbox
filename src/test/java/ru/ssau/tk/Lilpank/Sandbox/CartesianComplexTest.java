package ru.ssau.tk.Lilpank.Sandbox;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CartesianComplexTest {

    @Test
    public void testRe() {
        Complex complex = new CartesianComplex(0,0);
        assertEquals(complex.re(),0);
    }
}