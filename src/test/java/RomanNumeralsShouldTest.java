import com.svalero.RomanNumerals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsShouldTest {


    @Test
    public void testRomanConvert() {
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I", romanNumerals.convertRoman(1));
        assertEquals("II", romanNumerals.convertRoman(2));
       assertEquals("III", romanNumerals.convertRoman(3));
        assertEquals("IV", romanNumerals.convertRoman(4));
        assertEquals("V", romanNumerals.convertRoman(5));
       assertEquals("VI", romanNumerals.convertRoman(6));
        assertEquals("VII", romanNumerals.convertRoman(7));
        assertEquals("VIII", romanNumerals.convertRoman(8));
       assertEquals("IX", romanNumerals.convertRoman(9));
        assertEquals("XII", romanNumerals.convertRoman(12));
        assertEquals("XV", romanNumerals.convertRoman(15));
        assertEquals("XVII", romanNumerals.convertRoman(17));
        assertEquals("XXI", romanNumerals.convertRoman(21));
       assertEquals("XXV", romanNumerals.convertRoman(25));
       assertEquals("XXXII", romanNumerals.convertRoman(32));
       assertEquals("XLIV", romanNumerals.convertRoman(44));
        assertEquals("LII", romanNumerals.convertRoman(52));
        assertEquals("LXVII", romanNumerals.convertRoman(67));
        assertEquals("LXXVIII", romanNumerals.convertRoman(78));
       assertEquals("LXXXVI", romanNumerals.convertRoman(86));
       assertEquals("C", romanNumerals.convertRoman(100));
        assertEquals("CXII", romanNumerals.convertRoman(112));
       assertEquals("CL", romanNumerals.convertRoman(150));
        assertEquals("CC", romanNumerals.convertRoman(200));
        assertEquals("CCCX", romanNumerals.convertRoman(310));
        assertEquals("D", romanNumerals.convertRoman(500));
        assertEquals("DCC", romanNumerals.convertRoman(700));
       assertEquals("DCCLXXII", romanNumerals.convertRoman(772));
        assertEquals("DCCCXV", romanNumerals.convertRoman(815));
        assertEquals("CML", romanNumerals.convertRoman(950));
        assertEquals("M", romanNumerals.convertRoman(1000));
        assertEquals("MCLIII", romanNumerals.convertRoman(1153));
        assertEquals("MCCCX", romanNumerals.convertRoman(1310));
       assertEquals("MCDL", romanNumerals.convertRoman(1450));
       assertEquals("MDLXXIII", romanNumerals.convertRoman(1573));
        assertEquals("MDCCXXXVI", romanNumerals.convertRoman(1736));
        assertEquals("MDCCCXC", romanNumerals.convertRoman(1890));
       assertEquals("MCMXX", romanNumerals.convertRoman(1920));
        assertEquals("MM", romanNumerals.convertRoman(2000));
        assertEquals("MMCLXXXIII", romanNumerals.convertRoman(2183));
       assertEquals("MMCCXCII", romanNumerals.convertRoman(2292));
       assertEquals("MMCDXXV", romanNumerals.convertRoman(2425));
       assertEquals("MMDLV", romanNumerals.convertRoman(2555));
        assertEquals("MMDCCXLIII", romanNumerals.convertRoman(2743));
       assertEquals("MMCMI", romanNumerals.convertRoman(2901));
        assertEquals("MMM", romanNumerals.convertRoman(3000));





    }
}
