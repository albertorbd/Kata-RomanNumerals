package com.svalero;

public class RomanNumerals {

    private static final String[] Units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] Tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] Hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

    private static final String[] Thousands = {"", "M", "MM", "MMM"};

    public static String convertRoman(int entero) {
        if (entero < 1 || entero > 1000) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 1000");
        }

        int unit = entero % 10;
        int ten = (entero / 10) % 10;
        int hundred = (entero / 100) % 10;
        int thousand = entero / 1000;

        return Thousands[thousand] + Hundreds[hundred] + Tens[ten] + Units[unit];

    }

}
