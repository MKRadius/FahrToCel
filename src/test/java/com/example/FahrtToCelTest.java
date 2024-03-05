package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FahrtToCelTest {
    private static final double DELTA = 0.001;

    @Test
    public void testFahrtToCel() {
        assertEquals(0, FahrtToCel.fahrtToCel(32));
        assertEquals(100, FahrtToCel.fahrtToCel(212));
        assertEquals(37, FahrtToCel.fahrtToCel(98.6f));
    }

    @Test
    public void testKelvintoCel() {
        assertEquals(0, FahrtToCel.kelvinToCel(273.15f), DELTA);
        assertEquals(100, FahrtToCel.kelvinToCel(373.15f), DELTA);
        assertEquals(37, FahrtToCel.kelvinToCel(310.15f), DELTA);
    }

    @Test
    public void testKelvintoFahr() {
        assertEquals(59.0, FahrtToCel.kelvinToFahr(300.1f));
    }
}
