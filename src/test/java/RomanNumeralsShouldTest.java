import com.svalero.RomanNumerals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsShouldTest {


    @Test
    public void testRomanConvert() {


        assertEquals("I", RomanNumerals.convertRoman(1));
        assertEquals("II", RomanNumerals.convertRoman(2));
       assertEquals("III", RomanNumerals.convertRoman(3));
        assertEquals("IV", RomanNumerals.convertRoman(4));
        assertEquals("V", RomanNumerals.convertRoman(5));
       assertEquals("VI", RomanNumerals.convertRoman(6));
        assertEquals("VII", RomanNumerals.convertRoman(7));
        assertEquals("VIII", RomanNumerals.convertRoman(8));
       assertEquals("IX", RomanNumerals.convertRoman(9));
        assertEquals("XII", RomanNumerals.convertRoman(12));
        assertEquals("XV", RomanNumerals.convertRoman(15));
        assertEquals("XVII", RomanNumerals.convertRoman(17));
        assertEquals("XXI", RomanNumerals.convertRoman(21));
       assertEquals("XXV", RomanNumerals.convertRoman(25));
       assertEquals("XXXII", RomanNumerals.convertRoman(32));
       assertEquals("XLIV", RomanNumerals.convertRoman(44));
        assertEquals("LII", RomanNumerals.convertRoman(52));
        assertEquals("LXVII", RomanNumerals.convertRoman(67));
        assertEquals("LXXVIII", RomanNumerals.convertRoman(78));
       assertEquals("LXXXVI", RomanNumerals.convertRoman(86));
       assertEquals("C", RomanNumerals.convertRoman(100));
        assertEquals("CXII", RomanNumerals.convertRoman(112));
       assertEquals("CL", RomanNumerals.convertRoman(150));
        assertEquals("CC", RomanNumerals.convertRoman(200));
        assertEquals("CCCX", RomanNumerals.convertRoman(310));
        assertEquals("D", RomanNumerals.convertRoman(500));
        assertEquals("DCC", RomanNumerals.convertRoman(700));
       assertEquals("DCCLXXII", RomanNumerals.convertRoman(772));
        assertEquals("DCCCXV", RomanNumerals.convertRoman(815));
        assertEquals("CML", RomanNumerals.convertRoman(950));
        assertEquals("M", RomanNumerals.convertRoman(1000));
        assertEquals("MCLIII", RomanNumerals.convertRoman(1153));
        assertEquals("MCCCX", RomanNumerals.convertRoman(1310));
       assertEquals("MCDL", RomanNumerals.convertRoman(1450));
       assertEquals("MDLXXIII", RomanNumerals.convertRoman(1573));
        assertEquals("MDCCXXXVI", RomanNumerals.convertRoman(1736));
        assertEquals("MDCCCXC", RomanNumerals.convertRoman(1890));
       assertEquals("MCMXX", RomanNumerals.convertRoman(1920));
        assertEquals("MM", RomanNumerals.convertRoman(2000));
        assertEquals("MMCLXXXIII", RomanNumerals.convertRoman(2183));
       assertEquals("MMCCXCII", RomanNumerals.convertRoman(2292));
       assertEquals("MMCDXXV", RomanNumerals.convertRoman(2425));
       assertEquals("MMDLV", RomanNumerals.convertRoman(2555));
        assertEquals("MMDCCXLIII", RomanNumerals.convertRoman(2743));
       assertEquals("MMCMI", RomanNumerals.convertRoman(2901));
        assertEquals("MMM", RomanNumerals.convertRoman(3000));





    }
}
