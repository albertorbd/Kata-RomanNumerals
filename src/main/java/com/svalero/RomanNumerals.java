package com.svalero;

//Clase que convierte los números enteros a romanos

public final class RomanNumerals {
    //Unidades

    private static final String[] UNITS = {"", "I", "II", "III", "IV",
            "V", "VI", "VII", "VIII", "IX"};

    //Decenas
    private static final String[] TENS = {"", "X", "XX", "XXX", "XL",
            "L", "LX", "LXX", "LXXX", "XC"};
    //Centenas
    private static final String[] HUNDREDS = {"", "C", "CC", "CCC",
            "CD", "D", "DC", "DCC", "DCCC", "CM"};

    //Millares
    private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};

    private RomanNumerals() {

    }
        // Constructor privado para evitar la instanciación de la clase
        private static final int TEN = 10; // Nueva constante para representar el valor "10"
        private static final int HUNDRED = 100; // Nueva constante para representar el valor "10"
        private static final int THOUSAND = 1000; // Nueva constante para representar el valor "10"

    public static String convertRoman(final int entero) {

        int cien = 100;
        int mil = 1000;
        if (entero < 1 || entero > 3000) {
            throw new IllegalArgumentException("El número debe estar " +
                    "entre 1 y 3000");
        }

       final int unit = entero % TEN;
       final int ten = (entero / TEN) % TEN;
       final int hundred = (entero / HUNDRED) % TEN;
       final int thousand = entero / THOUSAND;

        return THOUSANDS[thousand] + HUNDREDS[hundred]
                +TENS[ten] + UNITS[unit];

    }

}
