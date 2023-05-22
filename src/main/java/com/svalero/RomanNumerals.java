package com.svalero;

public class RomanNumerals {
    public static String convertRoman(int entero) {
        String romanNumber = null;

        if (entero == 1) {
            romanNumber = "I";
        }
        if (entero == 2) {
            romanNumber = "II";
        }
        return romanNumber;
    }

}
