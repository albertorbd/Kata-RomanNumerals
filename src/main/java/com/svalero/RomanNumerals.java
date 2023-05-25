package com.svalero;

//Clase que convierte los números enteros a romanos

public final class RomanNumerals {

    /**
     * Representación de los dígitos del 1 al 9 en números romanos.
     */
    private static final String[] UNITS = {"", "I", "II", "III", "IV",
            "V", "VI", "VII", "VIII", "IX"};


    /**
     * Representación de las decenas en números romanos.
     */
    private static final String[] TENS = {"", "X", "XX",
            "XXX", "XL", "L",
            "LX", "LXX", "LXXX", "XC"};


    /**
     * Representación de las centenas en números romanos.
     */
    private static final String[] HUNDREDS = {"", "C",
            "CC", "CCC",
            "CD", "D", "DC", "DCC",
            "DCCC", "CM"};

    /**
     * Representación de los millares en números romanos.
     */
    private static final String[] THOUSANDS = {"", "M", "MM", "MMM"};

    /**
     * Representación de los millares en números romanos.
     */
    private RomanNumerals() { }
        /**
        * Nueva constante para representar el valor "10"
         */
        private static final int TEN = 10;
        /**
        * Nueva constante para representar el valor "100"
        */
        private static final int HUNDRED = 100;
        /**
        * Nueva constante para representar el valor "1000"
        */
        private static final int THOUSAND = 1000;
        /**
        * Nueva constante para representar el valor "3000"
        */
        private static final int THREETHOUSAND = 3000;


    public static String convertRoman(final int entero) {

        if (entero < 1 || entero > THREETHOUSAND) {
            throw new IllegalArgumentException("El número debe estar "
                    + "entre 1 y 3000");
        }

       final int unit = entero % TEN;
       final int ten = (entero / TEN) % TEN;
       final int hundred = (entero / HUNDRED) % TEN;
       final int thousand = entero / THOUSAND;

        return THOUSANDS[thousand] + HUNDREDS[hundred]
                + TENS[ten] + UNITS[unit];

    }

}
