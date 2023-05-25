import com.svalero.RomanNumerals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumeralsShouldTest {


    /** Nueva constante para representar el valor "1". */
    private static final int ONE = 1;
    /** Nueva constante para representar el valor "2". */
    private static final int TWO = 2;
    /** Nueva constante para representar el valor "3". */
    private static final int THREE = 3;
    /** Nueva constante para representar el valor "4". */
    private static final int FOUR = 4;
    /** Nueva constante para representar el valor "5". */
    private static final int FIVE = 5;
    /** Nueva constante para representar el valor "6". */
    private static final int SIX = 6;
    /** Nueva constante para representar el valor "7". */
    private static final int SEVEN = 7;
    /** Nueva constante para representar el valor "8". */
    private static final int EIGHT = 8;
    /** Nueva constante para representar el valor "9". */
    private static final int NINE = 9;
    /** Nueva constante para representar el valor "12". */
    private static final int TWELVE = 12;
    /** Nueva constante para representar el valor "15". */
    private static final int FIFTEEN = 15;
    /** Nueva constante para representar el valor "17". */
    private static final int SEVENTEEN = 17;
    /** Nueva constante para representar el valor "21". */
    private static final int TWENTYONE = 21;
    /** Nueva constante para representar el valor "25". */
    private static final int TWENTYFIVE = 25;
    /** Nueva constante para representar el valor "32". */
    private static final int THIRTYTWO = 32;
    /** Nueva constante para representar el valor "44". */
    private static final int FOURTYFOUR = 44;
    /** Nueva constante para representar el valor "52". */
    private static final int FIFTYTWO = 52;
    /** Nueva constante para representar el valor "67". */
    private static final int SIXTYSEVEN = 67;
    /** Nueva constante para representar el valor "78". */
    private static final int SEVENTYEIGHT = 78;
    /** Nueva constante para representar el valor "86". */
    private static final int EIGHTYSIX = 86;
    /** Nueva constante para representar el valor "100". */
    private static final int ONEHUNDRED = 100;
    /** Nueva constante para representar el valor "112". */
    private static final int ONEHUNDREDTWELVE = 112;
    /** Nueva constante para representar el valor "150". */
    private static final int ONEHUNDREDANDFIFTY = 150;
    /** Nueva constante para representar el valor "200". */
    private static final int TWOHUNDRED = 200;
    /** Nueva constante para representar el valor "310". */
    private static final int THREEHUNDREDANDTEN = 310;
    /** Nueva constante para representar el valor "500". */
    private static final int FIVEHUNDRED = 500;
    /** Nueva constante para representar el valor "700". */
    private static final int SEVENHUNDRED = 700;
    /** Nueva constante para representar el valor "772". */
    private static final int SEVENHUNDREDSEVENTYTWO = 772;
    /** Nueva constante para representar el valor "815". */
    private static final int EIGHTHUNDREDFIFTEEN = 815;
    /** Nueva constante para representar el valor "950". */
    private static final int NINEHUNDREDANDFIFTY = 950;
    /** Nueva constante para representar el valor "1000". */
    private static final int ONETHOUSAND = 1000;
    /** Nueva constante para representar el valor "1153". */
    private static final int ONETONEHFIFTYTHREE = 1153;
    /** Nueva constante para representar el valor "1310". */
    private static final int ONETTHREEHTEN = 1310;
    /** Nueva constante para representar el valor "1450". */
    private static final int ONETFOURHFIFTY = 1450;
    /** Nueva constante para representar el valor "1573". */
    private static final int ONETFIVEHSEVENTYTHREE = 1573;
    /** Nueva constante para representar el valor "1736". */
    private static final int ONETSEVENHTHIRTYSIX = 1736;
    /** Nueva constante para representar el valor "1890". */
    private static final int ONETEIGHTHNINETY = 1890;
    /** Nueva constante para representar el valor "1920". */
    private static final int ONETNINEHTWENTY = 1920;
    /** Nueva constante para representar el valor "2000". */
    private static final int TWOTHOUSAND = 2000;
    /** Nueva constante para representar el valor "2183". */
    private static final int TWOTONEHEIGHTYTHREE = 2183;
    /** Nueva constante para representar el valor "2292". */
    private static final int TWOTTWOHNINETYTWO = 2292;
    /** Nueva constante para representar el valor "2425". */
    private static final int TWOTFOURHTWENTYFIVE = 2425;
    /** Nueva constante para representar el valor "2555". */
    private static final int TWOTFIVEHFIFTYFIVE = 2555;
    /** Nueva constante para representar el valor "2743". */
    private static final int TWOTSEVENHFOURTYTHREE = 2743;
    /** Nueva constante para representar el valor "2901". */
    private static final int TWOTNINEHANDONE = 2901;
    /** Nueva constante para representar el valor "3000". */
    private static final int THREETHOUSAND = 3000;


    /** TDD. */
    @Test
    public void testRomanConvert() {


        assertEquals("I", RomanNumerals.convertRoman(ONE));
        assertEquals("II", RomanNumerals.convertRoman(TWO));
       assertEquals("III", RomanNumerals.convertRoman(THREE));
        assertEquals("IV", RomanNumerals.convertRoman(FOUR));
        assertEquals("V", RomanNumerals.convertRoman(FIVE));
       assertEquals("VI", RomanNumerals.convertRoman(SIX));
        assertEquals("VII", RomanNumerals.convertRoman(SEVEN));
        assertEquals("VIII", RomanNumerals.convertRoman(EIGHT));
       assertEquals("IX", RomanNumerals.convertRoman(NINE));
        assertEquals("XII", RomanNumerals.convertRoman(TWELVE));
        assertEquals("XV", RomanNumerals.convertRoman(FIFTEEN));
        assertEquals("XVII", RomanNumerals.convertRoman(SEVENTEEN));
        assertEquals("XXI", RomanNumerals.convertRoman(TWENTYONE));
       assertEquals("XXV", RomanNumerals.convertRoman(TWENTYFIVE));
       assertEquals("XXXII", RomanNumerals.convertRoman(THIRTYTWO));
       assertEquals("XLIV", RomanNumerals.convertRoman(FOURTYFOUR));
        assertEquals("LII", RomanNumerals.convertRoman(FIFTYTWO));
        assertEquals("LXVII", RomanNumerals.convertRoman(SIXTYSEVEN));
        assertEquals("LXXVIII", RomanNumerals.convertRoman(SEVENTYEIGHT));
       assertEquals("LXXXVI", RomanNumerals.convertRoman(EIGHTYSIX));
       assertEquals("C", RomanNumerals.convertRoman(ONEHUNDRED));
        assertEquals("CXII", RomanNumerals.convertRoman(ONEHUNDREDTWELVE));
       assertEquals("CL", RomanNumerals.convertRoman(ONEHUNDREDANDFIFTY));
        assertEquals("CC", RomanNumerals.convertRoman(TWOHUNDRED));
        assertEquals("CCCX", RomanNumerals.convertRoman(THREEHUNDREDANDTEN));
        assertEquals("D", RomanNumerals.convertRoman(FIVEHUNDRED));
        assertEquals("DCC", RomanNumerals.convertRoman(SEVENHUNDRED));
       assertEquals("DCCLXXII",
               RomanNumerals.convertRoman(SEVENHUNDREDSEVENTYTWO));
        assertEquals("DCCCXV", RomanNumerals.convertRoman(EIGHTHUNDREDFIFTEEN));
        assertEquals("CML", RomanNumerals.convertRoman(NINEHUNDREDANDFIFTY));
        assertEquals("M", RomanNumerals.convertRoman(ONETHOUSAND));
        assertEquals("MCLIII", RomanNumerals.convertRoman(ONETONEHFIFTYTHREE));
        assertEquals("MCCCX", RomanNumerals.convertRoman(ONETTHREEHTEN));
       assertEquals("MCDL",
               RomanNumerals.convertRoman(ONETFOURHFIFTY));
       assertEquals("MDLXXIII",
               RomanNumerals.convertRoman(ONETFIVEHSEVENTYTHREE));
        assertEquals("MDCCXXXVI",
                RomanNumerals.convertRoman(ONETSEVENHTHIRTYSIX));
        assertEquals("MDCCCXC",
                RomanNumerals.convertRoman(ONETEIGHTHNINETY));
       assertEquals("MCMXX",
               RomanNumerals.convertRoman(ONETNINEHTWENTY));
        assertEquals("MM",
                RomanNumerals.convertRoman(TWOTHOUSAND));
        assertEquals("MMCLXXXIII",
                RomanNumerals.convertRoman(TWOTONEHEIGHTYTHREE));
       assertEquals("MMCCXCII",
               RomanNumerals.convertRoman(TWOTTWOHNINETYTWO));
       assertEquals("MMCDXXV",
               RomanNumerals.convertRoman(TWOTFOURHTWENTYFIVE));
       assertEquals("MMDLV",
               RomanNumerals.convertRoman(TWOTFIVEHFIFTYFIVE));
        assertEquals("MMDCCXLIII",
                RomanNumerals.convertRoman(TWOTSEVENHFOURTYTHREE));
       assertEquals("MMCMI",
               RomanNumerals.convertRoman(TWOTNINEHANDONE));
        assertEquals("MMM",
                RomanNumerals.convertRoman(THREETHOUSAND));





    }
}
