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
        if (entero == 3) {
            romanNumber = "III";
        }
        if (entero == 4) {
            romanNumber = "IV";
        }
        if (entero == 5) {
            romanNumber = "V";
        }
        if (entero == 6) {
            romanNumber = "VI";
        }
        if (entero == 7) {
            romanNumber = "VII";
        }
        if (entero == 8) {
            romanNumber = "VIII";
        }
        if (entero == 9) {
            romanNumber = "IX";
        }
        if (entero == 10) {
            romanNumber = "X";
        }
        return romanNumber;
    }

}
