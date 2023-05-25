package com.svalero;

//Clase que convierte los números enteros a romanos

public final class RomanNumerals {

    private static final String[] UNITS = {"", "I", "II", "III", "IV", "V", "VI",
            "VII", "VIII", "IX"};
    private static final String[] TENS = {"", "X", "XX", "XXX", "XL",
            "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] HUNDREDS = {"", "C", "CC", "CCC",
            "CD", "D", "DC", "DCC", "DCCC", "CM"};

    private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};


    public static String convertRoman( final int entero) {

        int diez = 10;
        int cien = 100;
        int mil = 1000;
        if (entero < 1 || entero > 3000) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 3000");
        }

       final int unit = entero % diez;
       final int ten = (entero / diez) % diez;
       final int hundred = (entero / cien) % diez;
       final int thousand = entero / mil;

        return THOUSANDS[thousand] + HUNDREDS[hundred] +
                TENS[ten] + UNITS[unit];

    }

}
