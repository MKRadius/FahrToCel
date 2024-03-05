package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FahrToCelTest {

    @Test
    public void testFahrtToCel() {
        assertEquals(0, FahrToCel.fahrtToCel(32));
        assertEquals(100, FahrToCel.fahrtToCel(212));
        assertEquals(37, FahrToCel.fahrtToCel(98.6f));
    }

    @Test
    public void testKelvintoCel() {
        assertEquals(0, FahrToCel.kelvinToCel(273.15f));
        assertEquals(100, FahrToCel.kelvinToCel(373.15f));
        assertEquals(37, FahrToCel.kelvinToCel(310.15f));
    }

    @Test
    public void testKelvintoFahr() {
        assertEquals(59.0, FahrToCel.kelvinToFahr(300.1f));
    }
}
