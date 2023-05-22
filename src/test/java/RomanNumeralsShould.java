import com.svalero.RomanNumerals;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RomanNumeralsShould {

    RomanNumerals romanNumerals = new RomanNumerals();
    @Test
    public void testRomanConvert() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assert.assertEquals("I", romanNumerals.convertRoman(1));
        Assert.assertEquals("II", romanNumerals.convertRoman(2));
        Assert.assertEquals("III", romanNumerals.convertRoman(3));
        Assert.assertEquals("IV", romanNumerals.convertRoman(4));
        Assert.assertEquals("V", romanNumerals.convertRoman(5));
        Assert.assertEquals("VI", romanNumerals.convertRoman(6));
        Assert.assertEquals("VII", romanNumerals.convertRoman(7));
        Assert.assertEquals("VIII", romanNumerals.convertRoman(8));
        Assert.assertEquals("IX", romanNumerals.convertRoman(9));
        Assert.assertEquals("XII", romanNumerals.convertRoman(12));
        Assert.assertEquals("XV", romanNumerals.convertRoman(15));
        Assert.assertEquals("XVII", romanNumerals.convertRoman(17));
        Assert.assertEquals("XXI", romanNumerals.convertRoman(21));
        Assert.assertEquals("XXV", romanNumerals.convertRoman(25));
        Assert.assertEquals("XXXII", romanNumerals.convertRoman(32));
        Assert.assertEquals("XLIV", romanNumerals.convertRoman(44));
        Assert.assertEquals("LII", romanNumerals.convertRoman(52));
        Assert.assertEquals("LXVII", romanNumerals.convertRoman(67));
        Assert.assertEquals("LXXVIII", romanNumerals.convertRoman(78));
        Assert.assertEquals("LXXXVI", romanNumerals.convertRoman(86));
        Assert.assertEquals("C", romanNumerals.convertRoman(100));

    }
}
