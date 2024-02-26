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
        assertEquals(0, FahrtToCel.kelvintoCel(273.15f), DELTA);
        assertEquals(100, FahrtToCel.kelvintoCel(373.15f), DELTA);
        assertEquals(37, FahrtToCel.kelvintoCel(310.15f), DELTA);
    }
}
