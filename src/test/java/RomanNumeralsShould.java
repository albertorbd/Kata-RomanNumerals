import com.svalero.RomanNumerals;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;

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
        Assert.assertEquals("X", romanNumerals.convertRoman(10));
    }
}
