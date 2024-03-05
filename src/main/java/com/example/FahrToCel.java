package com.example;

public class FahrToCel {
    public static float fahrtToCel(float f) {
        float c = (float) ((f-32) * 5.0/9.0);
        return Math.round(c);
    }

    public static float kelvinToCel(float kel) {
        return Math.round((float) (kel-273.15));
    }

    public static float kelvinToFahr(float kel) {
        return Math.round((float) ((kel-273.15) * (9/5) + 32));
    }

    public static void main(String[] args) {
        System.out.println("32 Fahrenheit = " + fahrtToCel(32) + " Celsius");
        System.out.println("212 Kelvin = " + kelvinToCel(310.15f) + " Celsius");
        System.out.println("300.1 Kelvin = " + kelvinToFahr(300.1f) + " Celsius");
    }
}
