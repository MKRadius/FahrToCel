package com.example;

public class FahrtToCel {
    public static float fahrtToCel(float f) {
        float c = (float) ((f-32) * 5.0/9.0);
        return Math.round(c);
    }

    public static float kelvinToCel(float kel) {
        return (float) (kel-273.15);
    }

    public static float kelvinToFahr(float kel) {
        return Math.round((float) ((kel-273.15) * (9/5) + 32));
    }
}
